// Find the sum and average of elements in an array
// Input: [2, 4, 6, 8] → Sum: 20, Average: 5.0

public class sumAvg {
    public static void main(String[] args) {
        int[] input = {2,4,6,8};
        int sum = 0;
        float avg = 0;
        int length = input.length;

        for(int i : input){
            sum += i;
        }
        avg = sum/length;

        System.out.println("Sum:" + sum);
        System.out.println("Average:" + avg);
    }
}
