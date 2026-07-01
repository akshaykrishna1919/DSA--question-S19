

public class CountVowels {

    public static int countVowels(String str) {

        int count = 0;

        for (char ch : str.toLowerCase().toCharArray()) {

            if ("aeiou".indexOf(ch) != -1) {
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {

        System.out.println(countVowels("Programming"));
    }
}