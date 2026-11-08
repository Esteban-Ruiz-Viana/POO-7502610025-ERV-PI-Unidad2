package Taller_4_Modificador_de_Acceso_private_en_Java.Ejercicio_1;

//Crea una clase Estudiante con las propiedades nombre, edad y notaPromedio. Define:
//
//1. Todas las propiedades deben ser privadas.
//2. Proporciona métodos get y set para cada propiedad, incluyendo validaciones en los métodos set.
//3. Crea una clase de prueba para crear instancias de Estudiante y acceder a las propiedades.

public class Ejercicio_1 {

    public static void main( String[] args ) {

        //Crear el estudiante
        Estudiante estudiante1 = new Estudiante( "Sabrina", 18, 4.2 );

        //Acceder a las propiedades con los getters
        System.out.println( "Datos iniciales:" );
        System.out.println( "Nombre: " + estudiante1.getNombre() );
        System.out.println( "Edad: " + estudiante1.getEdad() );
        System.out.println( "Nota promedio: " + estudiante1.getNotaPromedio() );

        //Modificar con los setters usando valores validos
        estudiante1.setNombre( "Julieta" );
        estudiante1.setEdad( 20 );
        estudiante1.setNotaPromedio( 4.5 );

        System.out.println( "\nDatos despues de modificar:" );
        System.out.println( "Nombre: " + estudiante1.getNombre() );
        System.out.println( "Edad: " + estudiante1.getEdad() );
        System.out.println( "Nota promedio: " + estudiante1.getNotaPromedio() );

        //Probar los setters con valores invalidos
        System.out.println( "\nProbando valores invalidos:" );
        estudiante1.setEdad( -5 );
        estudiante1.setNotaPromedio( 7 );

        //Los valores no cambiaron
        System.out.println( "Edad: " + estudiante1.getEdad() );
        System.out.println( "Nota promedio: " + estudiante1.getNotaPromedio() );

    }
}