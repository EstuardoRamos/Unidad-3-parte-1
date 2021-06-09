import java.util.*;

public class Ejercicio6 {
    public static void main(String[] args) {
        int numeroAleatorio;
        Scanner scanner = new Scanner(System.in);
        Random rd = new Random();
        numeroAleatorio = rd.nextInt(200) + 1;
        
        System.out.println("El numero aleatorio es "+numeroAleatorio);
        float numAumenta=(float) ((numeroAleatorio*0.30)+numeroAleatorio);
        System.out.println("El numero aleatorio aumentado en 30% es "+numAumenta);
    }   
}