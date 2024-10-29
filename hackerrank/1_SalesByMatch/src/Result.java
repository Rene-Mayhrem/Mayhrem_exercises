import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Result {
  public int sockMerchant (int n, List<Integer> arr) {
    Set<Integer> unpairedSocks = new HashSet<>();
    int pairedSocks = 0;
    for (int sock : arr) {
      if (unpairedSocks.contains(sock)) {
        pairedSocks++;
        unpairedSocks.remove(sock);
      } else {
        unpairedSocks.add(sock);
      }
    }
    return pairedSocks;
  }
}
