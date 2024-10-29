//? Intro a POO

//* Librerias
import java.util.Scanner;

public class EJ22 
{
    public static void main(String[] args) 
    {
        //* Variables
        Scanner scanner = new Scanner(System.in);
        Persona vendedor = new Persona();
        Persona profesor = new Persona("Roberto");
        Persona alumno = new Persona("Arturo", 1.78f, true);

        System.out.println(vendedor.toString());
        System.out.println(profesor.toString());
        System.out.println(alumno.toString());
        
        Empleado conserge = new Empleado(2000, "12", 'V');

        System.out.println(conserge.toString());
    }

    //* Metodos


}
