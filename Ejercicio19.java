
import java.util.*;

public class Ejercicio19 {

    public static void main(String[] args) {
        int numAleatorio, residuo;
        //Scanner scanner = new Scanner(System.in);
        Random rd = new Random();
        numAleatorio = rd.nextInt(100) + 1;
        System.out.println("El numero N es " + numAleatorio);
        residuo = numAleatorio % 5;

        if (residuo == 0 && numAleatorio < 25) {
            System.out.println("Es correcto");
        } else {
            System.out.println("Es incorrecto");
        }
    }
}