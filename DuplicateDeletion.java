
// (Hint: use nested loops or a Set)

//With the use of ArrayList

// public class DuplicateDeletion {
//     public static void main(String[] args) {
//         int[] input = {1,2,2,3,4,4};
//         ArrayList<Integer> num = new ArrayList<Integer>();

//         for(int i=0; i<input.length; i++){
//             boolean isDuplicate = false;
//             for(int j=0; j<num.size(); j++){
//                 if(input[i] == num.get(j)){
//                     isDuplicate = true;
//                     break;
//                 }
//             }
//             if (!isDuplicate) {
//                 num.add(input[i]);
//         }

//     }
//     System.out.println("Array after removing duplicates: " + num);
//     }
// }


// version 2
// Print the Duplicate Elements in an Array
// 📝 Task: Find and print elements that appear more than once.
// Input: [1, 2, 3, 2, 4, 1]
// Output: 1 2

// Hint: Use nested loops or a HashSet to track duplicates.

public class DuplicateDeletion{
    public static void main(String[] args) {
        DuplicateDeletion obj = new DuplicateDeletion();
        obj.deleteDuplicate();
    }

    public void deleteDuplicate(){
        int[] input = {1,2,3,2,4,1};

        for(int i=0; i<input.length; i++){
            for(int j=i+1; j<input.length; j++){
                if(input[i] == input[j]){
                    boolean traversed = false;
                    for(int k=0; k<i; k++){
                        if(input[k] == input[i]){
                            traversed = true;
                            break;
                        }
                    }
                    if(!traversed){
                        System.out.print(input[i] + " ");
                    }
                }
            }
        }
    }
}
