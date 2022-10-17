import java.util.Scanner;

public class Ejercicio04 {

    public static void main(String[] args) {

    Scanner operacion = new Scanner(System.in);

    int b;
    int h;
    int a;


    System.out.println("Valor de la base?:");
    b = operacion.nextInt();

    System.out.println("Valor de la altura?:");
    h = operacion.nextInt();

    a = b * h;
    System.out.println("El area del rectángulo es: " +a);

}
}