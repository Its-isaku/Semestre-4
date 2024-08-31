import java.util.Scanner;

public class Tarea3 {
    public static void main (String[] args)
    {
        System.out.println("||--------------------Ejercicio 5---------------------||\n");

        Scanner leer = new  Scanner(System.in);
        Lista grupo = new Lista();
        String nombre;
        String colado;
        int edad;

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
                    System.out.println("Dame la edad: ");
                    edad = Integer.parseInt(leer.nextLine());
                    if(edad >= 60) grupo.InsertarInicio(nombre);
                    else grupo.insertar(nombre);
                    System.out.println("\n");
                break;

                case 2:
                    System.err.println("Lista del grupo:\n");
                    grupo.mostrar();
                    System.out.println("\n");
                break;

                case 3:
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
                    System.out.println("Dame la edad: ");
                    edad = Integer.parseInt(leer.nextLine());
                    System.out.println("Adelante de quien: ");
                    nombre = leer.nextLine();
                    if(edad >= 60) grupo.InsertarInicio(colado);
                    else grupo.InsertarEnMedio(nombre, colado);;
                break;

                case 6:
                    System.out.println("nombre a borrar: ");
                    nombre = leer.nextLine();
                    grupo.Borrar(nombre);
                break;

                case 9: 
                    System.out.println("Saliendo....\n");
                break;

            }
        }while(opc != 9);
        //fin del main
    } 

    public static void menu()
    {

        System.out.println("||-------------------Listas simples-------------------||\n");
        System.out.println("1 -> Insertar"); 
        System.out.println("2 -> Mostrar(Lista y desfase)");
        System.out.println("3 -> Insertar inicio");
        System.out.println("4 -> Bucar");
        System.out.println("5 -> Insertar dentro de lista");
        System.out.println("6 -> Borrar");
        System.out.println("9 -> Salir"); 
        System.out.println("\n||-------------------------------------------------||\n");

    }

}

