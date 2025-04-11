public class Persona {

    private int numid;
    private String nombre;
    private int edad;
    static int numeincremtid;

    //constructores
    public Persona() {
        this.numid=++numeincremtid;
    }

    public Persona( String nombre, int edad) {
        this();
        this.nombre = nombre;
        this.edad = edad;
    }

    //getter and setter


    public int getNumid() {
        return numid;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
}
