import java.util.*;

public class Comparison {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int num1 = sc.nextInt();
    int num2 = sc.nextInt();

    if(num1 == num2){
        System.out.println(num1 + " == " + num2);
    }
    if(num1 > num2){
        System.out.println(num1 + " > " + num2);
    }
    if(num1 != num2){
        System.out.println(num1 + "!=" + num2);
    }
    if(num1 < num2){
        System.out.println(num1 + " < " + num2);
    }
    if(num1 >= num2){
        System.out.println(num1 + " >= " + num2);
    }
    if(num1 <= num2){
        System.out.println(num1 + " <= " + num2);
    }
    
    }   
}
