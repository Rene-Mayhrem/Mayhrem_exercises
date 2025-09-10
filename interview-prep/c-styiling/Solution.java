

public class Solution {
    public void reverseString (char[] characters) {
        //? Create left and right pointers
        int left = 0; // Initial char
        int right = 0;
        while (right < characters.length && characters[right] != '\0') right++;
        right--;
        //? Traverse the array
        while (left < right) { 
            char temp = characters[left];
            characters[left] = characters[right];
            characters[right] = temp;
            left++;
            right--;
        }
    }
}
