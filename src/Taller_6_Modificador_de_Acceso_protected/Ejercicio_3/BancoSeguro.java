package Taller_6_Modificador_de_Acceso_protected.Ejercicio_3;

//Solucion: saldo private con metodos controlados

public class BancoSeguro {

    private double saldo;

    public BancoSeguro( double saldo ) {

        this.saldo = saldo;

    }

    public double getSaldo() {

        return saldo;

    }

    public void depositar( double monto ) {

        if ( monto > 0 ) {

            saldo += monto;

        }

        else {

            System.out.println( "El monto debe ser positivo." );

        }
    }

    public void retirar( double monto ) {

        if ( monto > 0 && monto <= saldo ) {

            saldo -= monto;

        }

        else {

            System.out.println( "Monto invalido o saldo insuficiente." );

        }
    }
}