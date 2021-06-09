import java.util.*;

public class Ejercicio18 {

    public static void main(String[] args) {
        int num, suma;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese un numero de 4 digitos: ");
        num = scanner.nextInt();

        if (num < 10 && num > 0) {
            String text = String.valueOf(num);

            String d1 = "0";
            String d2 = "0";
            String d3 = "0";
            String d4 = text.substring(0, 1);
            System.out.println(" d1 = " + d1 + "  d2 = " + d2 + "  d3 = " + d3 + "  d4 = " + d4);
            System.out.println("Y la suma de estos es " + num);

        } else if (num < 100) {
            String text = String.valueOf(num);

            String d1 = "0";
            String d2 = "0";
            String d3 = text.substring(0, 1);
            String d4 = text.substring(1, 2);
            int num2 = Integer.valueOf(d4);
            int num1 = Integer.valueOf(d3);
            suma = num1 + num2;
            System.out.println("d1 = " + d1 + "  d2 = " + d2 + "  d3 = " + d3 + "  d4 = " + d4);
            System.out.println("Y la suma de estos es " + suma);

        } else if (num < 1000) {
            String text = String.valueOf(num);

            String d1 = "0";
            String d2 = text.substring(0, 1);
            String d3 = text.substring(1, 2);
            String d4 = text.substring(2, 3);

            int num1 = Integer.valueOf(d4);
            int num2 = Integer.valueOf(d3);
            int num3 = Integer.valueOf(d2);
            suma = num1 + num2 + num3;
            System.out.println("d1 = " + d1 + "  d2 = " + d2 + "  d3 = " + d3 + "  d4 = " + d4);
            System.out.println("Y la suma de estos es " + suma);

        } else if (num < 10000) {
            String text = String.valueOf(num);

            String d1 = text.substring(0, 1);
            String d2 = text.substring(1, 2);
            String d3 = text.substring(2, 3);
            String d4 = text.substring(3, 4);

            int num1 = Integer.valueOf(d4);
            int num2 = Integer.valueOf(d3);
            int num3 = Integer.valueOf(d2);
            int num4 = Integer.valueOf(d1);
            suma = num1 + num2 + num3 + num4;
            System.out.println("d1 = " + d1 + "  d2 = " + d2 + "  d3 = " + d3 + "  d4 = " + d4);
            System.out.println("Y la suma de estos es " + suma);

        } else {
            System.out.println("Numero invalido");
        }

    }

}