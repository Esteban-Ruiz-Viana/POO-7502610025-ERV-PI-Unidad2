package Taller_4_Modificador_de_Acceso_private_en_Java.Ejercicio_1;

public class Estudiante {

    //Atributos
    private String nombre;
    private int edad;
    private double notaPromedio;

    //Constructor
    public Estudiante( String nombre, int edad, double notaPromedio ) {

         this.nombre = nombre;
         this.edad = edad;
         this.notaPromedio = notaPromedio;

    }

    //Getters Nombre
    public String getNombre() {

        return nombre;

    }

    //Setters Nombre
    public void setNombre( String nombre ) {

        this.nombre = nombre;

    }

    //Getters Edad
    public int getEdad() {

       return edad;

    }

    //Setters Edad
    public void setEdad( int edad ) {

        //Condiciones
        if ( edad >= 0 ) {

            this.edad = edad;

        }

        else {

            System.out.println( "No es una edad valida" );

        }
    }

    //Getters notaPromedio
    public double getNotaPromedio() {

        return notaPromedio;

    }

    //Setters notaPromedio
    public void setNotaPromedio( double notaPromedio ) {

        if ( notaPromedio >= 0 && notaPromedio <= 5 ) {

            this.notaPromedio = notaPromedio;

        } else {

        System.out.println( "\nLa nota debe ser del 1 al 5." );

    }
    }
}