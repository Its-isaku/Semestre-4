//librerias
import java.util.Scanner;


public class EJ5 
{
    //funciones


    //main
    public static void main(String[] args) 
    {
        int valor = (int)(Math.random()*50 + 1);
        int  numero = 0;
        int oportunidades = 3;
        Scanner scanner = new Scanner(System.in);
        
        do
        {
            System.out.println("Dame un numero: ");
            numero = scanner.nextInt();
            
            if (numero < valor)
                System.out.println("Te falto! \n");
                
            if(numero > valor)
                System.out.println("Te pasaste de la raya! \n");

            oportunidades--;

        }while(numero != valor && oportunidades != 0);
        if(numero != valor)
            System.out.println("EL valor era: " + valor);
        
    }    
}
