// Reverse an array
// Write a program to reverse the elements of an array.
// Example: Input: [1, 2, 3, 4] → Output: [4, 3, 2, 1]

public class reverseArray {
    public static void main(String[] args) {
        int[] num1 = {1, 2, 3, 4};

        for(int i= num1.length-1 ; i>= 0 ; i--){
            int num2 = num1[i];
            System.out.println(num2);
        }
    }
}
