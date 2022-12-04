public class Pista {
    //region Atributos
    private String _name;
    private Float _size;
    //endregion

    //region Propiedades
    //Asigna el nombre de la pista.
    public void setName(String name) {this._name = name;}
    //Devuelve el nombre de la pista.
    public String getName() {return _name;}

    //Asigna el tamaño de la pista.
    public void setSize(Float size) {this._size = size;}
    //Devuelve el tamaño de la pista.
    public Float getSize() {return _size;}
    //endregion

    //region Constructor
    /**Constructor completo.*/
    public Pista(String name,Float size){
        this.setName(name);
        this.setSize(size);
    }
    //endregion

    //region
    public String toString() {
        return "Nombre de la pista: "+getName()+"."
                .concat("\nTamaño de la pista: "+getSize()/1000+" km.");
    }
    //endregion Funciones
}
