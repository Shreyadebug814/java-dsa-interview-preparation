package arrays;

public class FindLargest {
     public static void main(String[] args){
//     Input array
         int[] arr = {10,5,20,8,15};
//         Assume first element is the largest
         int largest = arr[0];
//         Traverse the array  from index 1
         for(int i = 1; i<arr.length;i++){
//             compare current element with largest
             if(arr[i] > largest){
                 largest = arr[i];

             }
         }
         System.out.println("Largest element:"+ largest);
     }
}