import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Paso3 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Ingrese la matrícula");
        List<Integer> datos= new ArrayList<>();
        datos.add(input.nextInt());
        int aux=0;
        for (int i=1; i<6;i++){
            System.out.print("\nIngrese la nota número "+i+": ");
            aux=input.nextInt();
            datos.add(aux);
        }
        System.out.print("Matrícula: "+datos.get(0));
        String a= aux/5>5 ?  ", Aprobó.": ", No aprobó.";
        System.out.println(a);
    }
}
