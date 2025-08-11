// Print a 2D Array
// Task: Given a 2D array, print all elements in row and column format.
// Example:
// Edit
// 1 2 3  
// 4 5 6  

public class Array2D {
    public static void main(String[] args) {
        int[][] twoD = {{1,2,3}, {4,5,6}};

        for(int i=0; i<twoD.length; i++){
            for(int j=0; j<twoD[i].length; j++){
                System.out.print(twoD[i][j]);
            }
        }
    }
}
