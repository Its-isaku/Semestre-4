//Librerias
import java.io.File;
import java.util.Scanner;

public class EJ19
{
    public static void main(String[] args) 
    {
        //variables
        Scanner scanner = new Scanner(System.in);
        File fichero = new File("C:\\Users\\RogSt\\Desktop\\archivos_19");

        //Llamada a funcion recursiva
        System.out.println("\n||---------------Archivos en carpeta---------------||\n");
        MostrarCarpeta(fichero, "->");
        System.out.println("\n||-------------------------------------------------||\n");
        
    }
    //Metodos

    //Mostrar Carpeta
    public static void MostrarCarpeta(File fichero, String tab)
    {
        
        if (fichero.isDirectory()) //Si hay archivos en la carpeta
        {
            File[] lista = fichero.listFiles();
            for (int i = 0; i < lista.length; i++) 
            {   
                System.out.println(tab + " " + lista[i].getName());
                if(lista[i].isDirectory())
                {
                    MostrarCarpeta(lista[i],"---" + tab);
                }
            }
        }
        else// no hay archuvos en la carpeta
            System.out.println("no hay archivos!");
    }
}