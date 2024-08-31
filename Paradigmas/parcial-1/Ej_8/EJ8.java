//! Ejercicio 8 Metodos

//Librerias
import java.util.Scanner;


public class EJ8
{

    //Main
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        String nombre;
        boolean correcto = false;

        Metodos.saludo();
        Metodos.Adios();

        do
        {
        System.out.println("Nombre: ");
        nombre = scanner.nextLine();
        correcto = Valida.StrVacio(nombre);

        }while(correcto == false);
    }

    //Funciones


}
