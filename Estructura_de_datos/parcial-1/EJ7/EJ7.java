import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Scanner;


public class EJ7 {
    public static void main (String[] args) throws Exception 
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
                    if(grupo.vacio())
                        System.out.println("No hay elementos! ");
                    else
                    {
                        System.err.println("Lista del grupo:\n");
                        grupo.mostrar();
                        System.out.println("\n");
                    }
                break;

                case 3:
                    System.out.print("Nombre para insertar al inicio: ");
                    nombre = leer.nextLine();

                    if(grupo.vacio())//no hay elementos
                    {
                        grupo.insertar(nombre);
                    }
                    else// si hay elementos
                    {
                        grupo.InsertarInicio(nombre);
                        System.out.println("\n");
                    }
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
                    System.out.println("despues de quien: ");
                    nombre = leer.nextLine();
                    grupo.InsertarEnMedio(nombre, colado);
                break;

                case 6:
                    if(!grupo.vacio())
                    {
                        System.out.println("nombre a borrar: ");
                        nombre = leer.nextLine();
                    
                        if(grupo.Borrar(nombre) == true) System.out.println("Borrado! ");
                        else System.out.println("Elemento no encontrado! ");
                    
                        System.out.println("\n");
                    }
                        
                    else System.out.println("No hay elementos para borrar!");
                break;

                case 7:
                if(grupo.vacio())
                    System.out.println("No hay elementos! ");
                else
                {
                    System.err.println("Lista del grupo invertida!:\n");
                    grupo.mostrarInverso();
                    System.out.println("\n");
                }
                break;
                        
                case 8:
                    InputStream ins  = new FileInputStream("Datos.txt");
                    Scanner obj = new Scanner(ins);
                    while (obj.hasNextLine()) 
                    {
                        grupo.insertar(obj.nextLine());
                    }
                break;

                    case 9: //guardar datos en archivo Datos.txt

                        if(grupo.vacio() == true)
                        {
                            System.out.println("Saliendo...\n");
                        }
                        else
                        {
                            System.out.println("Guardando datos en el archivo Datos.txt...\n");
                            grupo.guardarEnArchivo("Datos.txt");  // Llamada al método para guardar la lista
                            System.out.println("Datos guardados. Saliendo....\n");
                        }

                    break;
                    
                    
            }
        }while(opc != 9);
        //fin del main
    } 

    public static void menu()
    {

        System.out.println("\n||-------------------Listas dobles-------------------||\n");
        System.out.println("1 -> Insertar"); 
        System.out.println("2 -> Mostrar");
        System.out.println("3 -> Insertar inicio"); 
        System.out.println("4 -> Bucar");
        System.out.println("5 -> Insertar dentro de lista");
        System.out.println("6 -> Borrar");
        System.out.println("7 -> Mostrar inverso");
        //System.out.println("7 -> Reiniciar");
        System.out.println("8 -> Leer datos de archivo"); 
        System.out.println("9 -> Salir"); 
        System.out.println("\n||-------------------------------------------------||\n");

    }

} 