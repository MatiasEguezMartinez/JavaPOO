public class Jugador {
    //region Atributos
    private String _name;
    //endregion

    //region Propiedades
    //Asigna el nombre al jugador.
    public void setName(String name) {this._name = name;}
    //Devuleve el nombre del jugador.
    public String getName() {return _name;}
    //endregion

    //region Constructor
    public Jugador(String name){this.setName(name);}
    //endregion

    //region Funciones
    public String toString(){return getName();}
    //endregion
}
