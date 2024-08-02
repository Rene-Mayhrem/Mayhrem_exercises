import java.util.HashMap;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
    }
}

class Solution {

    private HashMap<String, Integer> romanSymbol = new HashMap<>();
    
    public Solution () {
        this.romanSymbol.put("I", 1);
        this.romanSymbol.put("V", 5);
        this.romanSymbol.put("X", 10);
        this.romanSymbol.put("L", 50);
        this.romanSymbol.put("C", 100);
        this.romanSymbol.put("D", 500);
        this.romanSymbol.put("M", 1000);
    }

    public int romanToInt (String s) {
        
        return 0;
    }
}