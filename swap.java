import java.util.*;

public class Swap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        for (int i=0; i<2; i++){
            System.out.println("Input an integer: ");
            int var1 = sc.nextInt();
            int var2 = sc.nextInt();

            int temp = var1;
            var1 = var2;
            var2 = temp;

            System.out.println("After Swapping -------->");
            System.out.println("Number 1 : " + var1);
            System.out.println("Number 2 : " + var2);

        }
        sc.close();
    }
}
