import java.util.Scanner;

public class Ejercicio06 {
    public static void main(String[] args) {

        Scanner informacion= new Scanner(System.in);

    String nombre= "";
    String direccion= "";
    String gusto= "";

    System.out.println("Hola, mi nombre es "+ nombre);
    nombre= informacion.nextLine();

    System.out.println("Vivo en "+ direccion);
    direccion= informacion.nextLine();

    System.out.println("Y me gusta " + gusto);
    gusto= informacion.nextLine();

    System.out.println("Hola, mi nombre es "+ nombre+" vivo en "+ direccion+" y me gusta "+ gusto);
    }
}