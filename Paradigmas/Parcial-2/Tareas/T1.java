// Librerías
import java.util.Scanner;

public class T1 
{
    public static void main(String[] args) 
    {
        // Variables
        Scanner scanner = new Scanner(System.in);
        String num_float = "";
        String Palabra = "";
        String Caracter;


        System.out.println("\n||--------------------------------------||\n");

        // Verificación de método para un float
        System.out.println("Leer un flotante\n");
        do
        {
            System.out.println("Ingresa un número float: ");
            String num_str = scanner.nextLine();
            
            if(isFloat(num_str))
            {
                System.out.println("Es un número flotante!");
                num_float = num_str;  // Actualizamos num_float con el valor correcto
            }
            else    
                System.out.println("No es un número flotante!\n");
        } while(num_float.isEmpty());  // Verifica si ya tenemos un número flotante válido

        System.out.println("\n||--------------------------------------||\n");

        // Verifica que introduzcaas un String sin espacios
        System.out.println("Leer String sin espacios\n");
        do
        {
            System.out.println("Ingresa un String: ");
            Palabra = scanner.nextLine();

            if(Espacios(Palabra))
                System.out.println("contiene espacios!\n");
            else
                System.out.println("No Contiene espacios!");
        }while(Espacios(Palabra));

        System.out.println("\n||--------------------------------------||\n");

        // Verifica que introduzcaas un String sin espacios
        System.out.println("leer un String con espacios\n");
        do
        {
            System.out.println("Ingresa un String: ");
            Palabra = scanner.nextLine();

            if(Espacios(Palabra))
                System.out.println("contiene espacios!");
            else
                System.out.println("No Contiene espacios!\n");
        }while(!Espacios(Palabra));

        System.out.println("\n||--------------------------------------||\n");

        //Verifica que introduzcas un caracter alfabetico
        System.out.println("Leer un caracter alfabetico \n");
        do
        {
            System.out.println("Ingresa un carácter: ");
            Caracter = scanner.next();

            if(Caracter.length() == 1)
                System.out.println("El carácter es alfabetico!");
            else
                System.out.println("El carácter no cumple los requerimientos!\n");
        }while(Caracter.length() != 1 || !CaracterAlfabetico(Caracter));

        System.out.println("\n||--------------------------------------||\n");

        //Verifica que introduzcas un caracter numerico
        System.out.println("Leer un caracter Numerico \n");
        do
        {
            System.out.println("Ingresa un carácter: ");
            Caracter = scanner.next();

            if(Caracter.length() == 1)
                System.out.println("El carácter es numerico!");
            else
                System.out.println("El carácter no es alfabetico!\n");
        }while(Caracter.length() != 1 || !CaracterNumerico(Caracter));

        System.out.println("\n||--------------------------------------||\n");
        scanner.close();  // Cierra el scanner al finalizar el uso
    }

    // Método para verificar que es un float
    public static boolean isFloat(String s) 
    {
        if (s.isEmpty()) return false;  // Verifica si la cadena está vacía
        
        boolean puntoEncontrado = false;  // Para detectar un punto decimal
        int inicio = 0;

        // Verifica si el número comienza con un signo
        if (s.charAt(0) == '-' || s.charAt(0) == '+')
            inicio = 1;

        for (int i = inicio; i < s.length(); i++) 
        {
            char c = s.charAt(i);
            
            // Verifica si es un punto decimal
            if (c == '.') 
            {
                if (puntoEncontrado) return false;  // Solo puede haber un punto
                puntoEncontrado = true;
            }
            // Si no es un dígito, no es un número válido
            else if (!Character.isDigit(c)) 
                return false;
        }

        // Debe tener al menos un dígito antes o después del punto
        return puntoEncontrado && s.length() > inicio + 1;
    }

    // Verificar si un string contiene espacios
    public static boolean Espacios(String palabra)
    {
        Boolean encontrado = false;
        for(int i=0;i<palabra.length();i++)
        {
            char c=palabra.charAt(i);
            if(c==' ')
            {
                encontrado = true; 
                break;
            }
        }
        return encontrado;
    }

    // Verificar caracter alfabetico
    public static boolean CaracterAlfabetico(String caracter)
    {
        Boolean encontrado = false;
        if (caracter.isEmpty()) return false;  // Verifica si la cadena está vacía

        for(int i=0;i<caracter.length();i++)
        {
            char c=caracter.charAt(i);
            if((c>='a' && c<='z') || (c>='A' && c<='Z'))
            {
                encontrado = true;
                break;
            }
        }
        return  encontrado;
    }

    // Verificar caracter numerico
    public static boolean CaracterNumerico(String caracter)
    {
        Boolean encontrado = false;
        if (caracter.isEmpty()) return false;  // Verifica si la cadena está vacía

        for(int i=0;i<caracter.length();i++)
        {
            char c=caracter.charAt(i);
            if((c>='0' && c<='9'))
            {
                encontrado = true;
                break;
            }
        }
        return  encontrado;
    }

     // Método para verificar que es un número entero
    public static boolean isNumeric(String s) 
    {
        if (s.isEmpty()) return false;  // Verifica si la cadena está vacía
        
        int inicio = 0;
        
        // Verifica si el número comienza con un signo
        if (s.charAt(0) == '-' || s.charAt(0) == '+')
            inicio = 1;

        // Revisa que todos los caracteres sean dígitos
        for (int i = inicio; i < s.length(); i++) 
        {
            if (!Character.isDigit(s.charAt(i))) 
            {
                return false;
            }
        }
        return true;
    }
}
