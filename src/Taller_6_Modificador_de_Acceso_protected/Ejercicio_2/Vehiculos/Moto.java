package Taller_6_Modificador_de_Acceso_protected.Ejercicio_2.Vehiculos;

public class Moto extends Vehiculo {

    //Atributo adicional
    private int cilindrada;

    //Constructor
    public Moto( String tipo, String marca, int cilindrada ) {

        super( tipo, marca );
        this.cilindrada = cilindrada;

    }

    //Metodo public
    public void mostrarMoto() {

        //Usa tipo y marca porque son protected
        System.out.println( "\nTipo: " + tipo + "\nMarca: " + marca + "\nCilindrada: " + cilindrada + " cc" );

    }
}