import java.util.*;

public class Ejercicio11 {
    public static void main(String[] args) {
        float cm, pul, yarda, mt, pie;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrse su medida en centimetros: ");
        cm = scanner.nextFloat();
        yarda=(float) (cm/91.44);
	mt=cm/100;
	pie= (float) (cm/30.48);
	pul=(float) (cm/2.54);
        
        System.out.println("Su medida en yardas es "+yarda);
        System.out.println("Su medida en metros es "+mt);
        System.out.println("Su pies en pies es "+pie);
        System.out.println("Su pulgadas en metros es "+pul);
    }
    
}
