import java.util.Scanner;

public class ExamenPt2 
{
    // Main
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);

        // Variables
        String numString = "";
        
        // Ciclar si el usuario no proporciona 11 digitos
        do
        {
            // Pido numero al usuario
            System.out.println("Dame tu numero del IMSS (11 digitos): ");
            numString = scanner.nextLine();
            
            // Validar que tiene 11 digitos
            if (numString.length() != 11) {
                System.out.println("El numero debe tener exactamente 11 digitos.");
            }
        } while (numString.length() != 11);

        // Extraer el anio de inscripcion y el anio de nacimiento
        int anioInscripcion = Integer.parseInt(numString.substring(6, 8));
        int anioNacimiento = Integer.parseInt(numString.substring(8, 10));

        // Validar que el anio de nacimiento sea menor que el de inscripcion
        if (anioNacimiento > anioInscripcion) {
            System.out.println("Error: El anio de nacimiento no puede ser mayor que el anio de inscripcion.");
        } else {
            System.out.println("Numero valido. Anio de inscripcion: " + anioInscripcion + ", Anio de nacimiento: " + anioNacimiento);
        }

        scanner.close();
    }
}
