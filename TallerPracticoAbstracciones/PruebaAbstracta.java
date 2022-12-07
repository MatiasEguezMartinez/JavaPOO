public class PruebaAbstracta
{
    public static void main(String[] args)
    {
        Empleado e = new Salario("Martin Miranda","M. Sosa",333,100000.0);
        Salario s = new Salario("Enzo Tortore", "Gral. Paz", 777, 90000.0);
        System.out.println("LLamada a chequeCorreo usando la referencia de la clase Empleado --");
        e.chequeCorreo();

        System.out.println("Llamada a chequeCorreo usando la referencia de la clase Salario --");
        s.chequeCorreo();
    }
}