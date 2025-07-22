// Reverse an array
// Write a program to reverse the elements of an array.
// Example: Input: [1, 2, 3, 4] → Output: [4, 3, 2, 1]

// public class reverseArray {
//     public static void main(String[] args) {
//         int[] num1 = {1, 2, 3, 4};

//         for(int i= num1.length-1 ; i>= 0 ; i--){
//             int num2 = num1[i];
//             System.out.print(num2 + " ");
//         }
//     }
// }

// Reverse the Array Without Using Extra Space
// 📝 Task: Reverse the array in-place (no second array).
// Input: [1, 2, 3, 4]
// Output: [4, 3, 2, 1]

// Hint: Use two-pointer technique: swap first and last, then move inward.


public class reverseArray {
    public static void main(String[] args) {
        reverseArray obj = new reverseArray();
        obj.rev();
    }

    public void rev(){
        int[] num = {1, 2, 3, 4};

        int start = 0;
        int end = num.length - 1;


        while (start < end) {
            // Swap elements at start and end
            int temp = num[start];
            num[start] = num[end];
            num[end] = temp;

            start++;
            end--;
        }
        System.out.print("Reversed array: ");
        for (int n : num) {
            System.out.print(n + " ");
        }
    }

}
