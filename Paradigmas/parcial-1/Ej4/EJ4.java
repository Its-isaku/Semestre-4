//Librerias
import  java.util.Scanner;

public class EJ4 
{

    //Funciones

    //menu
    public static void menu()
    {
        System.out.println("||-------------------Menu de dulces-------------------||\n");
        System.out.println("1 -> Mazapan $10"); 
        System.out.println("2 -> Chocolate $15"); 
        System.out.println("3 -> Gomitas $20"); 
        System.out.println("9 -> Salir");
        System.out.println("\n||---------------------------------------------------||\n");

    }


    //Main
    public static void main(String[] args) 
    {
        System.out.println("--------------------------\n");
        System.out.println("Ejercicio 4\n");
        System.out.println("--------------------------\n");

        int dinero;
        int opc = 0;

        Scanner scanner = new Scanner(System.in);

        // Pregunto cuanto dinero tiene el usueario
        System.out.println("cuanto dinero tienes? ");
        dinero = Integer.parseInt(scanner.nextLine());
        System.out.println("tu salado es: $" + dinero + "\n");

        // bucle para cobrar 
        while( dinero > 0 && opc != 9)
        {
            menu();
            System.out.print("Elige una opcion: ");
            opc = Integer.parseInt(scanner.nextLine());

            switch (opc)
            {
                case 1:
                    if(dinero >= 10)
                    {
                        dinero -= 10;
                        System.out.println("tu saldo restante es: " + dinero + "\n");
                    }else
                    {
                        System.out.println("lo siento, no tienes sufuciente!\n");
                    }
                break;

                case 2:
                if(dinero >= 15)
                {
                    dinero -= 15;
                    System.out.println("tu saldo restante es: " + dinero + "\n");
                }else
                {
                    System.out.println("lo siento, no tienes sufuciente!\n");
                }
                break;

                case 3:
                if(dinero >= 20)
                {
                    dinero -= 20;
                    System.out.println("tu saldo restante es: " + dinero + "\n");
                }else
                {
                    System.out.println("lo siento, no tienes sufuciente!\n");
                }
                break;

                case 9:
                System.out.println("Saliendo...");
                break;

                default:
                System.out.println("Opcion no valida!\n");
                break;
            }

        }
        System.out.println("\n||-----------------------------------------------------||\n");
        System.out.println("no tienes dinero!");

    }

}
