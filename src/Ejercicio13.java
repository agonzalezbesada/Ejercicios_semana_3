import java.util.Scanner;

public class Ejercicio13 {
    public static void main(String[] args) {
        Scanner multiplicaciones= new Scanner(System.in);

        int n1;

        System.out.println("Calcular tabla del:");
        n1= multiplicaciones.nextInt();

        for(int i = 1; i<=10; i++) {
            System.out.println(n1 + " * " + i + " = " + n1 * i);
        }
    }
}