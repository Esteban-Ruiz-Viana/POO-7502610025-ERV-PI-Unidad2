package Taller_6_Modificador_de_Acceso_protected.Ejercicio_1;

public class Empleado {

    //Atributos ( protected )
    protected String nombre;
    protected double salario;

    //Constructor
    public Empleado( String nombre, double salario ) {

        this.nombre = nombre;
        this.salario = salario;

    }

    //Metodo
    public void mostrarInformacion() {

        System.out.println( "\nEmpleado" + "\nNombre: " + nombre + "\nSalario: $" + salario );

    }
}