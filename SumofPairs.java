
import java.util.Scanner;

// Find All Pairs in an Array That Sum to a Target
// 📝 Task: Print all pairs of elements that add up to a given target.
// Input: arr = [2, 4, 3, 5, 7], target = 7
// Output: (2, 5) and (4, 3)

// Hint: Use two loops (or HashSet for optimized version).

public class SumofPairs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of Array: ");
        int size = sc.nextInt();
        int[] arr = new int[size];

        System.out.println("Enter the values of the Array: ");
        for(int i=0; i<size; i++){
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter the value of the target(i.e. you wanted the sum to add upto): ");
        int target = sc.nextInt();

        System.out.println("Pairs that sum to " + target + ":");

        for(int j=0; j<arr.length; j++){
            for(int i=j+1; i<arr.length; i++){
                if(arr[j]+arr[i] == target){
                    System.out.println(arr[j] + "," + arr[i]);
                }
            }
        }    
    }
}
