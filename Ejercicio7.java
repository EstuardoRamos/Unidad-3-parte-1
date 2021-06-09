import java.util.*;

public class Ejercicio7 {
    public static void main(String[] args) {
        int numeroAleatorio;
        Scanner scanner = new Scanner(System.in);
        Random rd = new Random();
        numeroAleatorio = rd.nextInt(41) + 9;
        
        System.out.println(" El numero aleatorio es "+numeroAleatorio);
        float numDismin=(float) ((numeroAleatorio*0.85));
        System.out.println("El numero aleatorio disminuyido en 15% es "+numDismin);
    }   
}
