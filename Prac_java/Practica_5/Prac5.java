// Librerías
import java.util.Scanner;

public class Prac5 {
    // Main
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String secuencia = "";  // Variable para almacenar la secuencia
        int num = 0;

        // Solicita al usuario el número de caracteres a ingresar
        System.out.print("Ingrese el número de caracteres a ingresar: ");
        num = Integer.parseInt(scanner.nextLine());

        System.out.println("Ingrese " + num + " caracteres uno por uno:");
        
        // Ciclo para obtener cada carácter ingresado por el usuario
        for (int i = 0; i < num; i++) {
            char caracter = scanner.nextLine().charAt(0);  // Lee un solo carácter
            secuencia += caracter;  // Agrega el carácter a la secuencia
        }

        // Muestra la secuencia final
        System.out.println("Secuencia ingresada: " + secuencia);
    }
}
