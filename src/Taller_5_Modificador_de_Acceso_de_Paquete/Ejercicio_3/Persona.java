package Taller_5_Modificador_de_Acceso_de_Paquete.Ejercicio_3;

public class Persona {

    //Atributos
    private String nombre;
    int edad;

    //Constructor
    public Persona( String nombre, int edad ) {

        this.nombre = nombre;
        this.edad = edad;

    }

    //Getter Nombre
    public String getNombre() {

        return nombre;

    }

    //Setter Nombre
    public void setNombre( String nombre ) {

        this.nombre = nombre;

    }
}