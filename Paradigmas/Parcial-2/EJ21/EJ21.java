import  java.util.Scanner;

public class EJ21 
{
    public static Runtime runtime = Runtime.getRuntime();

    public static void main(String[] args) 
    {
        /* 
        int dataSize = 2147483647;

        int num = 0;
        boolean repetido = false;
        long suma = 0;

        int[] dato = new int[10];

        // i indica la posición que se rellenará
        int i = 0;
        while (i < dato.length) 
        {
            repetido = false;
            num = (int) (Math.random() * 15 + 1);
            // verifica que no se repita
            for (int j = 0; j < dato.length; j++) {
                if (num == dato[j]) repetido = true;
            }

            if (!repetido) {
                dato[i] = num;
                i++;

                
            }
        }

        // Imprimir el arreglo solo cuando se inserte un número nuevo
        for (int j = 0; j < dato.length; j++) 
        {
            System.out.println("[" + j + "] = " + dato[j] + ", Memoria usada: " + (runtime.totalMemory() - runtime.freeMemory()));
        }
        System.out.println(); // Para dar un salto de línea entre impresiones

        for (int k = 0; k < dataSize;k++) 
        {
            suma +=1 ;
            System.out.println(" " + k + " Memoria usada: " + (runtime.totalMemory() - runtime.freeMemory()));
        }
        */

        Scanner scanner = new Scanner(System.in);
        int num = 0;

        System.out.println("fuera de el metodo: " +  (runtime.totalMemory() - runtime.freeMemory()));
        System.out.print("Dame un numero: ");
        num = Integer.parseInt(scanner.nextLine());
        invertir(num);
        invertirRecursivo(num, 0);

    }

    public static int invertir(int n)
    {
        int invertido = 0;
        while (n > 0) 
        {
            invertido = invertido * 10 + (n % 10);
            n /= 10;
        }
        System.out.println(invertido);
        System.out.println("en el metodo: " +  (runtime.totalMemory() - runtime.freeMemory()));
        return invertido;
    }

    public static int invertirRecursivo(int n, int invertido)
    {
        if(n == 0)
        {
            System.out.println("Fin del metodo recursivo: " +  (runtime.totalMemory() - runtime.freeMemory()));
            return invertido;
        }
        else
        {
            System.out.println("en el metodo recursivo: " +  (runtime.totalMemory() - runtime.freeMemory()));
            return invertirRecursivo(n /= 10, invertido * 10 + (n%10));
        }

    }
}
