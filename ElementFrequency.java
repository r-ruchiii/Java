// Find the Frequency of Each Element in an Array
// 📝 Task: Count how many times each number appears in the array.
// Input: [1, 2, 2, 3, 1, 4, 2]
// Output:
// 1 → 2 times  
// 2 → 3 times  
// 3 → 1 time  
// 4 → 1 time
// Hint: Use a loop or a HashMap (if allowed).

public class ElementFrequency {
    public static void main(String[] args) {
        int[] input = {1,2,2,3,1,4,2,4,4,4};
        boolean[] visited = new boolean[input.length];

        for(int i=0; i<input.length; i++){
            if(visited[i]){
                continue;
            }

            int count = 1;

            for(int j=i+1; j<input.length; j++){
                if(input[i] == input[j]){
                    visited[j] = true;
                    count++;
                }
            }
            String times = count == 1 ? "time" : "times";
            System.out.println(input[i] + " → " + count + " " + times);
        }
    }
}
