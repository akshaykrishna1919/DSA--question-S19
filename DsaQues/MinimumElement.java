

public class MinimumElement {

    public static int findMin(int[] arr) {

        int min = arr[0];

        for (int num : arr) {

            if (num < min) {
                min = num;
            }
        }

        return min;
    }

    public static void main(String[] args) {

        int[] arr = {10, 5, 2, 15};

        System.out.println(findMin(arr));
    }
}