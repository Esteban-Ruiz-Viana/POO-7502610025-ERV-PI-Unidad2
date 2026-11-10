package Taller_6_Modificador_de_Acceso_protected.Ejercicio_2.Prueba;

import Taller_6_Modificador_de_Acceso_protected.Ejercicio_2.Vehiculos.Moto;
import Taller_6_Modificador_de_Acceso_protected.Ejercicio_2.Vehiculos.Vehiculo;

//1. Define una clase Vehículo con las propiedades tipo y marca como protected.
//2. Crea una subclase Moto que herede de Vehículo y tenga una propiedad adicional cilindrada.
//3. En una clase de prueba, intenta acceder a los miembros protected desde una clase no relacionada y observa los errores de compilación.

public class Ejercicio_2 {

    public static void main( String[] args ) {

        Vehiculo vehiculo1 = new Vehiculo( "Carro", "Lamborgini" );
        Moto moto1 = new Moto( "Deportiva", "Suzuki", 900 );

        //Metodo public
        moto1.mostrarMoto();

        //Errores: "has protected access"
        //System.out.println( vehiculo1.tipo );
        //System.out.println( vehiculo1.marca );
        //System.out.println( moto1.tipo );

    }
}