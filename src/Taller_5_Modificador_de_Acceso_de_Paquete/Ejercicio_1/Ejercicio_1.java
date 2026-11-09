package Taller_5_Modificador_de_Acceso_de_Paquete.Ejercicio_1;

//Crea una clase Producto con las propiedades nombre, precio y stock. Define:
//
//1. Todas las propiedades deben tener acceso de paquete (default).
//2. Crea un constructor con acceso de paquete que inicialice todas las propiedades.
//3. Crea un método mostrarInfo() con acceso de paquete para mostrar los detalles del producto.
//4. Crea una clase de prueba dentro del mismo paquete y verifica que se pueden acceder correctamente a los miembros.

public class Ejercicio_1 {

    public static void main( String[] args ) {

        Producto producto = new Producto( "Teclado", 85000, 12 );

        producto.mostrarInfo();

        //Mismo paquete: acceso directo
        producto.stock = 20;
        System.out.println( "Stock: " + producto.stock );

        //Compila, pero es mala practica
        producto.precio = -100;
        System.out.println( "Precio: " + producto.precio );

    }
}