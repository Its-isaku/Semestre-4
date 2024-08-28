//librerias
import java.util.Scanner;


public class EJ5 
{
    //funciones


    //main
    public static void main(String[] args) 
    {
        int valor = 7;
        int  numero = 0;
        Scanner scanner = new Scanner(System.in);
        
        do
        {

            System.out.println("Dame un numero: ");
            numero = scanner.nextInt();

        }while(numero != valor);
        
        System.out.println("Encontraste el numeo!");
    }    
}
