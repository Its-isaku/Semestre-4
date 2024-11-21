
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.function.Function;
import java.util.stream.Collectors;

//? Librerias


//? Clase EJ27
public class EJ27 
{
    //? Metodo main
    public static void main(String[] args) 
    {
        //? variables
        Scanner scanner = new Scanner(System.in);
        Function<String,Integer> sizeOf = (String s) -> { return s.length(); };
        /*
        *Function<Tipo_entrada,Tipo_regresa> nombre_funcion = (Parametros) -> { Cuerpo de la funcioin; };
        *VAriable_recibe_valor = nombre_funcion.apply(Parametro);
        */
        ArrayList<String> names = new ArrayList<>(Arrays.asList("John", "John", "Mariam", "Alex", "Mohammado", "Mohammado", "Vincent", "Alex", "Alex"));
        ArrayList<String> filtrado = new ArrayList<>(Arrays.asList("Uno", "Dos", "Tres"));

        //? Codigo
        System.out.println("\n||-------------------Ejercicio 27-------------------||\n");
        Integer r1 = sizeOf.apply("Me canso ganso");
        System.out.println("Cantidad de caracteres: " + r1);
        System.out.println();

        System.out.println("For each normal:");
        for (String name : names)
            System.out.println(name);
        System.out.println();

        System.out.println("For each con lambda:");
        names.forEach(name -> System.out.println(name));
        System.out.println();

        System.out.println("For each con lambda mas corto:");
        names.forEach(System.out::println); //? solo par auna instruccion
        System.out.println();

        System.out.println("Usando filter:");
        names.stream().filter(name-> name.contains("o")).forEach(System.out::println); //? Filtra los nombres que contienen la letra 'o'
        System.out.println();

        System.out.println("Filtrado por partes:");
        filtrado = new ArrayList<>(names.stream().filter(name -> name.contains("o")).collect(Collectors.toList())); //? Filtra los nombres que contienen la letra 'o';
        filtrado.forEach(System.out::println);
        System.out.println();

        System.out.println("Filtrado 3:");
        names.stream().filter(name -> name.equals("Alex")).forEach(System.out::println); //? Filtra los nombres que sean 'Alex'
        System.out.println();

        System.out.println("Filtrado 4:");
        names.stream().filter(name -> name.startsWith("M")).forEach(System.out::println); //? Filtra los nombres que empiezan con 'M'
        System.out.println();

        System.out.println("Usando Sort:");
        names.stream()
        .sorted(Comparator.naturalOrder()) //? Ordena los nombres de forma alfabetica
        .forEach(System.out::println);
        System.out.println();

        System.out.println("Usando Sort 2:");
        names.stream()
        .sorted(Comparator.comparing(String::length))   //? Ordena los nombres por longitud
        .forEach(System.out::println);
        System.out.println();


        System.out.println("Usando Map:");
        List<Persona> people = new ArrayList<>(Arrays.asList(
            new Persona(1, "Isai", "Almeraz", "isaialmeraz.com", "hombre", 21),
            new Persona(2, "Gareth", "Castro", "garethcastro.com", "hombre", 20)
        ));

        List<Persona> personas =
        people.stream().map(person -> 
                {    
                    Persona persona = new Persona(2, "Gareth", "Castro", "garethcastro.com", "hombre", 20);
                    persona.setId(person.getId());
                    persona.setNombre(person.getNombre());
                    persona.setApellido(person.getApellido());
                    persona.setCorreo(person.getCorreo());
                    persona.setGenero(person.getGenero());
                    persona.setEdad(person.getEdad());
                    return persona;
                }).collect(Collectors.toList());

                // Mostrar la lista transformada
                personas.forEach(persona -> {System.out.println(persona.toString());});


        System.out.println("\n||--------------------------------------------------||\n");
    }

    //? Metodos


}
