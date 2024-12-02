import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
  public static int getServedBuildings (List<Integer> buildingCount, List<Integer> routerLocation, List<Integer> routerRange) {
    int served = 0;
    List<Integer> routerCount = new ArrayList<>(buildingCount.size()); for (int i = 0; i < buildingCount.size(); i++) routerCount.add(0);
    //? Iterate through the router locations
    for (int i = 0; i < routerLocation.size(); i++) {
      int n = routerRange.get(i);
      System.out.println("Router location -> "+routerLocation.get(i));
      while (n > 0) {
        System.out.println(n);
        int routerLocationIndex = routerLocation.get(i) - 1;
        routerCount.set(routerLocationIndex, routerCount.get(i) + 1 );
        System.out.println("Real building"+routerLocationIndex);
        if (routerLocationIndex - n >= 0) {
          // System.out.println("->B"+(routerLocation.get(i - 1) - n));
          routerCount.set(routerLocationIndex - n, routerCount.get(routerLocationIndex - n) + 1);
        }
        if (routerLocationIndex + n < routerCount.size()) {
          // System.out.println("->A"+(routerLocation.get(i - 1) + n));
          routerCount.set(routerLocationIndex + n, routerCount.get(routerLocationIndex + n) + 1);
        }
        n--;
      }
    }
    for (int i = 0; i < routerCount.size(); i++) {
      if (routerCount.get(i) >= buildingCount.get(i)) {
        served++;
      }
    }
    System.out.println(routerCount);
    System.out.println(buildingCount);
    return served;
  }
}
