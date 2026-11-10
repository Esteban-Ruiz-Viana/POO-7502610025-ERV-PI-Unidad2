package Taller_5_Modificador_de_Acceso_de_Paquete.Ejercicio_2.Vehiculo;

public class Vehiculo {

    //Atributo (default)
    String tipo;

    //Constructor
    public Vehiculo( String tipo ) {

        this.tipo = tipo;

    }

    //Metodo
    void mostrarTipo() {

        System.out.println( "Tipo: " + tipo );

    }
}
