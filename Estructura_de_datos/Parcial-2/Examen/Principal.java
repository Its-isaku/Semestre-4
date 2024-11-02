//Librerias
import java.util.Scanner;

public class Principal 
{
    public static void main(String[] args) 
    {
        System.out.println("||--------------------Examen Parcial 2--------------------||\n");

        System.out.println("||--------------------Hospital Publico--------------------||\n");

        Scanner scanner = new  Scanner(System.in);
        Queue Hospital = new Queue();
        String nombre;
        int opc = 0;
        
        do
        {
            menu();
            System.out.print("Elige: ");
            opc = Integer.parseInt(scanner.nextLine());

            System.out.println("||----------------------------------------------------------||\n");
            switch (opc)
            {
                case 1 -> 
                {
                    System.out.print("Nombre para agragar: ");
                    nombre = scanner.nextLine();
                    Hospital.Instertar(nombre);
                }

                case 2 -> 
                {
                    System.err.println("Simulacion del Hospital:\n");
                    HorarioAtencion(Hospital);
                }

                case 9 -> System.out.println("Saliendo....\n");

                default -> System.out.println("Opcion no valida\n");

            }
        }while(opc != 9);
        System.out.println("||----------------------------------------------------------||\n");
    }

    //Menu
    public static void menu()
    {
        System.out.println("\n||--------------Stack FiFo-------------||");
        System.out.println("|| 1 -> Insertar                       ||"); 
        System.out.println("|| 2 -> Mostrar Horarios Hospital      ||");
        System.out.println("|| 9 -> Salir                          ||"); 
        System.out.println("||-------------------------------------||\n");
    }

    // metodo para calcular y mostrar el horario de atencion
    public static void HorarioAtencion(Queue Hospital)
    {
        // se inicialiazan los turnos de General, Especializada y la hora de cierre
        int turnoGeneral = 7 * 60; // 7:00 am
        int turnoEspecializada = 7 * 60; // 7:00 am
        int HoraCierre = 15 * 60; // 15:00 pm

        // se obtiene el pasiente de la cola
        NodoExamen i = Hospital.getInicio();
        System.out.println("Lista de pacientes atendidos: ");

        // se recorre la cola y se imprime el paciente, el tiempo y tipo de consulta
        while (i != null)
        {
            // se obtienen los valores del paciente 
            String tipoConsulta = i.getTipoConsulta();
            int tiempoConsulta = i.getTiempoConsulta();

            // se calcula el tiempo de atencion y se imprimen los datos
            if(tipoConsulta.equals("Consulta General"))
            {
                // se verifica si el turno de atencion es mayor a la hora de cierre
                if(turnoGeneral + tiempoConsulta <= HoraCierre )
                {
                    turnoGeneral += tiempoConsulta; // se suma el tiempo de consulta al turno
                    System.out.println("Paciente: " + i.getElem() + " Tipo de consulta: " + tipoConsulta + " Hora de atencion: " + turnoGeneral / 60 + ":" + turnoGeneral % 60);
                }
                else
                    System.out.println("Consultorio General Cerrado, NO se aceptan mas pacientes");
            }
            else
            {
                // se verifica si el turno de atencion es mayor a la hora de cierre
                if(turnoEspecializada + tiempoConsulta <= HoraCierre )
                {
                    turnoEspecializada += tiempoConsulta; // se suma el tiempo de consulta al turno
                    System.out.println("Paciente: " + i.getElem() + " Tipo de consulta: " + tipoConsulta + " Hora de atencion: " + turnoEspecializada / 60 + ":" + turnoEspecializada % 60);
                }
                else
                    System.out.println("Consultorio Especializado Cerrado, NO se aceptan mas pacientes");
            }
            i = i.getNext(); // se obtiene el siguiente paciente
        }

        // se imprime la hora de cierre de los consultorios
        System.out.print("\n Hora de cierre del cunsultorio Genera: " + turnoGeneral / 60 + ":");
        System.out.printf("%02d\n" , turnoGeneral % 60);
        System.out.print(" Hora de cierre del cunsultorio Especializada: " + turnoEspecializada / 60 + ":");
        System.out.printf("%02d\n" , turnoEspecializada % 60);
    }
}
