
import java.util.*;

public class Ejercicio17 {

    public static void main(String[] args) {
        int l1, l2, l3;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese un lado del triangulo: ");
        l1 = scanner.nextInt();
        System.out.print("Ingrese lado del triangulo: ");
        l2 = scanner.nextInt();
        System.out.print("Ingrese lado del triangulo: ");
        l3 = scanner.nextInt();

        if (l1 == l2 && l1 == l3) {
            System.out.println(" Es equilatero");
        } else if (l1!=  l2 && l1 !=l3 && l2!=l3) {
            System.out.println("Es Escaleno");
        } else {
            System.out.println("Es Isosceles");
        }

    }
}