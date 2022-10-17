import java.util.Scanner;

public class Ejercicio12 {
    public static void main(String[] args) {
        Scanner mayoria_edad= new Scanner(System.in);

        int miEdad;
        int mayoriaEdad=18;

        System.out.println("Es usted mayor de edad?"+"\ningrese su edad");
        miEdad= mayoria_edad.nextInt();

        System.out.println(miEdad>=mayoriaEdad);
    }
}