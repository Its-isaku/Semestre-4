//Librerias
import java.util.Scanner;

public class Prac2 
{
    // Main
    public static void main(String[] args) 
    {
        System.out.println("||----------------------------------------------------------------||\n");
        Scanner scanner = new Scanner(System.in);
        String CP;
        
        do
        {
        System.out.println("Codigo Postal: ");
        CP = scanner.nextLine();
        }while(CP.length()!= 5);
        System.out.println("\n||----------------------------------------------------------------||\n");
    }
    // Metodos


}
