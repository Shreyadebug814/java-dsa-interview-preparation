package arrays;

//Two Pointers Pattern
public class ReverseAnArray {
    public static void main(String[] args) {
        int[] arr = {10,20,30,40,50};
        int[] temp = new int[arr.length];
        int j=0;
        for (int i = arr.length-1;i>=0;i--){
            temp[j] = arr[i];
            j++;
        }
        System.out.println("Reversed array");
        for (int i=0;i< temp.length;i++){
            System.out.println(temp[i] + " ");
        }
    }
}
