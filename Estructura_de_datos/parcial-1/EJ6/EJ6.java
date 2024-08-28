import java.util.Scanner;

public class EJ6 {
    public static void main (String[] args)
    {
        System.out.println("||--------------------Ejercicio 5---------------------||\n");

        Scanner leer = new  Scanner(System.in);
        ListaDoble grupo = new ListaDoble();
        String nombre;
        String colado;

        int opc = 0;
        
        do{
            menu();
            System.err.println("Elige: ");
            opc = Integer.parseInt(leer.nextLine());
            System.out.println("\n||-------------------------------------------------||\n");
            switch (opc)
            {
                case 1:
                System.out.print("Nombre para agragar: ");
                nombre = leer.nextLine();
                grupo.insertar(nombre);
                System.out.println("\n");
                break;

                case 2:
                System.err.println("Lista del grupo:\n");
                grupo.mostrar();
                System.out.println("\n");
                break;

               /*  case 3:
                System.out.print("Nombre para insertar al inicio: ");
                nombre = leer.nextLine();
                grupo.InsertarInicio(nombre);
                System.out.println("\n");
                break;

                case 4:
                System.out.print("Nombre para buscar: ");
                nombre = leer.nextLine();
                System.out.println("\n");
                grupo.Buscar(nombre);
                break;

                case 5:
                System.out.println("Nombre para insertar: ");
                colado = leer.nextLine();
                System.out.println("Antes de quien: ");
                nombre = leer.nextLine();
                grupo.InsertarEnMedio(nombre, colado);
                break;

                case 6:
                    System.out.println("nombre a borrar: ");
                    nombre = leer.nextLine();
                    grupo.Borrar(nombre);
                break;
                */
                case 9: 
                System.out.println("Saliendo....\n");
                break;

            }
        }while(opc != 9);
        //fin del main
    } 

    public static void menu()
    {

        System.out.println("||-------------------Listas dobles-------------------||\n");
        System.out.println("1 -> Insertar"); 
        System.out.println("2 -> Mostrar");
        /* 
        System.out.println("3 -> Insertar inicio");
        System.out.println("4 -> Bucar");
        System.out.println("5 -> Insertar dentro de lista");
        System.out.println("6 -> Borrar");
         */
        System.out.println("9 -> Salir"); 
        System.out.println("\n||-------------------------------------------------||\n");

    }

}

