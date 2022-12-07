public class Salario extends Empleado
{
    private double salario;
    public double getSalario() {return salario;}
    public void setSalario(double nuevo) {if (nuevo >= 0.0) salario = nuevo;}


    public Salario(String nombre, String direccion, int numero, double salario)
    {
        super(nombre, direccion, numero);
        setSalario(salario);
    }

    public void chequeCorreo()
    {
        System.out.println("Dentro de chequeCorreo de la clase Salario");
        System.out.println("Enviando cheque a " + getNombre()
                + " con salario " + getSalario());
    }

    public double pagoComputado()
    {
        System.out.println("Computando el pago del salario a "
                + getNombre());
        return salario/52;
    }
}