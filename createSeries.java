import java.util.Scanner;

public class createSeries {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
      Scanner sc = new Scanner(System.in);
      
      int input = sc.nextInt();
      
      for (int i=0; i<input; i++){
        int a = sc.nextInt();
        int b = sc.nextInt();
        int n = sc.nextInt();
        
        int sum = a;
        int power = 1;
        
        for (int j=0; j<n; j++){
            sum += power * b;
            System.out.print(sum + " ");
            power *= 2;
        }
         System.out.println();
      }
         
    }
}


// Problem - https://www.hackerrank.com/challenges/java-loops/problem?isFullScreen=true
