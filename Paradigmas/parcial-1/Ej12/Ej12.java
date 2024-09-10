//Librerias
import java.util.Scanner;

public class Ej12 
{
    public static void main(String[] args) 
    {
        //!variables
        Scanner scanner = new Scanner(System.in);
        int edad;
        String pais = "", siglas;
        String CP;
        float[] costo = {30, 120, 70, 60}; // dolares
        //0-MEX, 1-USA, 2-CHI, 3-KR
        float dinero = 0; // dolares
        String[] paises = {"mexico", "Estados Unidos", "China", "corea"};

        //!pedir datos
        do
        {
            System.out.println("\n||----------------------------------------------------------------||\n");
            System.out.println("Edad: ");
            edad = Integer.parseInt(scanner.nextLine());
        }while(edad < 0 || edad >= 120);
        
        if (edad < 18) System.out.println("eres menor de edad!\n");
        else 
            if (edad >= 18 && edad <= 30) 
                System.out.println("Eres un adulto joven!\n");
            else if (edad > 30 && edad <= 60) 
                System.out.println("eres un adulto maduro!\n");
            else 
                System.out.println("eres de la tercera edad!\n");

                System.out.println("||----------------------------------------------------------------||\n");
        do
        {
            System.out.println("Nacionalidad MEX-Mexico, USA-EstadosUnidos, CHI-China, KR-Corea");
            siglas = scanner.nextLine().toUpperCase();
        }while(siglas.length() == 0 || siglas.length() > 3);
        System.out.println("calculemos para cuantas visas te alcanza");
        System.out.println("Cuanto dinero tienes? ");
        dinero = Float.parseFloat(scanner.nextLine());
        System.out.println("\n");

        switch(siglas)
        {
            case "MEX" -> pais = "Mexico\n"; 
            case "USA" -> pais = "EstadosUnidos\n";
            case "CHI" -> pais = "China\n"; 
            case "KR" -> pais = "corea\n";
            default -> pais = "Pais no valido\n";
        }

        //operacion para cuantas visas le alcanza
        if(siglas.equals("MEX"))
        {
            for (int i = 1; i <= 3; i++) 
            {
                if(dinero >= costo[i])
                {
                    System.out.println("Visa de " + paises[i]);
                    dinero -= costo[i];
                }
            }
            System.out.println("\n");
            System.out.println("Dinero restante: $" + dinero + "\n");
        }
        
        System.out.println("||----------------------------------------------------------------||\n");
        do
        {
        System.out.println("Codigo Postal: ");
        CP = scanner.nextLine();
        }while(CP.length()!= 5);
        System.out.println("\n||----------------------------------------------------------------||\n");
    }
}