package Dsa;

import java.util.HashSet;

public class FindDuplicate {
    public static void main(String[] args) {
        int arr[] = {1, 3, 4, 2, 3};

        HashSet<Integer> set = new HashSet<>();

        for(int num : arr){
            if(set.contains(num)){
                System.out.println("Duplicate: " + num);
                return;
            }
            set.add(num);
        }

        System.out.println("No Duplicate Found");
    }
}