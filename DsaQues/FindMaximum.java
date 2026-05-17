

public class FindMaximum {

    public static int findMax(int[] arr) {

        if (arr == null || arr.length == 0) {
            return -1;
        }

        int max = arr[0];

        for (int num : arr) {

            if (num > max) {
                max = num;
            }
        }

        return max;
    }

    public static void main(String[] args) {

        int[] arr = {3, 7, 2, 9, 5};

        int result = findMax(arr);

        System.out.println("Maximum Element: " + result);
    }
}
