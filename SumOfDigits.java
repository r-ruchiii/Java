import java.util.*;

public class SumOfDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number: ");
        long num = sc.nextLong();

        System.out.println("Sum of the digits of given number i.e. " + num + " = " + sumDigits(num));
        
    }

    public static int sumDigits(long num){
        int sum = 0;
        
        while(num != 0){
            sum += num%10;
            num /= 10;
        }

        return sum;
    }
}
