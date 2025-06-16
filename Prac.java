import java.util.Scanner;

public class Prac{
    public static void main(String[] args) {
         // System.out.println("Hello World");
        
        // System.out.println(-5 + 8 * 6);
        // System.out.println((55+9) % 9);
        // System.out.println(20 + -3*5 / 8);
        // System.out.println(5 + 15 / 3 * 2 - 8 % 3);

        Scanner sc = new Scanner(System.in);
        System.out.println("Input an integer: ");
        int num = sc.nextInt();

        for (int i = 1; i<= 10; i++) {
             System.out.println(num + " x " + i + " = " + (num * i));

        }
            
        }
}
