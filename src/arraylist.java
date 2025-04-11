import java.util.*;

public class arraylist {
    public static void main(String[] args) {

        List<Persona> lista = new ArrayList<Persona>();
        lista.add(new Persona("Erick",25));
        lista.add(new Persona("Luisina",30));
        lista.add(new Persona("Gabriela",15));
        lista.add(new Persona("Luis",12));

        //reccorer
        System.out.println("----------- FOR-------------");
        for(int i=0; i<lista.size(); i++){
            System.out.println("ID: "+lista.get(i).getNumid());
            System.out.println("NOMBRE: "+lista.get(i).getNombre());
            System.out.println("EDAD: "+lista.get(i).getEdad());
        }
        System.out.println("-----------FOREACH-------------");

        //foreach
        for(Persona perso:lista){
            System.out.println("ID: "+perso.getNumid());
            System.out.println("NOMBRE: "+perso.getNombre());
            System.out.println("EDAD: "+perso.getEdad());
        }
    }
}
