package arrays;

import java.util.Arrays;

public class    FindLargestUsingLoopAndStreams {
    public static void main(String[] args){
        int[] arr = {10,5,20,8,15};
        int largestUsingLoop = findLargestUsingLoop(arr);
        System.out.println("Largest element using for loop :" + largestUsingLoop);
        int largestUsingStreams = findLargestUsingStreams(arr);
        System.out.println("Largest element using streams :" + largestUsingStreams);
    }

    private static  int findLargestUsingLoop(int[] arr) {
        if (arr == null || arr.length == 0) {
            throw new IllegalArgumentException("Array is empty");
        }

            int largest = arr[0];
            for (int i = 1; i < arr.length; i++) {
                if (arr[i] > largest) {
                    largest = arr[i];

                }
            }
            return largest;
    }

    private static int findLargestUsingStreams(int[] arr){
       int largestElement = Arrays.stream(arr).max().getAsInt();
       return largestElement;
    }
}


//Note:= Question:
//Find Largest Element
//
//Pattern Used:
//✅ Array Traversal (Linear Scan)
//
//Data Structure:
//Array
//
//Algorithm:
//Compare and Update
//
//Time Complexity:
//O(n)
//
//Space Complexity:
//O(1)
//
//Real Project:
//Find Highest Salary
//Find Maximum Order Amount
//Find Highest Marks
//
//Interview Level:
//Easy

//"I made the method static because it doesn't depend on any object-specific data or instance variables.
// It only processes the input array passed as a parameter. Since main() is also static,
// making the helper method static allows me to call it directly without creating an unnecessary object."




//An array is a data structure used to store multiple values of the same data type in a single variable.
// The elements are stored in contiguous memory locations,
// and each element can be accessed using its index. In Java, array indexing starts from 0."