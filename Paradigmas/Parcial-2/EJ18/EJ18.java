//Librerias
import java.util.Random;
import java.util.Scanner;

public class EJ18 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        int num = 9;
        int operador = 5;
        int total = 0;

        System.out.println("");
        System.out.println("Multiplicacion usando sumas!\n");
        
        for (int i = 0; i < operador; i++) 
        {
            total += num;
        }
        System.out.println(num + " * " + operador + " = " + total);
            
        System.out.println("\n||-----------------------------------------------------------------||\n");
            
        /*
        System.out.println("Divicion con restas!\n");
        num = 40; operador = 5; total = 0;
        
        while(num > 0)
        
        {
            num -= operador;
            total++;
        }
        System.out.println(40 + " / " + operador + " = " + total);

        System.out.println("\n||-----------------------------------------------------------------||\n");
 */
        System.out.println("Suma usando recursion!\n");
        total = SumaRecursiva(num);
        System.out.println(total);

        System.out.println("\n||-----------------------------------------------------------------||\n");

        System.out.println("Suma con while!\n");
        num = 9;  total = 0;
        while(num >0)
        {
            total += num;
            num--;
        }
        System.out.println(total);
        System.out.println("\n||-----------------------------------------------------------------||\n");
        //Prrueba con arreglos

        int[] array = new int[20]; 
        //iniciar(array);
        //RellenarSinRepetidos(array);
        RellenarSinRepetidos_Recursivo(array);
        mostrar(array);
    }

    public static int SumaRecursiva(int num)
    {
        int res= 0;

        if(num == 1)
        {
            return 1;
        }
        else
            res += num + SumaRecursiva(num -1);
        return res;
        //fin de la recurcion
    }

    public static void iniciar(int[] a)
    {
        for (int i = 0; i < a.length; i++) 
        {
            a[i] = -1;    
        }

    }

    public static void mostrar(int[] b)
    {
        for (int i = 0; i < b.length; i++) 
        {
            System.out.println("[" + i + "]=" + b[i]);
        }
    }

    public static void Rellenar(int[] c)
    {
        for (int i = 0; i < c.length; i++) 
        {
            c[i] = (int) (Math.random() * 15 +1);
        }
    }

    //rellenar sin que se repitan con recursividad
    public static void RellenarSinRepetidos(int[] d)
    {
        int num = 0;
        boolean repetido = false;

        // i indica la posicion que se rellenara
        int i = 0;
        while(i < d.length)
        {
            repetido = false;
            num = (int) (Math.random() * 15 +1);
            // verufica que no se repita
            for (int j = 0; j < d.length ; j++) 
                if(num == d[j]) repetido = true;

            if(!repetido)
            {
                d[i] = num;
                i++;
            }
            else num = (int) (Math.random() * 15 +1);
        }

    }

    public static void RellenarSinRepetidos_Recursivo(int[] respuesta) 
    {
		for (int i = 0; i < respuesta.length; i++) 
        {
            respuesta[i] = gen(respuesta);
        }
	}    

    public static int gen(int [] e)
    {
        boolean repetido = false;
        Random ra = new Random();	
		int numero = ra.nextInt(e.length + 1);
        
        // verufica que no se repita
        for (int i = 0; i < e.length ; i++)
        { 
            if(numero == e[i])
            {
                repetido = true;
                break;
            }
        }

        if(repetido != true)
        {
            //System.out.println("asignado: " + numero);
			return numero;
		}
        else 
        {
            //System.out.println("repetido: " + numero);
			return gen(e);
        }
    }

}
