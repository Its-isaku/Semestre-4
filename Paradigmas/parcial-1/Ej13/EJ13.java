//Librerias
    import java.util.Scanner;

public class EJ13 
{
    // Main
    public static void main(String[] args) 
    {
        System.out.println("||----------------------------------------------------------------||\n");
        Scanner scanner = new Scanner(System.in);
        String CP;
        boolean correcto = false;
        String municipio;
        String[] municipios = {"MEXICALI", "TECATE", "SAN FELIPE", "TIJUANA", "ROSARITO", "ENSENADA","SAN QUINTIN"};
        
        System.out.println("||-----Direccion en Baja California-----||");
        do
        {
            System.out.println("Codigo Postal: ");
            CP = scanner.nextLine();
            //verifica que sean 5 digitos
            if(CP.length() != 5) System.out.println("Codigo postal debe ser de 5 digitos!\n");
            // verifica que empiece con 2...
            correcto = CP.charAt(0)== '2' ? true : false;
            //verifica que el segundo digito sea entre 1 y 2
            if(correcto == true) correcto = CP.charAt(1)== '1' || CP.charAt(1)== '2' ? true : false;
            // se manda mensaje de error si no cumplen los 2 primeros numeros
            if(correcto == false) System.out.println("Baja california empieza con 2...!\n");
        }while(CP.length()!= 5 || correcto == false);

        do
        {
            System.out.println("Municipio: ");
            municipio = scanner.nextLine().toUpperCase();
            correcto = false;
            int i = 0;
            
            do
            {
                if(municipio.equals(municipios[i]))
                    correcto = true;
                i++;
            }while(correcto == false && i <municipios.length);

        }while(municipio.length() <= 1 || correcto == false);

        System.out.println("\n||----------------------------------------------------------------||\n");
    }
    // Metodos


}
