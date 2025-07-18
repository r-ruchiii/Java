// Find the second largest element in an array
// Input: [5, 2, 8, 7, 10] → Output: 8

// using sorting @not optimal solution

// public class SecondLargest {
//     public static void main(String[] args) {
//         int[] input = {5, 2, 8, 7, 10};

//         for(int i=0; i<input.length; i++){
//             for(int j=0; j<input.length-1; j++){
//                 if(input[j] > input[j+1]){
//                     int temp = input[j];
//                     input[j] = input[j+1];
//                     input[j+1] = temp;
//                 }
//             }
//         }
//         System.out.println(input[input.length-2]);
//     }
// }


//other method
public class SecondLargest{
    public static void main(String[] args) {
        int[] input = {5, 2, 8, 7, 10};

        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for(int num: input){
            if(num > largest){
                secondLargest = largest;
                largest = num;
            }
            else if(num > secondLargest && num != largest){
                secondLargest = num;
            }
        }
        System.out.println("Second Largest Element: " + secondLargest);
    }
}
