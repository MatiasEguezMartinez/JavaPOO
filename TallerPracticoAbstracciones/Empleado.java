public abstract class Empleado
{
    //region ATRIBUTOS
        private String nombre;
        private String direccion;
        private int numero;
    //endregion

    //region PROPIEDADES

        public String getNombre(){return nombre;}

        public String getDireccion() {return direccion;}

        public void setDireccion(String nueva) {direccion = nueva;}

        public int getNumero() {return numero;}
    //endregion


    public Empleado(String nombre, String direccion, int numero)
    {
        System.out.println("Construyendo un empleado");
        this.nombre = nombre;
        this.direccion = direccion;
        this.numero = numero;
    }

    public abstract double pagoComputado();

    public void chequeCorreo()
    {
        System.out.println("Enviando el cheque por correo a "
                + this.nombre + " " + this.direccion);
    }
    public String toString(){return nombre + " " + direccion + " " + numero;}

}
