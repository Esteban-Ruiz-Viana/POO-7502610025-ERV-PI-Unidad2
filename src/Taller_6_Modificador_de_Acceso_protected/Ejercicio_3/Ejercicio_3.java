package Taller_6_Modificador_de_Acceso_protected.Ejercicio_3;

//1. Crea una clase Banco con la propiedad saldo como protected. Discute por qué no es segura y cómo mejorar.
//2. Propón una solución para encapsular la propiedad saldo de manera adecuada.

public class Ejercicio_3 {

    public static void main( String[] args ) {

        //Version insegura: mismo paquete, acceso directo
        BancoErroneo banco1 = new BancoErroneo( 1000 );
        banco1.saldo = -5000;
        System.out.println( "Saldo inseguro: " + banco1.saldo );

        //Version segura
        System.out.println( "\nPrueba segura del banco ");

        BancoSeguro banco2 = new BancoSeguro( 1000 );
        banco2.depositar( 500 );
        banco2.retirar( 200 );
        banco2.retirar( 9999 );
        System.out.println( "Saldo seguro: " + banco2.getSaldo() );

        //Error: saldo es private
        //banco2.saldo = -5000;

    }
}