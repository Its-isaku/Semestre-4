// Librerias
import java.util.Scanner;

// Clase principal
public class EJ3
{
    public static void main(String[] args) 
    {

        Scanner scanner = new Scanner(System.in);
    
        // Variables para almacenar datos y iniciales
        char[] iniciales = new char[10];
        String nombre;
        String paterno;
        String materno;
        
        System.out.println("--------------------------\n");
        System.out.println("Ejercicio 3\n");
        System.out.println("--------------------------\n");
        
        do
        {
            System.out.println("Nombre: ");
            nombre = scanner.nextLine();
            if(nombre.length() == 0)
                System.out.println("no hay datos!\n");

        }while(nombre.length() == 0 || NoNum(nombre) == false || SoloLetras(nombre) == false);

        do
        {
            System.out.println("Apellido paterno: ");
            paterno = scanner.nextLine();
            if(paterno.length() == 0)
                System.out.println("no hay datos!\n");
            
        }while(paterno.equals("") || NoNum(paterno) == false || SoloLetras(paterno) == false);

        do{
            System.out.println("Apellido materno: ");
            materno = scanner.nextLine();
            
        }while(materno.compareTo("") == 0 || NoNum(materno) == false || SoloLetras(materno) == false);


        System.out.println("\n");

        iniciales[0] = paterno.toUpperCase().charAt(0);
        iniciales[1] = Vocalpaterno(paterno);
        iniciales[2] = materno.toUpperCase().charAt(0);
        iniciales[3] = nombre.toUpperCase().charAt(0);

        System.out.println("--------------------------\n");
        System.out.println("Comporbando datos:\n");
        System.out.println(nombre +  " "  + paterno + " " + materno + "\n");
        System.out.println("--------------------------\n");
        System.out.println("Iniciales:\n");
        Desplear_arreglo(iniciales);
        System.out.println("\n");
        System.out.println("--------------------------\n");
                

    }
    
    // metodo para desplegar el arreglo
    public static void Desplear_arreglo(char[] a)
    {
        for (int i = 0; i < a.length; i++)
            System.out.print(a[i]);
        
    }

    //metodo para verificar que no arrojen numeros
    public static boolean NoNum(String cadena)
    {
        for(int index = 0; index < cadena.length(); index++)
        {
            if(Character.isDigit(cadena.charAt(index)))
            {
                System.out.println("No puede contener numeros!");
                return false;
            }
        }
        return  true;

    }

    // metod para verificar que solo arrojen letras
    public static boolean SoloLetras(String cadena)
    {
        for(int index = 0; index < cadena.length(); index++)
        {
            if(!Character.isAlphabetic(cadena.charAt(index)))
            {
                System.out.println("Solo puede tener letras!");
                return false;
            }
        }
        return  true;

    }

    public static char Vocalpaterno(String cadena)
    {
        cadena = cadena.toUpperCase();
        String Vocales = "AEIOU";

        for (int i = 1; i < cadena.length(); i++)
        {
            if(Vocales.indexOf(cadena.charAt(i)) != -1)
                return cadena.charAt(i);
        }
        return ' ';
    }
}
