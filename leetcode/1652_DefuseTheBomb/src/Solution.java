import java.util.Arrays;

public class Solution { 
  //?  
  public int[] decrypt(int[] code, int k) {
    int[] decryptedCode = code.clone();
    if (k > 0) {
      for (int i = 0; i < decryptedCode.length; i++) {
        int pointer = i + 1, aux = 0, sum = 0;
        if (pointer == decryptedCode.length - 1) pointer = 0;
        System.out.println("index -> "+i) ;
        while (aux < k) {
          if (pointer == decryptedCode.length) pointer = 0;
          System.out.println("pointer -> "+pointer);
          sum += code[pointer];
          pointer++;
          aux++;
        }
        decryptedCode[i] = sum;
      }
    } else if (k < 0) {
      for (int i = 0; i < decryptedCode.length; i++) {
        int aux = 0, pointer = i - 1,  sum = 0;
        if (pointer < 0) pointer = decryptedCode.length - 1;
        System.out.println("index -> "+i);
        while (aux > k) {
          if (pointer < 0) pointer = decryptedCode.length - 1;
          System.out.println("pointyer -> "+pointer);
          sum += code[pointer];
          pointer--;
          aux--;
        }
        decryptedCode[i] = sum;     
      }
    } else {
      Arrays.fill(decryptedCode, 0);
    }
    return decryptedCode;
  }
}
