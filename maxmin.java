// Find the maximum and minimum element in an array
// Input: [5, 7, 2, 9, 1] → Max: 9, Min: 1

public class maxmin {
    public static void main(String[] args) {
        int[] input = {5, 7, 2, 9, 1};
        int max = input[0];
        int min = input[0];

        for(int i : input){
            if (max < i){
                max = i;
            }
        }

        for(int j : input){
            if (min > j){
                min = j;
            }
        }

        System.out.println("Max :" + max);
        System.out.println("Min :" + min);
    }
}
