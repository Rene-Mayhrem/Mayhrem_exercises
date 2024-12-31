import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Test {
  public int findMaxSize (List<Integer> skills) {
    Collections.sort(skills);
    int maxSize = 0;
    for (int i = 0; i < skills.size() - 1; i++) {
      int diff = Math.abs(skills.get(i) - skills.get(i + 1));
      int teamSize = 0;
      while (diff == 1 || diff == 0) {
        teamSize++;
      }
      maxSize = Math.max(maxSize, teamSize);
    }
    return maxSize;
  }

  public List<Integer> optimizeServerLoad(int[] serverCapacity, int[] serverLoad) {
    // Sort serverCapacity in ascending order
    Arrays.sort(serverCapacity);
    
    // Convert serverLoad to a List<Integer> and sort in descending order
    List<Integer> serverLoadList = new ArrayList<>();
    for (int load : serverLoad) {
      serverLoadList.add(load);
    }
    Collections.sort(serverLoadList, Collections.reverseOrder());
    
    return serverLoadList;
  }
}
