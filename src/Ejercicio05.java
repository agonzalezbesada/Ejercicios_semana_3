import java.util.Scanner;

public class Ejercicio05 {
    public static void main(String[] args) {

        Scanner calculo = new Scanner(System.in);

        final double r;
        final double PI=3.141592;


        System.out.println("Cuál es el radio de la circunferencia?");
        r = calculo.nextDouble();
        double L= (2 * PI) * r;
        double a= PI * Math.pow(r,2);

        System.out.println("El area de la circunferencia es "+ a +"\nSu longitud es "+ L);
        a = calculo.nextInt();
        L = calculo.nextInt();
    }
}