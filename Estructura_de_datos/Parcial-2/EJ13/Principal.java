//Librerias
import java.util.Scanner;

public class Principal 
{
        public static int mov = 0; //num de movimientos hechos
        public static int fallos = 0; //num de fallos hechos
    public static void main(String[] args) throws Exception
{
        System.out.println("||-------------------Ejercicio 13--------------------||\n");

        Scanner scanner = new  Scanner(System.in);
        int opc = 0;
        Arbol nums = new Arbol();


        do{
            menu();
            System.out.print("Elige: ");
            opc = Integer.parseInt(scanner.nextLine());
            System.out.println("\n||-------------------------------------------------||\n");
            switch (opc)
            {
                case 1 -> 
                {
                    nums.Instertar(5);
                    nums.Instertar(8);
                    nums.Instertar(10);
                }

                case 2 -> 
                {
                    System.out.println(nums.getRaiz().getElem());
                    System.out.println(nums.getRaiz().getDer().getElem());
                    System.out.println(nums.getRaiz().getDer().getDer().getElem());
                }

                case 3 -> 
                {
        
                }

                case 4 -> 
                {
    
                }
                
                case 5 -> 
                {

                }

                case 6 -> 
                {

                }


                case 7 -> 
                {
                    
                }

                case 9 -> System.out.println("Saliendo....\n");

            }


        }while(opc != 9);

    }

    //Menu
    public static void menu() 
    {

        System.out.println("||---------------------Stack FiFo--------------------||\n");
        System.out.println("|| 1 -> Insertar                                     ||");
        System.out.println("|| 2 -> Mostrar                                      ||");
        System.out.println("|| 3 ->                                              ||");
        System.out.println("|| 4 ->                                              ||");
        System.out.println("|| 5 ->                                              ||");
        System.out.println("|| 6 ->                                              ||"); 
        System.out.println("|| 7 ->                                              ||");
        System.out.println("|| 9 -> Salir                                        ||"); 
        System.out.println("\n||---------------------------------------------------||\n");

    } 

}
