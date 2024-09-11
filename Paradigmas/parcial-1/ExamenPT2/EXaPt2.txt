//Librerias
import java.util.Scanner;

public class ExamenPt2 
{
    //Main
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);

        // declaro variables
        int num_imss = 0;
        String  numString = " ";
        String[] aux = new String[11];

        // ciclar si el usueario no porporciona 11 digitos
        do
        {
        
            //pido numero al usario
            System.out.println("Dame tu numero del IMSS: ");
            numString = scanner.nextLine();
            num_imss = Integer.parseInt(numString);
            
            System.out.println("falto validar que el año de sea menor al año de inscripcion");
            /*
            //Recorre el arreglo hasta llegar al final
            for (int i = 0; i <numString.length() ; i++) 
            {

                // verifico que el año sea menor al año de inscripcion
                if
                
            }
            */

        }while(numString.length() != 11);

    }
}
