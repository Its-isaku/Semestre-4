// Librerias
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

//? Clase principal
public class EJ25 
{
    public static void main(String[] args) 
    {
        //? variables
        Scanner scanner = new Scanner(System.in);

        //? inicio de programa
        System.out.println("\n||---------------Programacion Funcional(Declarativa)---------------||\n");

        int anio = 2023;
        //? usar funciones puras: No modifican el Dato
        //System.out.println("El año " + anio + " es bisiesto? " + Estatica.Bisiesto(anio));

        //?
        // System.out.println(" Numero aleatorio entre 1 y 10: " + Estatica.Aleatorio(100, 140));

        //?Composicion de funciones   
        //System.out.println(" es bisiensto? " + Estatica.Bisiesto(Estatica.Aleatorio(1900, 2050)));

        //?
        //anio = Estatica.SigDecada(anio); //? usando funcion que altera el valor | Funcion no pura
        //System.out.println(anio + " es bisiensto? " + Estatica.Bisiesto(anio));

//! -------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
        
        List<Integer> positivos = new ArrayList<>(Arrays.asList(1, 3, 4, 7, 8, 21, 24, 50));
        List<Integer> pares1 = new ArrayList<>(); // imperativa
        List<Integer> pares2 = new ArrayList<>(); // declarativa
        
        //? ejemplo de for imperativo
        System.out.println("Numeros pares");
        for (int i = 0; i < positivos.size(); i++) 
        {
            System.out.println(positivos.get(i) + " es par? " + EsPar(positivos.get(i)));
            if(EsPar(positivos.get(i)))
                pares1.add(positivos.get(i));
        }

        System.out.println("\nNumeros pares");
        for(Integer num : pares1)
            System.out.println(num);

        //? ejemplo de for declarativo
        System.out.println();
        positivos.forEach((variable) -> // funcion lambda
        {
            if(EsPar(variable))
            {
                pares2.add(variable);
                System.out.println("el numero " + variable + " es par");
            }
        });

        

        //? fin de programa
        scanner.close();
        System.out.println("\n||-----------------------------------------------------------------||\n");
    }
    //? Metodos

    //? Verificar si es par o impar
    public static boolean EsPar(int num)
    {
        return num % 2 == 0; // regresa verdadero si es par
    }

    //? Regresa numeros pares
    public static int Par(int num)
    {
        if(num % 2 == 0)
            return num; // regresa el numero cuando es par
        else
            return 0; // regresa 0 cuando no es par
    }
} 
