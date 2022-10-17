import java.util.Scanner;

public class Ejercicio07 {
    public static void main(String[] args) {
        Scanner operacion= new Scanner(System.in);

        int n1;
        int n2;
        int n3;
        System.out.println("Cuál es el divisor?");

        n1= operacion.nextInt();

        System.out.println("Cuál es el dividendo?");

        n2= operacion.nextInt();
        n3= n1%n2;



        System.out.println("El modulo de la division es: "+ n3);
        n3= operacion.nextInt();
    }
}