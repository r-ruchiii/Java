
import java.util.Scanner;

// Remove a Specific Element from an Array
// 📝 Task: Remove a given number (e.g., 3) from the array.
// Input: arr = [1, 2, 3, 4, 3, 5], remove = 3
// Output: [1, 2, 4, 5]

// Note: Since arrays are fixed-size, you can use a new array or ArrayList.

public class DeleteElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of an Array: ");
        int size = sc.nextInt();

        int[] arr = new int[size];
        System.out.println("Enter the elements of the Array: ");
        for(int i=0; i<size; i++){
            arr[i] = sc.nextInt();
        }
        
        System.out.println("Enter the element to be Deleted: ");
        int delete = sc.nextInt();

        //count how many  times the element appears
        int count = 0;
        for (int i = 0; i < size; i++) {
            if (arr[i] == delete) {
                count++;
            }
        }

        //create new array
        int[] newarr = new int[size - count];
        int index = 0;

        for (int i = 0; i < size; i++) {
            if (arr[i] != delete) {
                newarr[index++] = arr[i];
            }
        }

        System.out.println("New Array after removal of specific element " + delete + ":");
        for(int i = 0; i< newarr.length ; i++){
            System.out.print("  " + newarr[i]);
        }
    }
}
