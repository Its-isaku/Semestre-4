//?Librerias
import java.util.Scanner;

public class Principal 
{
        public static int mov = 0; //? num de movimientos hechos
        public static int fallos = 0; //? num de fallos hechos
    public static void main(String[] args) throws Exception
{
        System.out.println("||-------------------Ejercicio 14--------------------||");

        //? Variables
        Scanner scanner = new  Scanner(System.in);
        Arbol nums = new Arbol();
        int opc = 0;
        int num = 0;
        int[] arreglo = {15, 10, 20, 18, 30};

        //? Ciclo para el menu 
        do
        {
            menu();
            System.out.print("Elige: ");
            opc = Integer.parseInt(scanner.nextLine());
            System.out.println("\n||-------------------------------------------------||\n");
            switch (opc)
            {
                case 1 -> 
                {
                    //? Insertar por usuario     
                    System.out.println("Dame numero: ");
                    num = Integer.parseInt(scanner.nextLine());
                    nums.Instertar(num);
                }

                case 2 -> 
                {
                    //? raiz, izquierdas y luego derechas
                    System.out.println("PreOrden: ");
                    if(!nums.vacio())
                        nums.MostrarPreOrden(nums.getRaiz());
                    else
                        System.out.println("Arbol vacio");
                }

                case 3 -> 
                {
                    //? izquierdas, raiz y luego derechas
                    System.out.println("InOrden: ");
                    if(!nums.vacio())
                        nums.MostrarInOrden(nums.getRaiz());
                    else
                        System.out.println("Arbol vacio");
                }

                case 4 -> 
                {
                    //? izquierdas, derechas y luego raiz
                    System.out.println("PostOrden: ");
                    if(!nums.vacio())
                        nums.MostrarPostOrden(nums.getRaiz());
                    else
                        System.out.println("Arbol vacio");
                }
                
                case 5 -> 
                {
                    //? Mayor a menor
                    System.out.println("Mayor a Menor: ");
                    nums.Mayor_Menor(nums.getRaiz());
                }

                case 6 -> 
                {
                    //? Buscar
                    System.out.print("Dame numero a buscar: ");
                    num = Integer.parseInt(scanner.nextLine());
                    if(nums.Buscar(num))
                    {
                        System.out.println("Numero encontrado");
                        System.out.println("Numero de movimientos: " + nums.cont);
                    }
                    else
                    {
                        System.out.println("Numero no encontrado");
                        System.out.println("Numero de movimientos: " + nums.cont);
                    }
                }


                case 7 -> 
                {
                    //? Insertar arreglo
                    for(int i = 0; i < arreglo.length; i++)
                    {
                        nums.Instertar(arreglo[i]);
                    }
                }

                case 8 -> 
                {
                    //? Buscar en arreglo
                    System.out.print("Dame numero a buscar: ");
                    num = Integer.parseInt(scanner.nextLine());
                    BuscarArreglo(arreglo, num);
                }

                case 9 -> 
                {
                    //? Eliminar
                    System.out.println("Dame numero a eliminar: ");
                    num = Integer.parseInt(scanner.nextLine());

                    if(!nums.Buscar(num)) // si no lo encuentra 
                        System.out.println("Numero no Encontrado");
                    else // si lo encuentra
                    {
                        nums.setRaiz(nums.deleteNode(nums.getRaiz(), num));
                        System.out.println("Numero eliminado");
                    }
                }

                case 0 -> System.out.println("Saliendo....\n");

                default -> System.out.println("Opcion no valida");

            }


        }while(opc != 0);

    }

    //? Metodos

    //* Menu
    public static void menu() 
    {

        System.out.println("\n||----------------------Arboles----------------------||");
        System.out.println("|| 1 -> Insertar                                     ||");
        System.out.println("|| 2 -> Mostrar Pre_Orden                            ||");
        System.out.println("|| 3 -> Mostrar In_Orden                             ||");
        System.out.println("|| 4 -> Mostrar Post_Orden                           ||");
        System.out.println("|| 5 -> Mostrar Mayor_Menor                          ||");
        System.out.println("|| 6 -> Buscar                                       ||"); 
        System.out.println("|| 7 -> Insertar Arreglo                             ||");
        System.out.println("|| 8 -> Buscar en arreglo Arreglo                    ||");
        System.out.println("|| 9 -> Eliminar                                     ||");
        System.out.println("|| 0 -> Salir                                        ||"); 
        System.out.println("||---------------------------------------------------||\n");

    } 

   //* Buscar en arreglo
    public static void BuscarArreglo(int[] arreglo, int num)
    {
        int cont = 0;
        boolean encontrado = false;
        
        for(int i = 0; i < arreglo.length; i++)
        {
            cont++;
            if(arreglo[i] == num)
            {
                encontrado = true;
                break;
            }
        }
        if(encontrado)
        {
            System.out.println("Numero encontrado");
            System.out.println("Numero de movimientos: " + cont);
        }
        else
        {
            System.out.println("Numero no encontrado");
            System.out.println("Numero de movimientos: " + cont);
        }
    }
    

}

//! terminamos tema el Lunes
