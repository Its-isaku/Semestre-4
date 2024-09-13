//! Ejercicio 8 Metodos

//Librerias
import java.util.Scanner;


public class EJ8
{

    //Main
    public static void main(String[] args)  
    {
        // Declaro variables
        Scanner scanner = new Scanner(System.in);
        String nombre;
        boolean correcto = false;
        int edad = 0;
        Metodos.saludo();
        Metodos.Adios();

        // pregunto el nombre hasta que cumpla las validaciones
        do
        {
        System.out.println("Nombre: ");
        nombre = scanner.nextLine();
        correcto = Valida.StrVacio(nombre);

        }while(correcto == true || Valida.SoloLetras(nombre) == false);

        // pregunto la edad hasta que cumpla las validaciones
        do{
        System.out.println("Dame tu edad: ");
        edad = Integer.parseInt(scanner.nextLine());
        }while(Valida.positivos(edad) == false);
        
    }

    //Funciones

}
