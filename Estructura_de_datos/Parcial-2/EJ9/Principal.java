/*
? Ejercicio 9 Colas(Queue) en filas de pacientes.
? En un clinica del imss por error los pacientes hicieron 2 filas,
? al empezar a atenderlos , se deben unificar en una sola fila de acuerdo
? a la hora de llegada.
? Al unficar se le asigna un turno.
? guarde el nombre , la hora de llegada del paciente.
*/

//Librerias
import java.io.FileInputStream;
import java.io.InputStream;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Principal 
{
    public static void main(String[] args) throws Exception
{
        System.out.println("||--------------------Ejercicio 9--------------------||\n");

        Scanner leer = new  Scanner(System.in);
        Queue_FIFO_2 Fila1 = new Queue_FIFO_2();
        Queue_FIFO_2 Fila2 = new Queue_FIFO_2();
        Queue_FIFO_2 Unifila = new Queue_FIFO_2();
        String nombre;

        //carga datos automaticamente
        CargarDatos("Fila1.txt", Fila1);
        CargarDatos("Fila2.txt", Fila2);
        
        int opc = 0;

        do{
            menu();
            System.out.println("Elige: ");
            opc = Integer.parseInt(leer.nextLine());
            System.out.println("\n||-------------------------------------------------||\n");
            switch (opc)
            {
                case 1 -> 
                {
                    System.out.print("Nombre para agragar: ");
                    nombre = leer.nextLine();
                    Fila1.Instertar(nombre, 0, null);
                    System.out.println("\n");
                }

                case 2 -> 
                {
                    System.out.println("Fila1:\n");
                    Fila1.Mostrar();
                    System.out.println("\n");
                    System.out.println("Fila2:\n");
                    Fila2.Mostrar();
                    System.out.println("\n");
                }

                case 3 -> 
                {
                    System.out.print("Nombre para buscar: ");
                    nombre = leer.nextLine();
                    System.out.println("\n");
                    Fila1.Buscar(nombre);
                }
                
                case 4 -> 
                {
                    Fila1.Borrar();
                    System.out.println("Primer elemento borrado! ");
                    System.out.println("\n");
                }

                case 5->
                {
                    Unifila.Combinar(Fila1, Fila2);
                    Unifila.Mostrar();
                    System.out.println();

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
        System.out.println("2 -> Mostrar separadas");
        System.out.println("3 -> Bucar");
        System.out.println("4 -> Borrar de fila 1");
        System.out.println("5 -> Unificar");
        System.out.println("9 -> Salir"); 
        System.out.println("\n||---------------------------------------------------||\n");

    }

    public static void CargarDatos(String archivo, Queue_FIFO_2 Fila) throws Exception
    {
        //carga de datos fila1
        InputStream ins  = new FileInputStream(archivo);
        Scanner obj = new Scanner(ins);

        String str = "";
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
        LocalDateTime dateTime;

        while (obj.hasNextLine())
        {
            String linea = obj.nextLine();
            String[] lines = linea.split(",");
            String parte1 = lines[0]; // nombre
            String parte2 = lines[1]; // hora
            str = "2024-09-24 " + parte2;
            dateTime = LocalDateTime.parse(str, formatter);
            
            Fila.Instertar(parte1,0, dateTime);
        }
        //fin de la carga de datos
        obj.close();
    }
}
