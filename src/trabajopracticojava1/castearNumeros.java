package trabajopracticojava1;
import java.util.Scanner;
/**
 *8.	Manejar conversiones de tipo y división en Java.
a.	Escribe un programa que divida dos números enteros ingresados por el usuario.
b.	Modifica el código para usar double en lugar de int y compara los resultados.

 * 
 */
public class castearNumeros {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        int num1, num2, divisionEntera;
        double divisionDecimal;
        System.out.print("Ingrese el primer numero entero: ");
        num1 = Integer.parseInt(input.nextLine());
        System.out.print("Ingrese el segundo numero entero: ");
        num2 = Integer.parseInt(input.nextLine());
        divisionEntera = num1 / num2;
        divisionDecimal = (double)num1 / num2;
        System.out.println("La division entera entre el valor: "+num1+" y el valor: "+num2+" es: "+divisionEntera);
        System.out.println("La division decimal entre el valor: "+num1+" y el valor: "+num2+" es: "+divisionDecimal);
    }
}
