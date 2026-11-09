package Taller_5_Modificador_de_Acceso_de_Paquete.Ejercicio_3;

//1. Crea una clase Persona con los atributos nombre (privado) y edad (de paquete). Define métodos get y set para nombre.
//2. Crea una clase de prueba dentro del mismo paquete y verifica qué atributos y métodos son accesibles.
//3. Discute las diferencias de acceso entre los atributos private y de paquete.

public class Ejercicio_3 {
    public static void main( String[] args ) {

    Persona persona1 = new Persona( "Esteban", 18 );

    //Nombre (private): con getter y setter
    System.out.println( "Nombre: " + persona1.getNombre() );
    persona1.setNombre( "Luis" );
    System.out.println( "Nuevo nombre: " + persona1.getNombre() );

    //Edad (default): acceso directo
    System.out.println( "Edad: " + persona1.edad );
    persona1.edad = -3;
    System.out.println( "Edad invalida aceptada: " + persona1.edad );

    //Error: nombre es private
    //System.out.println( persona1.nombre );

    }
}