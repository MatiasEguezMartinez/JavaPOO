public class Aplicacion {
    public static void main(String[] args) {
        Juego juego1 = new Juego(5);
        juego1.QuitaVida();
        juego1.MuestraVidasRestantes();
        juego1.ReiniciarPartida();
        juego1.MuestraVidasRestantes();

        Juego juego2 = new Juego(5);
        juego1.ActualizaRecord();
        juego2.ActualizaRecord();
    }
}
