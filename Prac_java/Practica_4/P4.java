import java.util.Scanner;

public class P4 
{
    public static void main(String[] args)
    {  
        Scanner scanner = new Scanner(System.in);

        int filas;
        int columnas;
        String simbolo = ""; 

        System.out.println("Dame el numero de filas: ");
        filas  = scanner.nextInt();

        System.out.println("Dame el numero de Columnas: ");
        columnas  = scanner.nextInt();

        System.out.println("Dame un simbolo: ");
        simbolo  = scanner.next();

        for(int i = 0; i <= filas; i++)
        {
            System.out.println();
            for(int j = 0; j <= columnas; j++)
            {
                System.out.print(simbolo);
            }
        }
    }    
}
