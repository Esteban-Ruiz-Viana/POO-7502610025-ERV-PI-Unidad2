package Taller_4_Modificador_de_Acceso_private_en_Java.Ejercicio_3;

//Uso Incorrecto de private
//
//1. Intenta crear una clase que declare una propiedad private y accede a ella directamente desde otra clase. Observa los errores de compilación.
//2. Crea una clase que no implemente métodos get y set para un atributo private, y discute cómo podría afectar la protección de datos.

public class Ejercicio_3 {
    public static void main( String[] args ) {

        //Parte 1: acceso directo a un atributo private
        Persona persona1 = new Persona( "Juan Camilo" );

        //Error de compilacion Persona
        //System.out.println( persona1.nombre );

        //La forma correcta es usar el getter
        System.out.println( "Parte 1:" );
        System.out.println( "Nombre con getter: " + persona1.getNombre() );

        //Clase Mascota sin getter ni setter
        Mascota mascota1 = new Mascota( "Nina" );

        System.out.println( "\nParte 2:" );
        System.out.println( "Mascota creada, pero no hay forma de leer ni cambiar su nombre." );

        //Error de compilacion Mascota
        //System.out.println( mascota1.nombre );

    }
}
