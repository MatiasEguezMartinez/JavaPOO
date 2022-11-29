import java.util.Scanner;

public class Paso10 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Ingrese el monto: ");
        int monto=input.nextInt();
       
       if (monto <= 500 && 0 < monto) System.out.println("Total a pagar: $" + monto + ", 0% de descuento.");
       else if (monto<=1000) System.out.println("Total a pagar: " + (monto-(monto*5)/100) + " 5% de descuento.");
       else if (monto<=7000) System.out.println("Total a pagar: " + (monto-(monto*11)/100) + " 11% de descuento.");
       else if (monto<=15000) System.out.println("Total a pagar: " + (monto-(monto*18)/100) + " 18% de descuento.");
       else System.out.println("Total a pagar: " + (monto-(monto*25)/100) + " 25% de descuento.");

    }
}
