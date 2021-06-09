
import java.util.*;

public class Ejercicio15 {

    public static void main(String[] args) {
        int num;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese un numero: ");
        num = scanner.nextInt();

        if (num > 0) {
            System.out.println("El numero es positivo");

        } else if (num == 0) {
            System.out.println("El numero es nulo");
        } else {
            System.out.println("El numero es negativo");
        }
    }

}