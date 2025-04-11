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



        System.out.println("-----------FOREACH-------------");
        //foreach
        for(Persona perso:lista){
            System.out.println("ID: "+perso.getNumid());
            System.out.println("NOMBRE: "+perso.getNombre());
            System.out.println("EDAD: "+perso.getEdad());
        }
        String nombre="Gabriela";
        for(Persona perso2:lista){
            if(perso2.getNombre().equals(nombre)){
                lista.remove(perso2);
                break;
            }
        }
        System.out.println("--------------------DELETE--------------");
        for(Persona perso:lista){
            System.out.println("ID: "+perso.getNumid());
            System.out.println("NOMBRE: "+perso.getNombre());
            System.out.println("EDAD: "+perso.getEdad());
        }

        System.out.println("size:"+lista.size());//4 porque removi uno
        System.out.println("getfirst:"+lista.getFirst());//dolores es en teoria el primero en la lista porque yo lo agregue con el indice
        System.out.println("getlast:"+lista.getLast());
        System.out.println("vaciando la lista");
        lista.clear();
        System.out.println("is empty? "+lista.isEmpty());




    }
}
