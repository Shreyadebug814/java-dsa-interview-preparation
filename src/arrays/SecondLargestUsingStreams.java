package arrays;

import java.util.Arrays;

public class SecondLargestUsingStreams {
    public static void main(String[] args) {
        int[] arr = {10,5,20,8,15};
        int secondLargest = Arrays.stream(arr).distinct().boxed().sorted((a,b)->Integer.compare(b,a)).skip(1).findFirst().orElse(Integer.MIN_VALUE);
            if (secondLargest == Integer.MIN_VALUE){
                System.out.println("Second largest element does not exists");
            }else {
                System.out.println("Second largest :" +secondLargest);
            }
        }
    }

