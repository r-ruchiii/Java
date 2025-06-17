import java.util.Scanner;

public class Palindrome {
     public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        
        // take string input
        String A=sc.next();
        
        /* Enter your code here. Print output to STDOUT. */
        
        // store reverse
        String rev = "";
        
        // Loop for rev string
        for(int i = A.length()-1; i>=0; i--){
            rev = rev + A.charAt(i);
        }
        
        // check if rev == A
        if(A.equals(rev)){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
}
}
