import java.util.Scanner;


public class EJ10 
{
    
    //main
    public static void main(String[] args) 
    {
        
        System.out.println("\n---------------------repaso de ciclos y condiciones 2----------------------\n");
        Scanner scanner = new Scanner(System.in);
        
        // declaro las variables
        int entero1 = 0;
        int entero2 = 1;
        int aux = 0;
        int i = 0;

        // imprimo los valores iniciales de entero1 y entero2
        System.out.println( entero1);
        System.out.println( entero2);

        //for para generar los primeros 10 numeros de la serie de fibonacci
        for ( i = 0; i <= 10;i++)
        {
            aux = entero1 + entero2;
            entero1 = entero2;
            entero2 = aux;

            System.out.println(aux);
        }

        System.out.println("\n--------------------------------------------------------------------------\n");

        // declaro las variales 0 para volverlas a usar
        entero1 = 0;
        entero2 = 1;
        aux = 0;
        i = 0;

        System.out.println("con while:\n");
        System.out.println( entero1);
        System.out.println( entero2);

        // while para generar los primeros 10 valores de la serie de  fibonacci
        while (i < 11) 
        { 
            

            aux = entero1 + entero2;
            entero1 = entero2;
            entero2 = aux;

            System.out.println(aux);
            i++;

        }

        System.out.println("\n--------------------------------------------------------------------------\n");

        // declaro las variables 0 para volverlas a usar
        entero1 = 0;
        entero2 = 1;
        aux = 0;
        i = 0;

        System.out.println("con do while:\n");
        System.out.println( entero1);
        System.out.println( entero2);

        // do while para generar los primeros 10 valores de la serie de fibonacci
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
