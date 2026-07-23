package arrays;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class FindDuplicateUsingStreams {
    public static void main(String[] args) {
        int[] arr = {10,20,30,20,40};
        Set<Integer> duplicate = new HashSet<>();
       Integer duplicates = Arrays.stream(arr).boxed().filter(number->!duplicate.add(number)).findFirst().orElse(null);
       if (duplicates !=null){
           System.out.println("Duplicates found :" + duplicate);
       }
       else {
           System.out.println("No duplicate element found");
       }
    }
}
