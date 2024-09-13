//Ciclos anidados
//Liberias
import java.util.Scanner;

public class Ej14 
{
    //Main
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        int hh = 0, mm = 0;

        // bucle para generar reloj
        for (int i = 0; i < 24; i++) 
        {
            for (int j = 0; j < 60; j++)
            {
                if(i >= 13) System.out.print(i%12 + ":");
                else System.out.print(i + ":");

                System.out.printf("%02d", j);
                if(i <= 12) System.out.println(" am");
                else System.out.println(" pm");
            }
        }
    }


    //Metodos

}
