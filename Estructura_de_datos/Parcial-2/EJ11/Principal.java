//Librerias
import java.util.Scanner;

public class Principal 
{
    public static void main(String[] args) throws Exception
{
        System.out.println("||--------------------Ejercicio 9--------------------||\n");
        Stack_LIFO recipiente = new Stack_LIFO();
        Scanner leer = new  Scanner(System.in);
        int opc = 0;
        String nombre = "";

        do{
            menu();
            System.out.println("Elige: ");
            opc = Integer.parseInt(leer.nextLine());
            System.out.println("\n||-------------------------------------------------||\n");
            switch (opc)
            {
                case 1 -> 
                {
                    System.out.print("dame nombre para agregar: ");
                    nombre = leer.nextLine();
                    recipiente.insertar(nombre);
                    System.out.println();
                }

                case 2 -> 
                {
                    System.out.println("lista de elementos en el recipiente: ");
                    recipiente.mostrar();
                    System.out.println();
                }

                case 3 -> 
                {
                    recipiente.borrar();
                    System.out.println("Se ha borrado el elemento de encima\n");
                }

                case 9 -> System.out.println("Saliendo....\n");

            }
        }while(opc != 9);
        //fin del main
    }

    //Menu
    public static void menu() 
    {

        System.out.println("||---------------------Stack FiFo--------------------||\n");
        System.out.println("1 -> Insertar");
        System.out.println("2 -> Mostrar"); 
        System.out.println("3 -> Borrar");
        System.out.println("9 -> Salir"); 
        System.out.println("\n||---------------------------------------------------||\n");

    }
}
