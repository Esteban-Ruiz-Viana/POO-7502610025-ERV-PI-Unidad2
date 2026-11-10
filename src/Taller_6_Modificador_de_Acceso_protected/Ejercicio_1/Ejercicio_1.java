package Taller_6_Modificador_de_Acceso_protected.Ejercicio_1;

//1. Crea una clase Empleado con las propiedades nombre y salario como protected.
//2. Crea una clase Gerente que herede de Empleado y tenga una propiedad adicional departamento.
//3. En la clase Gerente, sobrescribe un método mostrarInformacion para mostrar todos los detalles
// del empleado y el gerente.

public class Ejercicio_1 {

        public static void main( String[] args ) {

            Empleado empleado1 = new Empleado( "Esteban", 2500000 );
            Gerente gerente1 = new Gerente( "Jose Eduardo", 5000000, "Ventas" );

            empleado1.mostrarInformacion();
            gerente1.mostrarInformacion();

        }
}
