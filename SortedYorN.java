
import java.util.Scanner;

// Check if Array is Sorted (Ascending Order)
// 📝 Task: Return true if the array is sorted in ascending order.
// Input: [1, 2, 3, 4] → true
// Input: [1, 3, 2] → false

public class SortedYorN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);  //input
        int size = sc.nextInt();              // size of array
        int[] arr = new int[size];            // array

        for(int i =0; i<size; i++){           // input values in array
            arr[i] = sc.nextInt();
        }
//Print array
        // for (int num : arr) {
        //     System.out.print(num + " ");
        // }
        
        boolean isSorted = true;

        for(int j=0; j<arr.length; j++){
            if(arr[j] > arr[j+1]){
               isSorted = false;
               break;
            }
        }

        if(isSorted==true){
            System.out.println("Sorted Array");
        }
        else{
            System.out.println("Un-Sorted Array");
        }
    }
}
