// You are given an integer , you have to convert it into a string.
// Please complete the partially completed code in the editor. If your code successfully converts  into a string  the code will print "Good job". Otherwise it will print "Wrong answer".
//  can range between  to  inclusive.

// Sample Input 
// 100


// Sample Output 
// Good job

import java.util.Scanner;

public class InttoString {
     public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = Integer.toString(n);
        
        if(s.getClass().getSimpleName().equals("String")){
            System.out.println("Good job");
        }
        else{
            System.out.println("Wrong answer");
        }
        
        
    }
}
