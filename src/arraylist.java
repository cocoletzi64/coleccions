import java.util.*;

public class arraylist {
    public static void main(String[] args) {

        List<Persona> lista = new LinkedList<Persona>();

        lista.add(new Persona("Erick",25));
        lista.add(new Persona("Luisina",30));
        lista.add(new Persona("Gabriela",15));
        lista.add(new Persona("Luis",12));
        //agregar al principio
        lista.add(0,new Persona("Dolores",53));
        lista.add(5,new Persona("Dolores",53));



        System.out.println("-----------FOREACH-------------");
        //foreach
        for(Persona perso:lista){
            System.out.println("ID: "+perso.getNumid());
            System.out.println("NOMBRE: "+perso.getNombre());
            System.out.println("EDAD: "+perso.getEdad());
        }
    }
}
