package Taller_5_Modificador_de_Acceso_de_Paquete.Ejercicio_1;

public class Producto {

    // Atributos (default)
    String nombre;
    double precio;
    int stock;

    // Constructor
    Producto( String nombre, double precio, int stock ) {

        this.nombre = nombre;
        this.precio = precio;
        this.stock = stock;

    }

    // Metodo
    void mostrarInfo() {

        System.out.println( "Nombre: " + nombre + ", Precio: " + precio + ", Stock: " + stock );

    }
}
