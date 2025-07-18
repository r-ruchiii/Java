// Rotate Array Elements to the Right by One
// 📝 Task: Move the last element to the front and shift others right.
// Input: [1, 2, 3, 4, 5]
// Output: [5, 1, 2, 3, 4]

// Hint: Store last element, shift all others, place last at index 0.

public class RotateArray {
    public static void main(String[] args) {
        int[] input = {1,2,3,4,5};

        int last = input[input.length-1];

        for(int i=input.length-1; i>0; i--){
            input[i] = input[i-1];
        }

        input[0] = last;

        System.out.println("Rotated Array: ");
        for(int i = 0; i<input.length; i++){
            System.out.print(" " + input[i]);
        }
        
    }
}
