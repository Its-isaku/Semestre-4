import java.util.Scanner;


public class EJ11 
{
    
    //main
    public static void main(String[] args) 
    {
        
        System.out.println("\n---------------------repaso de ciclos y condiciones 2----------------------\n");
        Scanner scanner = new Scanner(System.in);

        int ran = (int)(Math.random() * 50) + 1;
        int i = 1;

        System.out.println("El numero aleatorio es: " + ran);
        System.out.println("pares del numero aleatorio");
        for(i = 1; i < ran; i++)
        {
            if( i % 2 == 0)
                System.out.println(i);
        } 

        System.out.println("\n--------------------------------------------------------------------------\n");

        System.out.println("El numero aleatorio es: " + ran);
        System.out.println("impares del numero aleatorio con while");
        i = 1;
        while(i < ran)
        {
            
            if(i % 2!= 0)
                System.out.println(i);
            i++;
        }

        System.out.println("\n--------------------------------------------------------------------------\n");

        System.out.println("El numero aleatorio es: " + ran);
        System.out.println("Numero negativos");
        i = 0;
        do
        {
            System.out.println((i) * -1);
            i++;
        }while(i <= ran);
    }


    //Librerias



}
