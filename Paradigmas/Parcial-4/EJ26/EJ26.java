//? librerias
import java.util.Scanner;

//? Main
public class EJ26 
{
    public static void main(String[] args) 
    {
        //? variables
        Scanner scanner = new Scanner(System.in);

        //? inicio de programa
        System.out.println("\n||---------------------------Funciones Lambda---------------------------||\n");

        //? #1 usar interfaces: declararr interface y usarla
        //MyInterface lambda1 = () -> {System.out.println("Probar lambda1");}; //? codigo dentro de las llaves sutituye al metodo abstracto
        //lambda1.saludo(); // Probar lambda1

        //MyInterface lambda2 = () -> 
        //{
        //    System.out.println("Primer encuentro con programacion funcional");
        //    System.out.println("Probando Funcions Lambda");
        //    System.out.println("suma 2 = 3 = " + (2 + 3));
        //};
        //lambda2.saludo();

        //? #2 cuando tiene una sola instruccion se pueden omitir las llaves
        //lambda1 = () -> System.out.println(2 + 3);
        //lambda1.saludo(); // Otro mensaje

        //? #3 usar lambda con parametros
        //MyInterface2 lambda3 = (nombre, edad) -> System.out.println(nombre + " de "+ edad + "años de edad esta aprendiendo funciones lambda ");
        //lambda3.prueba("isai", 21); //? mando a llamar la funcion lambda3 y le doy el parametro "isai"

        //MyInterface2 lambda4 = (nombre) -> nombre + " esta aprendiendo funciones lambda "; //? codigo dentro de las llaves sutituye al metodo abstracto 
        //System.out.println(lambda4.prueba2("isai")); //? mando a llamar la funcion lambda4 dentro de un print y le doy el parametro "isai"

        //? #4 clases con funcones anonimas
        new Asistencia() 
        {
            private int presente;
            public void asiste()
            {
                System.out.println("El alumno si llego a clase");
            }
        }.asiste();
        System.out.println();

        //? otra foma de hacer clases anonimas
        Usuario Persona = new Usuario() 
        {
            public void CrearUsario()
            {
                System.out.println("Creando usuario");
            }
            public void BorrarUsuario()
            {
                System.out.println("borrando usuario");
            }
        };

        Persona.CrearUsario();
        Persona.BorrarUsuario();
        System.out.println();

        Persona = new Usuario() 
        {
            public void CrearUsario()
            {
                System.out.println("Creacion 2");
            }
            public void BorrarUsuario()
            {
                System.out.println("borrado 2");
            }
        };

        Persona.CrearUsario();
        Persona.BorrarUsuario();


        System.out.println("\n||----------------------------------------------------------------------||\n");
    }

    //? Metodos
    
}
