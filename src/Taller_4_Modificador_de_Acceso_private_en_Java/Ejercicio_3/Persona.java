package Taller_4_Modificador_de_Acceso_private_en_Java.Ejercicio_3;

public class Persona {

    //Atributo privado
    private String nombre;

    //Constructor
    public Persona( String nombre ) {

        this.nombre = nombre;

    }

    //Getter Nombre
    public String getNombre() {

        return nombre;

    }
}