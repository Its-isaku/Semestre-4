//Librerias
import java.util.Scanner;

public class EJ16
{
    public static void main(String[] args) 
    {
        System.out.println("\n||--------------------Ejercicio 16----------------------||\n");

        //Variables
        Scanner scanner = new Scanner(System.in);
        short edad = PedirEdad();
        char Genero = PedirGenero();
        float KG = 0.0f; //masa corporal en KG
        float H = 0.0f; // Altura
        float IMC = 0.0f; 
        String status = tablaIMC(IMC, edad, Genero);

        PedirEdad();
        PedirGenero();
        System.out.print("Peso en KG: ");
        KG = Float.parseFloat(scanner.nextLine());
        System.out.print("Estatura en M: ");
        H = Float.parseFloat(scanner.nextLine());

        IMC = IMCGral(KG, H);
        toString(KG, H, IMC, Genero, edad, status);
        

        //Cierro Scanner
        scanner.close();
    }

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

    public static char PedirGenero()
    {
        char Genero = ' ';
        Scanner scanner = new Scanner(System.in);
        String Dato = "";
        do
        {   
            Genero = ' ';
            System.out.print("Genero (M/H): ");
            Dato = scanner.nextLine();
            if(Dato.length() > 0) Genero = Dato.toUpperCase().charAt(0);
        }while(Genero != 'M' && Genero != 'H');
        return Genero;
    }

    public static float IMCGral(float KG,float H)
    {
        float IMC = 0.0f; 
        return IMC = KG / (H*H);
    }

    public static String tablaIMC(float IMC, short edad, char Genero)
    {
        String status = "";
        if(Genero == 'M')
        {
            if (edad < 19)
            {
                if(IMC > 32) status = "Obesidad";
                else if(IMC > 27) status = "Sobrepeso";
                else if(IMC > 22) status = "Normal";
                else if(IMC > 17) status = "Buena";
                else if(IMC == 17) status = "Exelente";
                else status = "En peligro";
            }
            else if(edad >= 20 && edad < 29)
            {
                if(IMC > 33) status = "Obesidad";
                else if(IMC > 28) status = "Sobrepeso";
                else if(IMC > 23) status = "Normal";
                else if(IMC > 18) status = "Buena";
                else if(IMC == 18) status = "Exelente";
                else status = "En peligro";
            }
            else if(edad >= 30 && edad < 39)
            {
                if(IMC > 34) status = "Obesidad";
                else if(IMC > 29) status = "Sobrepeso";
                else if(IMC > 24) status = "Normal";
                else if(IMC > 19) status = "Buena";
                else if(IMC == 19) status = "Exelente";
                else status = "En peligro";
            }
            else if(edad >= 40 && edad < 49)
            {
                if(IMC > 35) status = "Obesidad";
                else if(IMC > 30) status = "Sobrepeso";
                else if(IMC > 25) status = "Normal";
                else if(IMC > 20) status = "Buena";
                else if(IMC == 20) status = "Exelente";
                else status = "En peligro";
            }
            else
            {
                if(IMC > 36) status = "Obesidad";
                else if(IMC > 31) status = "Sobrepeso";
                else if(IMC > 26) status = "Normal";
                else if(IMC > 21) status = "Buena";
                else if(IMC == 21) status = "Exelente";
                else status = "En peligro";
            }
        }
        else if(Genero == 'H')
        {
            if (edad < 19)
            {
                if(IMC > 27) status = "Obesidad";
                else if(IMC > 22) status = "Sobrepeso";
                else if(IMC > 17) status = "Normal";
                else if(IMC > 12) status = "Buena";
                else if(IMC == 12) status = "Exelente";
                else status = "En peligro";
            }
            else if(edad >= 20 && edad < 29)
            {
                if(IMC > 28) status = "Obesidad";
                else if(IMC > 23) status = "Sobrepeso";
                else if(IMC > 18) status = "Normal";
                else if(IMC > 13) status = "Buena";
                else if(IMC == 13) status = "Exelente";
                else status = "En peligro";
            }
            else if(edad >= 30 && edad < 39)
            {
                if(IMC > 29) status = "Obesidad";
                else if(IMC > 24) status = "Sobrepeso";
                else if(IMC > 19) status = "Normal";
                else if(IMC > 14) status = "Buena";
                else if(IMC == 14) status = "Exelente";
                else status = "En peligro";
            }
            else if(edad >= 40 && edad < 49)
            {
                if(IMC > 30) status = "Obesidad";
                else if(IMC > 25) status = "Sobrepeso";
                else if(IMC > 20) status = "Normal";
                else if(IMC > 15) status = "Buena";
                else if(IMC == 15) status = "Exelente";
                else status = "En peligro";
            }
            else
            {
                if(IMC > 31) status = "Obesidad";
                else if(IMC > 26) status = "Sobrepeso";
                else if(IMC > 21) status = "Normal";
                else if(IMC > 16) status = "Buena";
                else if(IMC == 16) status = "Exelente";
                else status = "En peligro";
            }
        }
        return status;
    }

    public static void toString(float KG, float H, float IMC,char Genero, short edad, String status)
    {
        System.out.println("\n||------------------------------------------------------||\n");
        System.out.println("Inice de masa corporal ");
        System.out.println("Segun la formula general IMC = KG/H^2\n");
        System.out.println("Tu edad es: " + edad);
        System.out.println("Genero " + Genero);
        System.out.print("El IMC es: ");
        System.out.printf("%.2f", IMC);
        System.out.println();
        System.out.println("Tu status es: " + status);
        System.out.println();
        System.out.println("||------------------------------------------------------||\n");
    }


}
