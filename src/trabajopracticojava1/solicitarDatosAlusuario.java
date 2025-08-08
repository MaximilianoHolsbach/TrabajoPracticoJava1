package trabajopracticojava1;
import java.util.Scanner;
/**
 *4 Escribe un programa que solicite al usuario ingresar su nombre y edad, y luego los muestre en pantalla. Usa Scanner para capturar los datos
 *
 */
public class solicitarDatosAlusuario {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String nombre;
	int edad;
	double altura;
        System.out.print("Ingrese su nombre: ");
        nombre = input.nextLine();
        System.out.print("Ingrese su edad: ");
        edad = Integer.parseInt(input.nextLine());
        System.out.print("Ingrese su altura: ");
        altura = Double.parseDouble(input.nextLine());
        System.out.println("Buenos días "+ nombre + " tu edad es: "+ edad + ", tienes una altura de: "+ altura + "m.");
    }
}
