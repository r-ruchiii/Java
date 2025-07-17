// Merge two arrays into a third array
// Input: arr1 = [1, 2], arr2 = [3, 4] → Output: [1, 2, 3, 4]

public class MergeArray {
    public static void main(String[] args) {
        int[] arr1 = {1,2};
        int[] arr2 = {3,4};

        int[] merge  = new int[arr1.length+arr2.length];
        
        for(int i = 0; i<arr1.length; i++){
            merge[i] = arr1[i];
        }

        for(int i = 0; i<arr2.length; i++){
            merge[arr1.length + i] = arr2[i];
        }

        for(int i: merge){
            System.out.print(i + ",");
        }

    }
}
