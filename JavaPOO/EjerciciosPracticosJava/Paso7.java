import java.util.Arrays;
import java.util.Scanner;

public class Paso7 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Ingrese las 20 calificaciones ");
        Integer[] calificaciones = new Integer[20];
        int aux=0;
        for (int i=0; i <20; i++){
            calificaciones[i]=input.nextInt();
            aux+=calificaciones[i];
        }
        System.out.println("Promedio general: "+aux/20+"\nCalificaciones en orden inverso: ");
        for (int i = 20 ; i>0; i--){
            System.out.print(" "+calificaciones[i]);
        }
    }
}
