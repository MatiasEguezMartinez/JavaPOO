import java.util.Scanner;

public class Paso4 {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.println("Ingrese el sueldo: ");
        double sueldo=input.nextDouble();
        if (sueldo<1000) System.out.print("Nuevo sueldo: "+((15*sueldo)/100 + sueldo));
        else System.out.println("Nuevo sueldo: "+((12*sueldo)/100 + sueldo));
    }
}
