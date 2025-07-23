
import java.util.Scanner;

// Find the Number of Positive, Negative, and Zero Elements
// 📝 Task: Count how many numbers are:
// Positive
// Negative
// Zero
// Input: [0, -1, 2, -3, 4, 0]
// Output: Positive: 2, Negative: 2, Zero: 2

public class Count {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int size = sc.nextInt();

        int[] arr = new int[size];
        System.out.println("Enter the elements of the array: ");
        for(int i=0; i<size; i++){
            arr[i] = sc.nextInt();
        }

        int pos = 0, neg = 0, zero = 0;

        for(int item: arr){
            if(item == 0){
                zero += 1;
            }
            else if(item < 0){
                neg += 1;
            }
            else{
                pos += 1;
            }
        }
        System.out.println("Positives: " + pos + " , " + "Negatives: " + neg + " , " + "Zeros: " + zero);

    }
}
