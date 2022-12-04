public class Podio {
    //region Atributos
    private Jugador _first ;
    private Jugador _second;
    private Jugador _third;
    //endregion

    //region Propiedades
    /**Asigna el primer finalista.*/
    public void setFirst(Jugador first) {this._first = first;}
    /**Devuelve el primer finalista.*/
    public Jugador getFirst() {return _first;}


    /**Asigna el segundo finalista.*/
    public void setSecond(Jugador second) {this._second = second;}
    /**Devuelve el segundo finalista.*/
    public Jugador getSecond() {return _second;}


    /**Asigna el tercer finalista.*/
    public void setThird(Jugador third) {this._third = third;}
    /**Devuelve el tercer finalista.*/
    public Jugador getThird() {return _third;}
    //endregion

    //region Constructor
    /**Constructor completo*/
    public Podio(Jugador first, Jugador second, Jugador third){
        this.setFirst(first);
        this.setSecond(second);
        this.setThird(third);
    }
    public Podio(){}
    //endregion

    //region

    @Override
    public String toString() {
        return "Primer puesto: "+getFirst().toString()
                .concat("\nSegundo puesto: "+getSecond().toString())
                .concat("\nTercer puesto: "+getThird().toString());
    }

    //endregion Funciones
}
