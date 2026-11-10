package Taller_5_Modificador_de_Acceso_de_Paquete.Ejercicio_2.Vehiculo;

public class Moto extends Vehiculo {

    //Atributo (default)
    int cilindraje;

    //Constructor
    public Moto( String tipo, int cilindraje ) {

        //Llama al constructor de Vehiculo
        super( tipo );
        this.cilindraje = cilindraje;

    }

    //Metodo
    public void mostrarMoto() {

        //Aqui si se puede usar tipo, porque Moto esta en el mismo paquete que Vehiculo
        System.out.println( "Moto " + tipo + " de " + cilindraje + " cc" );

    }
}
