// Count the number of even and odd numbers in an array
// Input: [1, 2, 3, 4, 5, 6] → Output: Even = 3, Odd = 3

public class countOddEven {
   public static void main(String[] args) {
       int[] input = {1,2,3,4,5,6};
       int counteven = 0 ;
       int countodd = 0;

       for(int i : input){
        if(i%2 == 0){
            counteven += 1;
        }
        else{
            countodd += 1;
        }
       }
       System.out.println("Even = " + counteven + ", Odd = " + countodd);
   } 
}
