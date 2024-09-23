//Librerias
import java.util.Scanner;

public class Principal 
{
    public static void main(String[] args) 
    {
        System.out.println("||--------------------Ejercicio 8--------------------||\n");

        Scanner leer = new  Scanner(System.in);
        Stack_FiFo grupo = new Stack_FiFo();
        String nombre;

        int opc = 0;
        
        do{
            menu();
            System.err.println("Elige: ");
            opc = Integer.parseInt(leer.nextLine());
            System.out.println("\n||-------------------------------------------------||\n");
            switch (opc)
            {
                case 1 -> 
                {
                    System.out.print("Nombre para agragar: ");
                    nombre = leer.nextLine();
                    grupo.Instertar(nombre);
                    System.out.println("\n");
                }

                case 2 -> 
                {
                    System.err.println("Lista del grupo:\n");
                    grupo.Mostrar();
                    System.out.println("\n");
                }
/* 
                case 3 -> 
                {
                    System.out.print("Nombre para buscar: ");
                    nombre = leer.nextLine();
                    System.out.println("\n");
                    grupo.Buscar(nombre);
                }
*/
                case 4 -> 
                {
                    grupo.Borrar();
                    System.out.println("Primer elemento borrado! ");
                    System.out.println("\n");
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
        System.out.println("3 -> Bucar");
        System.out.println("4 -> Borrar");
        System.out.println("9 -> Salir"); 
        System.out.println("\n||---------------------------------------------------||\n");

    }
}
