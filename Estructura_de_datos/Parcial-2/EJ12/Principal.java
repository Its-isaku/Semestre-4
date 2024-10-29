//Librerias
import java.util.Scanner;

public class Principal 
{
    public static void main(String[] args) throws Exception
{
        System.out.println("||--------------------Ejercicio 9--------------------||\n");
        Stack_LIFO_2 Grupo1 = new Stack_LIFO_2();
        Stack_LIFO_2 Grupo2 = new Stack_LIFO_2();
        Stack_LIFO_2 Grupo3 = new Stack_LIFO_2();
        Scanner leer = new  Scanner(System.in);
        int opc = 0;
        String nombre = "";
        
        inicializar(Grupo1);
        do{
            menu();
            System.out.println("Elige: ");
            opc = Integer.parseInt(leer.nextLine());
            System.out.println("\n||-------------------------------------------------||\n");
            switch (opc)
            {
                case 1 -> 
                {
                    System.out.println("Mover de 1 a 2 | -->");
                    if(!Grupo1.vacia())
                        ValidarMovimientos(Grupo1, Grupo2);
                }

                case 2 -> 
                {
                    System.out.println("Mover de 1 a 3 | -->");
                    if(!Grupo1.vacia())
                        ValidarMovimientos(Grupo1, Grupo3);
                }

                case 3 -> 
                {
                    System.out.println("Mover de 2 a 3 | -->");
                    if(!Grupo2.vacia())
                        ValidarMovimientos(Grupo2, Grupo3);
                }

                case 4 -> 
                {
                    System.out.println("Mover de 3 a 1 | <--");
                    if(!Grupo3.vacia())
                        ValidarMovimientos(Grupo3, Grupo1);
                }
                
                case 5 -> 
                {
                    System.out.println("Mover de 3 a 2 | <--");
                    if(!Grupo3.vacia())
                        ValidarMovimientos(Grupo3, Grupo2);
                }

                case 6 -> 
                {
                    System.out.println("Mover de 2 a 1 | <--");
                    if(!Grupo2.vacia())
                        ValidarMovimientos(Grupo2, Grupo1);
                }

                case 7 -> 
                {
                    inicializar(Grupo1);
                    Grupo2 = null;
                    Grupo3 = null;
                }

                case 9 -> System.out.println("Saliendo....\n");

            }

            System.out.println("\n||--------------------------------||\n");
            System.out.println("Contenido de Grupo 1: ");
            Grupo1.mostrar();
            System.out.println("\nContenido de Grupo 2: ");
            Grupo2.mostrar();
            System.out.println("\nContenido de Grupo 3: ");
            Grupo3.mostrar();
            System.out.println("\n||--------------------------------||\n");

        }while(opc != 9);
        //fin del main
    }

    //Menu
    public static void menu() 
    {

        System.out.println("||---------------------Stack FiFo--------------------||\n");
        System.out.println("1 -> Mover --> 1 a 2");
        System.out.println("2 -> Mover --> 1 a 3");
        System.out.println("3 -> Mover --> 2 a 3");
        System.out.println("4 -> Mover <-- 3 a 1");
        System.out.println("5 -> Mover <-- 3 a 2");
        System.out.println("6 -> Mover <-- 2 a 1"); 
        System.out.println("7 -> Nuevo Juego");
        System.out.println("9 -> Salir"); 
        System.out.println("\n||---------------------------------------------------||\n");

    }

    public static void inicializar(Stack_LIFO_2 Grupo1)
    {
        for (int i = 5; i >= 1; i--) 
            Grupo1.insertar(i);
    }

    public static void ValidarMovimientos(Stack_LIFO_2 Origen, Stack_LIFO_2 Destino)
    {
        if(Destino.getCabeza() == null)
        {
            Destino.insertar(Origen.getCabeza().getElem());
            Origen.borrar();
        }
        else if(Destino.getCabeza().getElem() > Origen.getCabeza().getElem())
        {
            Destino.insertar(Origen.getCabeza().getElem());
            Origen.borrar();
        }
        else
            System.out.println("\nMovimiento invalido!");
    }

    /*
     ! TAREA
     *  Agregar algun intentificador visual para los numeros en los Stacks
     * 
     */
}
