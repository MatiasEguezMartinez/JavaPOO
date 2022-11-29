public class Paso2 {
    public static void main(String[] args) {
        String serie="Serie:";
        Integer suma=0;
        boolean bandera=true;
        for (int i =2;i<=1800;) {
            serie += " " + i;
            suma+=i;
            if (bandera){
                i+=3;
                bandera=false;
            }
            else{
                i+=2;
                bandera=true;
            }
        }
        System.out.println(serie+"\nSuma: "+suma);
    }
}
