// Write a program to reverse the alternate numbers in an array.
// arr = [ 1,2,3,4,5,6,7,8]
// new arr = [2,1,4,3,6,5,8,7]

public class reverseAlternateNumbers {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8};

        for(int i = 0; i< arr.length ; i =i+2){
            if(i == arr.length){
                break;
            }
                int temp = arr[i];
                arr[i] = arr[i+1];
                arr[i+1] = temp;
        }

        for(int i = 0; i< arr.length ; i++){
            System.out.print("  " + arr[i]);
        }
        
    }
}
