import java.util.Scanner;

public class Paso12 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int b1,b2,b3,b4,b5,p1,p2,p3,p4,p5;
        System.out.print("Ingrese el precio del boleto número 1: ");
        b1=input.nextInt();
        System.out.print("Ingrese la cantidad vendida: ");
        p1= input.nextInt();

        System.out.print("Ingrese el precio del boleto número 2: ");
        b2=input.nextInt();
        System.out.print("Ingrese la cantidad vendida: ");
        p2= input.nextInt();

        System.out.print("Ingrese el precio del boleto número 3: ");
        b3=input.nextInt();
        System.out.print("Ingrese la cantidad vendida: ");
        p3= input.nextInt();

        System.out.print("Ingrese el precio del boleto número 4: ");
        b4=input.nextInt();
        System.out.print("Ingrese la cantidad vendida: ");
        p4= input.nextInt();

        System.out.print("Ingrese el precio del boleto número 5: ");
        b5=input.nextInt();
        System.out.print("Ingrese la cantidad vendida: ");
        p5= input.nextInt();

        System.out.println("\nEl precio total es de: $"+(b1*p1+b2*p2+b3*p3+b4*p4+b5*p5));/*La letra del ejercico es muy confusa.*/
    }
}
