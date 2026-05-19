package Dsa;


/*

❓ Question

Find the largest number in an array.

Example:
[3, 7, 2, 9, 5] → Output: 9

💡 Idea

👉 Compare each element and keep updating max

*/

public class LargestElement {
    public static void main(String[] args) {
        int arr[] = {3,7,2,9,5};
        
        int max = arr[0];
        
        for(int i=1; i<arr.length; i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
        
        System.out.println("Largest: " + max);
    }
}