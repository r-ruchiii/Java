// Search for an element in an array
// Write a program to check if a given number exists in the array.
// Input: arr = [5, 6, 7], num = 6 → Output: "Found at index 1"

public class searchElements {
    public static void main(String[] args) {
        int[] input = {5, 6, 7};
        int num = 6;

        for(int i= 0; i < input.length ; i++){
            if(input[i] == num){
                System.out.println("Found at index " + i);
            }
        }
    }
}
