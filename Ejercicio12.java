import java.util.*;

public class Ejercicio12 {
    public static void main(String[] args) {
        float cel, faren;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese la temperatura en celcius: ");
        cel = scanner.nextFloat();
        faren = (float) (((cel)*(1.8))+32);
        System.out.println("La temperatura en Fahrenheit es "+faren);
    }
    
}   