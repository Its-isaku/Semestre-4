import  java.util.Scanner;

public class P2
{
    public static void main(String[] args) 
    {
        
        double x;
        double y;
        double z;

        Scanner scanner = new Scanner(System.in);

        System.out.println("dame lado x:");
        x = scanner.nextDouble();
        
        System.out.println("dame lado y:");
        y = scanner.nextDouble();

        z = Math.sqrt((x*x) + (y*y));

        System.out.println("La hyotenusa es: " + z);
    }   
}
