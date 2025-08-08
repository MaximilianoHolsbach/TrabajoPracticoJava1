package trabajopracticojava1;

/**
 *6.	Escribe un programa que muestre el siguiente mensaje en consola:
 * Nombre: Juan Pérez 
Edad: 30 años 
Dirección: "Calle Falsa 123"
Usa caracteres de escape (\n, \") en System.out.println().

 */
public class saltoDeLinea {
    public static void main(String[]args){
        String Nombre = "Juan Pérez";
        int Edad = 30;
        String Dirección = "Calle Falsa 123";
        System.out.println("Nombre: "+Nombre+"\n"+"Edad: "+ Edad +" años"+"\n"+"Direccion: "+"\""+Dirección+"\"");
    }
}
