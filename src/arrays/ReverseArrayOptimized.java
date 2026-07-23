package arrays;

import java.util.Arrays;

public class ReverseArrayOptimized {
    public static void main(String[] args) {
        int[] arr = {10,20,30,40,50};
        int left = 0;
        int right = arr.length-1;
        while (left<right){
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            right--;
            left++;
        }
        System.out.println("Reversed array");
        System.out.println(Arrays.toString(arr));
    }
}
//If the interviewer asks:
//
//Which approach will you choose?
//
//You should answer:
//
//        "I will choose the optimized two-pointer approach because both approaches have the same time complexity O(n), but the optimized approach has better space complexity O(1) since it reverses the array in place without creating an extra array."



//
//If the interviewer asks:
//Why is the time complexity O(n) instead of O(n/2)?

//You can answer:
//        "The algorithm performs approximately n/2 swaps, but in Big-O notation constant factors are ignored. Since n/2 grows linearly with n, the time complexity is O(n)."




//
//Interview Answer
//
//Our reverse array algorithm performs approximately
//
//n/2
//
//swaps.
//
//Since Big-O ignores constant values like 1/2, we write:
//
//Time Complexity = O(n)


