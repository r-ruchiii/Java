// Sum of All Elements in a 2D Array
// Task: Calculate the sum of all numbers in a matrix.
// Example:
// Matrix:
// 1 2  
// 3 4  
// Sum = 10

public class SumofAllElements {
    public static void main(String[] args) {
        int[][] arr = {{1,2}, {3,4}};
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            for (int idx = 0; idx < arr[i].length; idx++) {
                sum += arr[i][idx];
            } 
        }
        System.out.println(sum);
    }
}
