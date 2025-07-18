
// Input: [4, 2, 7, 1] → Output: [1, 2, 4, 7]

public class SortArray {
    public static void main(String[] args) {
        int[] inputArr = {4,2,7,1};
        
        for(int i = 0; i < inputArr.length-1; i++){
            for(int j = 0; j < inputArr.length - 1 - i; j++){
                if(inputArr[j] > inputArr[j+1]){
                    int temp = inputArr[j];
                    inputArr[j] = inputArr[j+1];
                    inputArr[j+1] = temp;
                }
            }
        }

        System.out.println("Sorted Array: ");
        for(int num: inputArr){
            System.out.println(num + " ");
        }

    }
    
}
