import java.util.Scanner;

public class Paso6 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Ingrese el número que desea. ");
        int j=input.nextInt();
        System.out.println("Tabla del número "+j);
        for (int i=0;i<=10;i++) {
            System.out.println(i+"*"+j+"="+i*j);
        }
    }
}
