import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Solution {
  public String destCity (List<List<String>> paths) {
    Map<String, List<String>> cities = new HashMap<>();
    for (List<String> path : paths) {

    }
    return "lol";
  }

  public String destinyCity (List<List<String>> paths) {
    Map<String, List<String>> cities = new HashMap<>();
    for (List<String> path : paths) {
      if (!cities.containsKey(path.get(1))) {
        cities.put(path.get(1), new ArrayList<>());
      }

      if (cities.containsKey(path.get(0))) {
        cities.get(path.get(0)).add(0, path.get(1));
      } else {
        List<String> visitedCities = Arrays.asList(path.get(1));
        cities.put(path.get(0), visitedCities);
      }
      
    }
    System.out.println(cities);
      for (Map.Entry<String, List<String>> city : cities.entrySet()) {
        System.out.println(city.getKey());
        if (city.getValue().isEmpty()) {
          return city.getKey();
        }
      }
    return "Not found";
  }
}
