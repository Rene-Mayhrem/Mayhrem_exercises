public class App {

    public static boolean isPalindrome (String word) {
        //? convert string to char array
        char[] characters = word.toCharArray();
        //? create a new char array
        char[] reversedCharacters = new char[characters.length];
        int aux = 0; //? auxiliar variable to reverse string
        for(int i = characters.length-1; i >= 0; i--) {
            //? assign reversed valued
            reversedCharacters[aux] = characters[i];
            aux++;
        }
        //? convert array char to string
        String reversedWord = new String(reversedCharacters).toLowerCase();
        word = word.toLowerCase();
        return (word.equals(reversedWord));
    }
    public static void main(String[] args) throws Exception {
        
    }
}
