package Taller_6_Modificador_de_Acceso_protected.Ejercicio_1;

public class Gerente extends Empleado {

    //Atributo adicional
    private String departamento;

    //Constructor
    public Gerente( String nombre, double salario, String departamento ) {

        //Llama al constructor de Empleado
        super( nombre, salario );
        this.departamento = departamento;

    }

    //Sobrescribe el metodo de Empleado
    @Override
    public void mostrarInformacion() {

        //Usa directamente nombre y salario porque son protected
        System.out.println( "\nGerente: " + nombre + "\nSalario: $" + salario + "\nDepartamento: " + departamento );

    }
}