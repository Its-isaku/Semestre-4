import java.util.Scanner;


public class EJ10 
{
    
    //main
    public static void main(String[] args) 
    {
        
        System.out.println("\n---------------------repaso de ciclos y condiciones 2----------------------\n");
        Scanner scanner = new Scanner(System.in);
        
        int entero1 = 0;
        int entero2 = 1;
        int aux = 0;
        int i = 0;

        System.out.println( entero1);
        System.out.println( entero2);

        for ( i = 0; i <= 10;i++)
        {
            aux = entero1 + entero2;
            entero1 = entero2;
            entero2 = aux;

            System.out.println(aux);
        }

        System.out.println("\n--------------------------------------------------------------------------\n");

        entero1 = 0;
        entero2 = 1;
        aux = 0;
        i = 0;

        System.out.println("con while:\n");
        System.out.println( entero1);
        System.out.println( entero2);


        while (i < 11) 
        { 
            

            aux = entero1 + entero2;
            entero1 = entero2;
            entero2 = aux;

            System.out.println(aux);
            i++;

        }

        System.out.println("\n--------------------------------------------------------------------------\n");

        entero1 = 0;
        entero2 = 1;
        aux = 0;
        i = 0;

        System.out.println("con do while:\n");
        System.out.println( entero1);
        System.out.println( entero2);

        do 
        { 
        
            aux = entero1 + entero2;
            entero1 = entero2;
            entero2 = aux;

            System.out.println(aux);
            i++;

        }
        while (i < 11);

    }


    //Librerias



}
