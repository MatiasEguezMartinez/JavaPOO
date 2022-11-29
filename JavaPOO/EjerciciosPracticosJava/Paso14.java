import java.util.Scanner;

public class Paso14 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Ingrese la base: ");
        int base= input.nextInt();
        System.out.print("Ingrese el exponente: ");
        int exponente = input.nextInt();
        int resultado=base,i=1;
        while (i<exponente){
            resultado*=base;
            i++;
        }
        System.out.println("\n"+base+"^"+exponente+"="+resultado);
    }
}
