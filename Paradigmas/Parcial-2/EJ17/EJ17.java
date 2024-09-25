//Librerias
import java.util.Scanner;

public class EJ17 
{
    public static void main(String[] args)
    {
        System.out.println("\n||--------------------Ejercicio 16----------------------||\n");

        //Variables
        Scanner scanner = new Scanner(System.in);
        Short edad = 0;
        Short saldo = 0;

        do
        {
            edad = PedirValor("edad", (short)0, (short)120);
        }while (MayorEdad(edad) == false);
        
        toString(edad);
        

    }
    //Metodos
    public static short PedirEdad()
    {
        Scanner scanner = new Scanner(System.in);
        short edad = 0;
        String Dato = "";
        boolean valido = true;
        do
        {
        System.out.print("Edad: ");
        Dato = scanner.nextLine();

        for (int i = 0; i < Dato.length(); i++) 
            if(!Character.isDigit(Dato.charAt(i))) valido = false;

        if(valido) edad = Short.parseShort(Dato);
        }while(edad < 0 || edad > 120 || !valido);
        return edad;
    }

    public static short PedirValor(String msg, short min, short max) 
    {
        {
            Scanner scanner = new Scanner(System.in);
            short valor = 0;
            String Dato = "";
            boolean valido = true;
            do
            {
            System.out.print(msg + ": ");
            Dato = scanner.nextLine();

            for (int i = 0; i < Dato.length(); i++) 
                if(!Character.isDigit(Dato.charAt(i))) valido = false;

            if(valido) valor = Short.parseShort(Dato);
            }while(valor < min || valor > max || !valido);
            return valor;
        }
    }

    public static boolean MayorEdad(short edad)
    {
        if(edad > 17) return true;
        else return false;
    }

    public static void toString(short edad)
    {
        System.out.println("\n||------------------------------------------------------||\n");
        System.out.println("Datos personales");
        System.out.println("Tu edad es: " + edad);
        //System.out.printf("%.2f", IMC);
        System.out.println();
        System.out.println("||------------------------------------------------------||\n");
    }
}
