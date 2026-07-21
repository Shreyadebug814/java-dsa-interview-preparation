package arrays;

public class FindSecondLargest {
    public static void main(String[] args){
        int[] arr = {10,5,20,8,15};
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
        for (int i=0;i< arr.length;i++){
            if (arr[i]> largest){
                secondLargest = largest;
                largest = arr[i];
            } else if (arr[i]>secondLargest && arr[i]!=largest) {
                secondLargest = arr[i];
            }
        }
        if (secondLargest == Integer.MIN_VALUE){
            System.out.println("Second largest  does not exists");
        }
        else {
            System.out.println("Second largest" + secondLargest);
        }
    }
}

//If the interviewer asks:
//
// "Which pattern did you use?"
// "I used the Compare and Update pattern. While traversing the array once, I compare each element with the current largest and secondLargest values. Based on the comparison, I update these
