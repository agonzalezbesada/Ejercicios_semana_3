import java.util.Scanner;

public class Ejercicio02 {
    public static void main(String[] args) {

        Scanner calculo = new Scanner(System.in);

        final double r=50;
        final double PI=3.141592;
        double L= (2 * PI) * r;
        double a= PI * Math.pow(r,2);

        System.out.println("El area de la circunferencia es "+ a +"\nSu longitud es "+ L);
    }
}