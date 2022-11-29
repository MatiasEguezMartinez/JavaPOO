import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Paso9 {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        boolean bandera=true;
        String opcion="",menu="Opcion 1 - Agregar número.\nOpción 2 - Mostrar menor y mayor.\nOtro caracter para salir.";
        List<Double> numeros=new ArrayList<>();
        double menor=0, mayor=0;
        while (bandera){
            System.out.println(menu);
            opcion=input.next();
            switch (opcion){
                case "1" ->{
                    System.out.print("Ingrese un número. ");
                    double aux=input.nextDouble();
                    numeros.add(aux);
                    if (numeros.size()==1){ menor=numeros.get(0); mayor=menor;}
                    if (aux < menor) menor = aux;
                    if (aux > mayor) mayor = aux;
                }
                case "2" ->{
                    if (numeros.size()==0)
                        System.out.println("Primero debe ingresar números.\n");
                    else
                        System.out.println("Menor: " + menor + "\nMayor: " + mayor);

                }
                default -> bandera=false;
            }
        }
    }
}
