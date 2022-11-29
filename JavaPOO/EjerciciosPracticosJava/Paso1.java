import java.util.Scanner;

public class Paso1 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int pares=0, impares=0, aux,contador=0;

        System.out.println("Ingrese los 270 números.");
        for (int i =0;i<4;i++){
            aux=input.nextInt();
            if (aux%2!=0) {impares+=aux;}
            else {
                contador++;
                pares+=aux;
            }
        }
        pares= contador==0 ? pares : pares/contador;
        System.out.println("La suma de los números impares es: " + impares+"\nEl promedio de los números pares es: "+pares);
    }
}
