import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class JuegoCarreras {
    //region Atributos
    private static List<Jugador> jugadores=new ArrayList<>();
    private static List<Auto> autos=new ArrayList<>();
    private static final List<Pista> pistas=new ArrayList<>();
    private static final List<Podio> podios=new ArrayList<>();
    private final static Scanner input=new Scanner(System.in);
    //endregion

    //region Funciones
    public static void main(String[] args) {
        String menu= """
                
                ░░░░░░░░░░░░░░░░░░░░░░░░░░░
                ░░                       ░░
                ░░  ¡Juego de carreras!  ░░
                ░░                       ░░
                ░░░░░░░░░░░░░░░░░░░░░░░░░░░
                
                """;
    String opcion,opciones="Opción 1 - Iniciar carrera.\nOpción 2 - Agregar jugador y vehiculo.\nOpción 3 - Quitar jugador y vehiculo.\nOpción 4 - Agregar pista.\nOpción 5 - Listar jugadores y vehiculos.\nOpción 6 - Listar podios.\nOpción 7 - Listar pistas.\nCualquier otro caracter para salir.\n";
        boolean bandera=true;
        while (bandera){
            System.out.print(menu+opciones);
            opcion= input.next();
            switch (opcion){
                case "1"->
                    IniciarCarrera();

                case "2"->{
                    boolean seguir;
                    do {
                        seguir=!CrearJugadoryAuto();
                    }while (seguir);
                }
                case "3"->EliminarJugadoryAuto();
                case "4"->CrearPista();
                case "5"->System.out.println(ListarJugadoryAuto());
                case "6"->System.out.println(ListarPodio());
                case "7"->System.out.println(ListarPistas());
                default -> {
                    System.out.print("¿Realmente desea salir? (SI/NO) ");
                    if ("SI".equals(input.next().trim().toUpperCase()))bandera=false;
                }
            }

        }
        System.out.println("\n¡Hasta luego!\n");
    }

    /**Realiza la lógica del juego*/
    private static void IniciarCarrera(){
        autos.forEach(car->car.ResetPosition());
        if (autos.isEmpty()) System.out.println("Debe anteriormente ingresar jugadores y vehículos.\n");
        else if (autos.size()<3) System.out.println("Debe ingresar al menos 3 jugadores y vehículos.\n");
        else if (pistas.isEmpty()) System.out.println("Debe anteriormente ingresar una pista.\n");
        else {
            Pista track = ElegirPista();
            Podio podio = new Podio();
            System.out.println("""
                    ┌─────────────────────┐
                    │ ¡Inicia la carrera! │
                    └─────────────────────┘   
                       
                    """);
            boolean bandera = true;
            input.nextLine();
            do {
                for (Auto auto : autos) {
                    if ((null!=podio.getFirst() && auto.getPlayer().toString().equals(podio.getFirst().toString())) || (null!=podio.getSecond() && auto.getPlayer().toString().equals(podio.getSecond().toString())))
                        continue; /*Primero verifico que el jugador no haya llegado a la meta.*/

                    System.out.print("Jugador " + auto.getPlayer().getName() + " presione enter para lanzar el dado. ");
                    input.nextLine();
                    int dado = (int) (Math.random() * 6);
                    if (dado==0) dado++;
                    int distancia = dado * 100;
                    System.out.println(auto.getPlayer().getName() + " sacó el número " + dado + " al girar el dado, avanza " + distancia + "mts.");
                    auto.setPosition(distancia);

                    if (track.getSize() <= auto.getPosition()) {/*Verifico si pasó la linea de meta.*/
                        if (podio.getFirst() == null) {
                            podio.setFirst(auto.getPlayer());
                            System.out.println("¡¡Felicidades " + auto.getPlayer().toString() + " eres el primero!!\n");
                        } else if (null == podio.getSecond()) {
                            podio.setSecond(auto.getPlayer());
                            System.out.println("¡¡Felicidades " + auto.getPlayer().toString() + " eres el segundo!!\n");
                        } else {/*Si entra al tercero el juego terminó.*/
                            podio.setThird(auto.getPlayer());
                            System.out.println("¡¡Felicidades " + auto.getPlayer().toString() + " eres el tercero!!");
                            System.out.println("\n¡¡La carrera finalizó!!\n");
                            bandera = false;
                            podios.add(podio);
                            break;
                        }
                    }else System.out.println("Restan " +(track.getSize()-auto.getPosition())+"mts.\n");
                }
            } while (bandera);
        }
    }

    /**Solicita los datos para crear, guarda un jugador y un auto en las colecciones. Devuelve true si lo guardó, de lo contrario false.*/
    private static boolean CrearJugadoryAuto() {
        System.out.print("Ingrese el nombre del jugador. ");
        String name = input.next().trim();
        //Evaluo si ya esta registrado el jugador, si la colección es vacía .anyMatch devuelve false.
        if (jugadores.stream().anyMatch(jugador -> name.toUpperCase().equals(jugador.toString().toUpperCase()))) {
            System.out.println("El jugador " + name + " ya se encuentra registrado.\n");
            return false;
        }
        Jugador player=new Jugador(name);
        jugadores.add(player);
        System.out.println("El jugador "+name+" fue agregado con éxito.\n");

        boolean bandera;//Evaluo si el número del auto ya existe.
        do{
            try {
                bandera=false;
                System.out.print("Ingrese el número del auto que urilizará el jugador " + name + ". ");
                int carNumber = Integer.parseInt(input.next());
                if (autos.stream().anyMatch(auto -> carNumber == auto.getCarNumber())) {
                    System.out.println("El número " + carNumber + " ya se encuentra asignado a un auto.\n");
                    bandera = true;
                }
                else {
                    autos.add(new Auto(player, carNumber));
                    System.out.println("El jugador " + name + " con el auto número " + carNumber + " fue inscripto.\n");
                }
            }catch (Exception ex) {System.out.println("El número es incorecto, debe ser entero.\n"); bandera=true;}
        }while (bandera);

        return true;
    }
    /**Solicita los datos necesarios para remover un jugador y su vehículo.*/
    private static void EliminarJugadoryAuto(){
        System.out.print("Ingrese el nombre del jugador que desea quitar. ");
        String name= input.next().trim();
        if (autos.removeIf(auto -> name.toUpperCase().equals(auto.getPlayer().getName())) && jugadores.removeIf(jugador -> name.toUpperCase().equals(jugador.toString().toUpperCase()))) {
            System.out.println("Jugador "+name+" y su auto fueron eliminados con éxito.");
        }
        else System.out.println("No hay registros de un jugador con nombre "+name+".");
    }

    /**Solicita los datos necesarios y crea una pista.*/
    private static void CrearPista() {
        String name = "";
        boolean bandera = true;
        while (bandera) {
            try {
                if ("".equals(name)) {
                    System.out.print("Ingrese el nombre de la pista. ");
                    name = input.next().trim().toUpperCase();
                }
                else {
                    System.out.print("Ingrese los kilometros de largo que tiene la pista. ");
                    pistas.add(new Pista(name, Float.parseFloat(input.next())*1000));
                    bandera = false;
                }
            } catch (Exception ex) {System.out.println("\nEl largo debe ser un número.\n");}
        }
        System.out.println("\nLa pista se agregó con éxito.\n");
    }

    /**Devuelve un string con todos los jugadores y sus vehículos.*/
    private static String ListarJugadoryAuto(){
        if (autos.isEmpty()) return "No hay registros. ";
        String datos="";
        for (Auto item :autos){datos+="\n"+item.toString()+"\n";}
        return datos;
    }

    /**Devuelve un String con todos los podios.*/
    private static String ListarPodio() {
        String resultado="";
        if (podios.isEmpty())
            resultado="No hay registros. ";
        else
            for(Podio item:podios){resultado+="\n"+item.toString()+"\n";}
        return resultado;
    }

    /**Devuelve un String con todas las pistas de carrera creadas.*/
    private static String ListarPistas(){
        String resultado="";
        if (pistas.isEmpty())
            resultado="No hya registros. ";
        else
            for(Pista item:pistas){resultado+="\n"+item.toString()+"\n";}
        return resultado;
    }

    /**Solicita los datos necesarios para seleccionar una pista de la colección.*/
    private static Pista ElegirPista(){
        if (pistas.size()==1) return pistas.get(0);
        int eleccion=0;
        boolean bandera;
        do {
            try {
                bandera=false;
                System.out.println("Ingrese la opción de la pista que desea.\n");
                String opciones = "";
                for (int i = 0; i < pistas.size(); i++) {
                    opciones =opciones+ "\nOpción " + i + ": " + pistas.get(i).toString() + "\n";
                }
                System.out.print(opciones);
                eleccion = Integer.parseInt(input.next());
            } catch (Exception ex) {System.out.println("Debe ingresar un número.\n"); bandera=true;}
        }while (bandera);
        return pistas.get(eleccion);
    }
    //endregion
}
