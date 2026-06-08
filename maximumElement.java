

public class maximumElement {

    public static int findMax(int[] arr) {

        int max = arr[0];

        for (int num : arr) {
            if (num > max) {
                max = num;
            }
        }

        return max;
    }

    public static void main(String[] args) {

        int[] arr = {10, 45, 23, 67, 12};

        System.out.println("Maximum Element: " + findMax(arr));
    }
}
