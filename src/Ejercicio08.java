import java.util.Scanner;

public class Ejercicio08 {
    public static void main(String[] args) {
        Scanner comparacion= new Scanner(System.in);

        int n1;
        int n2;

        System.out.println("Primer numero: ");
        n1= comparacion.nextInt();

        System.out.println("Segundo numero: ");
        n2= comparacion.nextInt();


        System.out.println(n1==n2);
    }
}