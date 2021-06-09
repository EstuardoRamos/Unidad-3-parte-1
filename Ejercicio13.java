import java.util.*;

public class Ejercicio13 {
    public static void main(String[] args) {
        float pi=(float) 3.141592;
        float radio, altura, vol;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el radio del cilindro: ");
        radio=scanner.nextFloat();
        System.out.print("Ingrese el altura del cilindro: ");
        altura=scanner.nextFloat();
        
        if (radio>0 && altura>0) {
            vol=(float) (pi*(Math.pow(radio,2 ))*altura);
            System.out.println("El volumen del cilindro es "+vol);
        } 
        else {
             System.out.println("Numeros invalidos, inserte positivos");
        }
    }
    
}
