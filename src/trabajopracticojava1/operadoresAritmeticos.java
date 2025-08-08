package trabajopracticojava1;
import java.util.Scanner;

/**
 *5.	Escribe un programa que solicite dos números enteros y realice las siguientes operaciones:
a.	Suma
b.	Resta
c.	Multiplicación
d.	División
e.	Muestra los resultados en la consola.

 * 
 */
public class operadoresAritmeticos {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        int num1, num2;
        System.out.print("Ingrese el primer numero entero: ");
        num1 = Integer.parseInt(input.nextLine());
        System.out.print("Ingrese el segundo numero entero: ");
        num2 = Integer.parseInt(input.nextLine());
        System.out.println("Suma: "+ (num1 + num2));
        System.out.println("Resta: "+ (num1 - num2));
        System.out.println("Multiplicacion: "+ (num1 * num2));
        System.out.println("Division: "+ (num1 / num2));
    }
}
