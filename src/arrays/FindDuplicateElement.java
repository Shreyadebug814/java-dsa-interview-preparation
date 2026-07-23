package arrays;


import java.util.HashSet;

//Pattern Name =Hashing Pattern and  Searching pattern
public class FindDuplicateElement {
    public static void main(String[] args) {
    int[] arr = {10,20,30,20,40};
        HashSet<Integer> set = new HashSet<>();
        boolean duplicateFound  = false;
        for (int i = 0; i< arr.length; i++) {
            if (set.contains(arr[i])){
                System.out.println("Duplicate element exists" + arr[i]);
                duplicateFound = true;
                break;
            }
            set.add(arr[i]);
        }
        if (!duplicateFound){
            System.out.println("No duplicate found");
        }
    }
}

//"This problem primarily uses the Hashing Pattern.
// Since we search for duplicate elements using a HashSet, it also involves the Searching Pattern."


//✅ Time Complexity → How much work does the algorithm do?
//        ✅ Space Complexity → How much extra memory does the algorithm use?

//If the interviewer asks:
//"Why is HashSet faster than nested loops?"
//You can answer:
//"In the brute force approach, every element is compared with many other elements,
// which results in O(n²) time complexity. With a HashSet, I store each element as I traverse the array.
// Before adding a new element, I check whether it already exists in the HashSet. This lookup is approximately O(1) on average, so the entire algorithm becomes O(n)."
//Brute Force → Search by comparing every element.
//Optimized → Search using a HashSet.