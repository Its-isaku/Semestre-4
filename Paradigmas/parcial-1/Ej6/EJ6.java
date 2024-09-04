//librerias
import java.util.Scanner;


public class EJ6 
{
    //funciones


    //main
    public static void main(String[] args) 
    {
        int valor = (int)(Math.random()*50 + 1);
        Scanner scanner = new Scanner(System.in);

        int  numero = 0;
        int oportunidades = 5;
        boolean acerto = false;
        
        do
        {
            System.out.println("Dame un numero: ");
            numero = scanner.nextInt();

            if(numero == valor)
                acerto = true;

            else
            {
                if(numero < valor) System.out.println("Te falto! \n");
                else System.out.println("Te pasaste de la raya! \n");
            }

            oportunidades--;

        }while(!acerto && oportunidades > 0 );

        if(!acerto) System.out.println("EL valor era: " + valor + "\n");
        
    }    
}
