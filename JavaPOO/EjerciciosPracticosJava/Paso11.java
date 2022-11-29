import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Paso11 {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        boolean bandera=true;
        String opcion="",menu="Opcion 1 - Agregar un sueldo.\nOpción 2 - Mostrar el mayor.\nOtro caracter para salir.";
        List<Double> sueldos=new ArrayList<>();
        double mayor=0.0;
        while (bandera){
            System.out.println(menu);
            opcion=input.next();
            switch (opcion){
                case "1" ->{
                    System.out.print("Ingrese un sueldo. ");
                    double aux= input.nextDouble();
                    if (mayor<aux)mayor=aux;
                    sueldos.add(aux);
                }
                case "2" ->{
                    if (sueldos.size()==0)
                        System.out.println("Primero debe ingresar sueldos.\n");
                    else {
                        System.out.println("Mayor sueldo: " + mayor);
                    }
                }
                default -> bandera=false;
            }
        }
    }
}
