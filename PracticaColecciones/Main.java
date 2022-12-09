import java.util.LinkedHashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Set<ClassUsuario> Usuarios=new LinkedHashSet<ClassUsuario>();

        Usuarios.add(new ClassUsuario("Matías Egüez","Av. San Martin exq. Chimborazo","+59899490910"));
        Usuarios.add(new ClassUsuario("Juan Bautista","Cotopaxi esq. San Miguel","+59822229271"));
        Usuarios.add(new ClassUsuario("Jesús Rodriguez","Av. de la Playa esq. Av. Giannattasio","+59820305018"));

        for (ClassUsuario user:Usuarios) {
            System.out.println("\nNombre: "+user.getName()+
                               "\nDirección: "+user.getDirection()+
                               "\nTeléfono: "+user.getPhone()+"\n");
        }
    }
}
