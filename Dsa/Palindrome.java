package Dsa;


/*

❓ Question

Check if a string is a palindrome (same forward & backward)

Example:
"madam" → true
"hello" → false

💡 Idea

👉 Compare characters from start and end

*/

public class Palindrome {
    public static void main(String[] args) {
        String str = "madam";
        boolean isPalindrome = true;

        for(int i=0; i<str.length()/2; i++){
            if(str.charAt(i) != str.charAt(str.length()-1-i)){
                isPalindrome = false;
                break;
            }
        }

        System.out.println(isPalindrome);
    }
}