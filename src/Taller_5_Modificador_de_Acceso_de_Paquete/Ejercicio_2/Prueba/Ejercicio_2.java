package Taller_5_Modificador_de_Acceso_de_Paquete.Ejercicio_2.Prueba;

import Taller_5_Modificador_de_Acceso_de_Paquete.Ejercicio_2.Vehiculo.Moto;
import Taller_5_Modificador_de_Acceso_de_Paquete.Ejercicio_2.Vehiculo.Vehiculo;

//1. Define una clase Vehículo en el paquete vehiculos con la propiedad tipo de paquete.
//2. Define una clase Moto en el paquete vehiculos que herede de Vehículo.
//3. Crea una clase de prueba en otro paquete e intenta acceder a los miembros de Vehículo y Moto.
//   Observa los errores de compilación y discute por qué suceden.

public class Ejercicio_2 {

    public static void main( String[] args ) {

        //Crear los objetos
        Vehiculo vehiculo1 = new Vehiculo( "Carro" );
        Moto moto1 = new Moto( "Deportiva", 1200 );

        //Metodo public: si se puede usar desde otro paquete
        System.out.println( "Lo que si compila:" );
        moto1.mostrarMoto();

        //Intentar acceder desde otro paquete creando errores
        //System.out.println( vehiculo1.tipo );
        //vehiculo1.mostrarTipo();
        //System.out.println( moto1.cilindraje );
        //System.out.println( moto1.tipo );

    }
}