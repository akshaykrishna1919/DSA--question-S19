
package Dsa;






/* 6. Intersection of Two Arrays
❓ Question

Find the common elements between two arrays.

Example:
[1,2,2,3] and [2,2,4] → Output: [2]

 */


import java.util.HashSet;

public class IntersectionArray {
    public static void main(String[] args) {
        int arr1[] = {1,2,2,3};
        int arr2[] = {2,2,4};

        HashSet<Integer> set1 = new HashSet<>();
        HashSet<Integer> result = new HashSet<>();

        for(int num : arr1){
            set1.add(num);
        }

        for(int num : arr2){
            if(set1.contains(num)){
                result.add(num);
            }
        }

        System.out.println(result);
    }
}