package Taller_6_Modificador_de_Acceso_protected.Ejercicio_3;

//Mala practica: saldo protected

public class BancoErroneo {

    protected double saldo;

    public BancoErroneo( double saldo ) {

        this.saldo = saldo;

    }
}