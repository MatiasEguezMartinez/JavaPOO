import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Paso8 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        String menu="Opción 1 - Agregar sueldo.\nOpción 2 - Imprimir sueldos.\nOtro caracter para salir.",opcion="";
        boolean bandera=true;
        List<Double> sueldos=new ArrayList<>();
        while (bandera){
            System.out.println(menu);
            opcion=input.next();
            switch (opcion) {
                case "1" -> {
                    System.out.println("Ingrese el sueldo.");
                    double aux = input.nextDouble();
                    aux = aux < 1000 ? aux+(aux * 15) / 100 : aux+(aux * 12) / 100;
                    sueldos.add(aux);
                }
                case "2" -> sueldos.forEach(item -> System.out.println(item + " "));
                default -> bandera = false;
            }


        }
    }
}
