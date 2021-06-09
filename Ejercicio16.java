
import java.util.*;

public class Ejercicio16 {

    public static void main(String[] args) {
        int num1, num2, num3;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese Primer numero");
        num1 = scanner.nextInt();
        System.out.println("Ingrese segundo numero");
        num2 = scanner.nextInt();
        System.out.println("Ingrese tercer numero");
        num3 = scanner.nextInt();

        if (num1 > num2 && num1 > num3) {
            System.out.println(num1 + " es el numero mayor");
        } else if (num2 > num1 && num2 > num3) {
            System.out.println(num2 + " es el numero mayor");
        } else {
            System.out.println(num3 + " es el numero mayor");
        }

    }
}