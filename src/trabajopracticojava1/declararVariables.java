
package trabajopracticojava1;

/**
 *3.	Crea un programa que declare las siguientes variables con valores asignados:
a.	String nombre
b.	int edad
c.	double altura
d.	boolean estudiante
e.	Imprime los valores en pantalla usando System.out.println().
 * 
 */
public class declararVariables {
    public static void main(String[] args){
        String nombre;
	int edad;
	double altura;
	boolean estudiante;
        nombre = "Andres Maximiliano";
        edad = 35;
        altura = 1.80;
        estudiante = true;
        System.out.println("Nombre: "+ nombre);
        System.out.println("Edad: "+ edad);
        System.out.println("Altura: "+ altura);
        System.out.println("Estudiante: "+ estudiante);
    }
}
