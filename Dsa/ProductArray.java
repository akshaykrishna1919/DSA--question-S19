package Dsa;

/*

Given an array nums, return an array such that:
👉 output[i] = product of all elements except nums[i]

Constraint: ❌ No division allowed

Example:

nums = [1,2,3,4]
output = [24,12,8,6]
💡 Intuition (Important)

Instead of brute force O(n²), we use:

👉 Prefix product (left side)
👉 Suffix product (right side)

*/

public class ProductArray {
    public static int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] result = new int[n];

        result[0] = 1;

        // Left product
        for (int i = 1; i < n; i++) {
            result[i] = result[i - 1] * nums[i - 1];
        }

        // Right product
        int right = 1;
        for (int i = n - 1; i >= 0; i--) {
            result[i] = result[i] * right;
            right *= nums[i];
        }

        return result;
    }
}