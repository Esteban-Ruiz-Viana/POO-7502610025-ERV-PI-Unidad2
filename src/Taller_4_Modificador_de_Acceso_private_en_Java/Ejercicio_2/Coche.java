package Taller_4_Modificador_de_Acceso_private_en_Java.Ejercicio_2;

public class Coche {

    //Atributos
    private String marca;
    private String modelo;
    private double velocidadMaxima;

    //Constructor
    public Coche( String marca, String modelo, double velocidadMaxima ) {

        this.marca = marca;
        this.modelo = modelo;
        this.velocidadMaxima = velocidadMaxima;

    }

    //Getters
    public String getMarca() {

        return marca;

    }

    public String getModelo() {

        return modelo;

    }

    public double getVelocidadMaxima() {

        return velocidadMaxima;

    }

    //Metodo acelerar
    public void acelerar( double incremento ) {

        //Condicion
        if ( incremento > 0 ) {

            velocidadMaxima += incremento;

        }

        else {

            System.out.println( "El incremento debe ser positivo." );

        }
    }
}