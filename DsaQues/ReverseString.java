
public class ReverseString {

    public static String reverse(String str) {
        if (str == null || str.length() <= 1) return str;

        char[] arr = str.toCharArray();
        int left = 0, right = arr.length - 1;

        while (left < right) {
            swap(arr, left, right);
            left++;
            right--;
        }

        return new String(arr);
    }

    private static void swap(char[] arr, int i, int j) {
        char temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {
        System.out.println(reverse("hello"));
    }
}