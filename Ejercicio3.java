import java.util.*;

public class Ejercicio3 {
    public static void main(String[] args) {
        float num1, doble, triple;
        Scanner scanner= new Scanner(System.in);
        System.out.print("Ingrese un numero: ");
        num1=scanner.nextFloat();
        doble=num1*2;
        triple=num1*3;
        System.out.println("El doble del numero es: "+doble);
        System.out.println("El triple de numero es "+triple);
    } 
}