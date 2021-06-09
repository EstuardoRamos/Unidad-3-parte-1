
import java.util.Scanner;

public class Ejercicio20 {

    public static void main(String[] args) {
        int num, suma;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese un numero de 5 digitos: ");
        num = scanner.nextInt();

        if (num < 100000 && num > 9999) {
            String text = String.valueOf(num);

            String d1 = text.substring(0, 1);
            String d2 = text.substring(1, 2);
            String d3 = text.substring(2, 3);
            String d4 = text.substring(3, 4);
            String d5 = text.substring(4, 5);

            int num1 = Integer.valueOf(d5);
            int num2 = Integer.valueOf(d4);
            int num3 = Integer.valueOf(d3);
            int num4 = Integer.valueOf(d2);
            int num5 = Integer.valueOf(d1);

            if (num1 == num5 && num2 == num4) {
                System.out.println("Es capicua");
            } else {
                System.out.println("No es copicua");
            }
        } else {
            System.out.println("Numero invalido, deben ser 5 digitos");

        }
    }
}