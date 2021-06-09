import java.util.*;

public class Ejercicio1 {
    
   public static void main(String[] args) {
       float num1, num2;
       Scanner scanner = new Scanner(System.in);
       System.out.print("Ingrese un numero: ");
       num1=scanner.nextFloat();
       System.out.print("Ingrese un numero: ");
       num2=scanner.nextFloat();
       
       float suma=num1+num2;
       System.out.println("El resultado de la suma es "+suma);  
   } 
}
