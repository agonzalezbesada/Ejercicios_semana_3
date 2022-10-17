import java.util.Scanner;

public class Ejercicio11 {
    public static void main(String[] args) {
        Scanner incremento= new Scanner(System.in);

        int n1;
        int n2;
        int n3;

        System.out.println("Inserte un número:");
        n1= incremento.nextInt();

        n1++;

        System.out.println("Su número ha sido aumentado a "+n1);
        System.out.println("Inserte un segundo número:");
        n2= incremento.nextInt();

        n3= n2 * n1;
        System.out.println(n3);
    }
}