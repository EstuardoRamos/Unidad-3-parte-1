import java.util.*;

public class Ejercicio4 {
    public static void main(String[] args) {
        float num1;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese un numero: ");
        num1=scanner.nextFloat();
        float cuadrado=num1*num1;
        float cubo=num1*num1*num1;
        
        System.out.println("El cuadrado del numero es "+cuadrado);
        System.out.println("El cubo del numero es "+cubo);
	}
}

