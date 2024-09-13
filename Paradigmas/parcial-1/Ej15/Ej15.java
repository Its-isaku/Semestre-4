//Ciclos anidados
//Liberias
import java.util.Scanner;

public class Ej15
{
    //Main
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        int hh = 0, mm = 0;
        int tiempo = 0;

        //Pide el tiempo en minutos al usuario y muestra el contador reloj en tiempo real
        System.out.println("cuantos minutos quieres en el temporizador: ");
        tiempo= Integer.parseInt(scanner.nextLine());
        System.out.println("\n||----------------------------||\n");

        //Ciclo para mostrar el contador reloj en tiempo real
        for (int i = tiempo - 1; i >= 0; i--) 
        {
            for (int j = 59; j >= 0; j--)
            {
                System.out.print(i + ":");
                System.out.printf("%02d", j);
                System.out.println();
                //Pausa el programa 1 seg para mostrar el siguiente contador
                try {Thread.sleep(900); }
                catch (InterruptedException e){}
            }
        }
        System.out.println("\n||----------------------------||\n");
    }


    //Metodos

}
