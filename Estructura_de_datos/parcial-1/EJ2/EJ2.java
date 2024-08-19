import java.util.Scanner;

public class EJ2 
{
    public static void main(String[] args) 
    {
        // Inicializar un arreglo de enteros con 10 posiciones
        int[] a = new int[10];
        
        int valor, Continuar;

        int pos = 0;

        do{

            // Pedir un dato al usuario y su posicion
            @SuppressWarnings("resource")
            Scanner scanner = new Scanner (System.in);

                
            System.out.println("Dame un dato:");
            valor = scanner.nextInt(); 
            // Si la posicion esta vacia, se almacena el dato, sino, se imprime que la posicion esta ocupada
            if (a[pos] == 0)
            {
                a[pos] = valor;
                pos++;
            }  
            else
                System.out.println("Posicion ocupada");
            

            System.out.println("Continuar = 1/0");
            Continuar = scanner.nextInt();
        }
        while(Continuar == 1 && pos < 10);
        
        // Imprimir el arreglo con los datos almacenados
        System.out.println("\nEl arreglo es:");
        for(int j = 0; j < a.length; j++)
        {
            System.out.println(j + " = " + a[j]);
        }


    }    
}
