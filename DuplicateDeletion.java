
import java.util.*;

// Remove duplicates from an array
// Input: [1, 2, 2, 3, 4, 4] → Output: [1, 2, 3, 4]
// (Hint: use nested loops or a Set)

//With the use of ArrayList

public class DuplicateDeletion {
    public static void main(String[] args) {
        int[] input = {1,2,2,3,4,4};
        ArrayList<Integer> num = new ArrayList<Integer>();

        for(int i=0; i<input.length; i++){
            boolean isDuplicate = false;
            for(int j=0; j<num.size(); j++){
                if(input[i] == num.get(j)){
                    isDuplicate = true;
                    break;
                }
            }
            if (!isDuplicate) {
                num.add(input[i]);
        }

    }
    System.out.println("Array after removing duplicates: " + num);
    }
}
