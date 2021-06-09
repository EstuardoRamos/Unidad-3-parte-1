import java.util.*;

public class Ejercicio14 {
    public static void main(String[] args) {
        float num1, num2, residuo;
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingrese primer numero: ");
        num1=scanner.nextFloat();
        System.out.print("Ingrese segundo numero: ");
        num2=scanner.nextFloat();
        
        residuo=num1%num2;
        if (residuo==0){
            System.out.println("Son divisible");
        } else{
            System.out.println("No son divisibles");
        }
    }
    
}