//Librerias
import java.util.Scanner;

public class Examen 
{
    //Main
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);

        String nombre = " ";
        int contador = 0;
        String vocales = "AEIOU";
        char VerChar;
        char VerVocales;

        //pide el nombre del usuairo
        System.out.println("Dame tu nombre: ");
        nombre = scanner.nextLine().toUpperCase();

        //verifica si el nombre no esta en blanco o si es mayor a 2
        if(nombre.length() != 0 || nombre.length() >= 2)
        {
            for (int i = 0; i < nombre.length(); i++) 
            {
                switch (nombre.charAt(i)) {
                    case 'A' -> contador++;
                    case 'E' -> contador++;
                    case 'I' -> contador++;
                    case 'O' -> contador++;
                    case 'U' -> contador++;
                }
            } 
            System.out.println("El nombre tiene: " + contador + " vocales");
        }
        else
            System.out.println("No puede estar vacio o debe tener 2 letras! ");
    }
    //Metodos
}
