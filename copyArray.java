// Copy one array into another array
// Write a program that creates a copy of an array using a loop (not Arrays.copyOf()).

public class copyArray {
    public static void main(String[] args) {
        int[] original = {1,2,3,4,5,6,7,8,9};
        int[] copy = new int[original.length];

        for (int i = 0; i < original.length; i++){
            copy[i] = original[i] ;
        }

        System.out.println("Original Array: ");
        for(int num : original){
            System.out.print(num + " ");
        }

        System.out.println(" ");
        System.out.println("Copied Array: ");
        for(int num : copy){
            System.out.print(num + " ");
        }
    }
}
