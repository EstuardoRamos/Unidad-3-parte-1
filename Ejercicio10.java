import java.util.*;

public class Ejercicio10 {
    public static void main(String[] args) {
        int base, altura, area, perimetro;
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingrese la base del rectangulo: ");
        base=scanner.nextInt();
        System.out.print("Ingrese la altura del rectangulo: ");
        altura=scanner.nextInt();
        
        area=base*altura;
        perimetro=2*base+2*altura;
        
        System.out.println("El area del rectangulo es "+area+" y rl perimetro es "+perimetro);
    } 
}