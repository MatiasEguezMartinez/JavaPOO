import java.util.Objects;

public class Juego {
    //region Atributos
        private Integer _vidas;
        private final Integer _vidasInicial;
        private static Integer _record;
    //endregion

    //region Propiedades
    //endregion

    //region Constructores
        public Juego(Integer vidas){
            this._vidasInicial=vidas;
            this._vidas=vidas;
            _record=0;
        }
    //endregion

    //region Funciones
        public void MuestraVidasRestantes(){
            System.out.println("Vidas restantes: "+this._vidas.toString());
        }
        public boolean QuitaVida() {
            this._vidas--;
            if (this._vidas<=0) {
                System.out.println("\n¡Juego terminado!\n");
                return false;
            }
            return true;
        }
        public void ReiniciarPartida(){this._vidas=this._vidasInicial;}
        public void ActualizaRecord(){
            if (Objects.equals(this._vidas, _record)) System.out.println("\nAlcanzó el record.\n");
            else if (this._vidas>_record) {
                _record=this._vidas;
                System.out.println("\nBatió nuevo record, este es de "+_record+".\n");
            }
        }
    //endregion
}
