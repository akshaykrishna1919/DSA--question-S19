package Dsa;

/*

✅ 3. Count Even and Odd Numbers
❓ Question

Count how many even and odd numbers are in an array.

Example:
[1,2,3,4,5] → Even: 2, Odd: 3

💡 Idea

👉 Use % 2 to check even/odd

*/

public class EvenOddCount {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};

        int even = 0, odd = 0;

        for(int num : arr){
            if(num % 2 == 0){
                even++;
            } else {
                odd++;
            }
        }

        System.out.println("Even: " + even);
        System.out.println("Odd: " + odd);
    }
}