import java.util.*;

public class Ejercicio2 {
    public static void main(String[] args) {
        String pais, capital;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese nombre del pais: ");
        pais=scanner.nextLine();
        System.out.println("Ingrese la capital: ");
        capital=scanner.nextLine();
        
        System.out.println(capital+ " es la capital de "+pais);  
    }
    
}
