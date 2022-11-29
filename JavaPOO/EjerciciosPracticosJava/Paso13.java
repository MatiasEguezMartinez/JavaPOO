import java.util.Scanner;

public class Paso13 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Ingrese la base: ");
        int base= input.nextInt();
        System.out.print("Ingrese el exponente: ");
        int exponente = input.nextInt();
        int resultado=base;
        for(int i=1;i<exponente;i++){
            resultado*=base;
        }
        System.out.println("\n"+base+"^"+exponente+"="+resultado);
    }
}
