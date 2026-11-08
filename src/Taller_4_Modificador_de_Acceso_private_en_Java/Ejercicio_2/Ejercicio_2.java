package Taller_4_Modificador_de_Acceso_private_en_Java.Ejercicio_2;

//Crea una clase Coche con las propiedades marca, modelo y velocidadMaxima. Define:
//
//1. Todas las propiedades deben ser privadas.
//2. Proporciona un método acelerar que incremente velocidadMaxima solo si el incremento es positivo.
//3. Crea una clase de prueba que intente acceder a las propiedades directamente y observa los errores de compilación.

public class Ejercicio_2 {

    public static void main( String[] args ) {

        //Crear el coche
        Coche coche1 = new Coche( "Toyota", "Prado", 210 );

        //Acceder a las propiedades con los getters
        System.out.println( "Datos iniciales:" );
        System.out.println( "Marca: " + coche1.getMarca() );
        System.out.println( "Modelo: " + coche1.getModelo() );
        System.out.println( "Velocidad maxima: " + coche1.getVelocidadMaxima() );

        //Acelerar con un incremento positivo
        coche1.acelerar( 20 );
        System.out.println( "\nDespues de acelerar 20:" );
        System.out.println( "Velocidad maxima: " + coche1.getVelocidadMaxima() );

        //Acelerar con un incremento negativo
        System.out.println( "\nProbando un incremento negativo:" );
        coche1.acelerar( -10 );
        System.out.println( "Velocidad maxima: " + coche1.getVelocidadMaxima() );

        //Intentar acceder directamente a las propiedades creando errores
        //System.out.println( coche1.marca );
        //System.out.println( coche1.modelo );
        //coche1.velocidadMaxima = 300;

    }
}