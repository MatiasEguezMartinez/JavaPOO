public class Auto {
    //region Atributos
    private Jugador _player;
    private Integer _carNumber;
    private Integer _position=0;
    //endregion

    //region Propiedades
    //Asigna el jugador.
    public void setPlayer(Jugador player) {this._player = player;}
    //Devuleve el jugador.
    public Jugador getPlayer() {return _player;}

    //Asigna el número del auto.
    public void setCarNumber(Integer carNumber) {this._carNumber = carNumber;}
    //Devuelve el número del auto.
    public Integer getCarNumber() {return _carNumber;}

    //Asigna la posición del auto.
    public void setPosition(Integer position) {this._position += position;}
    //Devuelve la posición del auto.
    public Integer getPosition() {return _position;}
    //endregion

    //region Constructor
    /**Constructor.*/
    public Auto(Jugador player, Integer carNumber){
        this.setPlayer(player);
        this.setCarNumber(carNumber);
    }
    //endregion

    //region Funciones
    public String toString(){
        return "Nombre del jugador: "+this.getPlayer().toString()
                .concat("\nNúmero del auto: "+this.getCarNumber());
    }
    /**Resetea la posición, ejandola en cero.*/
    public void ResetPosition(){this._position=0;}
    //endregion
}
