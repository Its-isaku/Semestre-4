
import java.util.PriorityQueue;

//? Librerias

public class Main 
{

    //? variables globales


    //? Main
    public static void main(String[] args) 
    {
        //? variables
        PriorityQueue<Tarea> colasPrioridad = new PriorityQueue<Tarea>();

        //? creacion de objetos
        colasPrioridad.add(new Tarea(10, "Matematicas"));
        colasPrioridad.add(new Tarea(3, "Redaccion"));
        colasPrioridad.add(new Tarea(2, "Estadistica"));
        colasPrioridad.add(new Tarea(4, "Estruccturas de datos"));

        //? Codigo principal
        System.out.println("||-------------------Ejercicio 16--------------------||");

        //System.out.println("\nTareas extraidas en orden de prioridad:\n");
        //while (!colasPrioridad.isEmpty())
        //    System.out.println(colasPrioridad.poll());

        System.out.println();
        colasPrioridad.removeIf(filter -> filter.getPrioridad() == 2);
        colasPrioridad.removeIf(filter -> filter.getDescripcion().equals("Estruccturas de datos"));

        for (Tarea tarea : colasPrioridad)
            System.out.println(tarea);
        System.out.println();

    }

    //? Metodos
    

}
