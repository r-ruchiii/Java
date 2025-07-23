// Separate Even and Odd Numbers in an Array
// 📝 Task: Move all even numbers to the front and odd numbers to the back.
// Input: [1, 2, 3, 4, 5, 6]
// Output: [2, 4, 6, 1, 3, 5] (order doesn’t matter)

public class EvenOddSorting {
    public static void main(String[] args) {
        int[] input = {1,2,3,4,5,6};

        int[] result = new int[input.length];
        int index = 0;

        for(int num: input){
            if(num % 2 == 0){
               result[index++] = num;
            }
        }

        for(int num: input){
            if(num % 2 != 0){
                result[index++] = num;
            }
        }

        System.out.print("Rearranged array: ");
        for (int num : result) {
            System.out.print(num + " ");
        }
    }
}
