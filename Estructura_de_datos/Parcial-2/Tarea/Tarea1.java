//Librerias
import java.util.Scanner;

// Juego de serpientes y escaleras
public class Tarea1
{
    public static void main(String[] args)
    {
        // variables
        Scanner scanner = new Scanner(System.in);
        int[][] matriz = new int[5][5];
        int inicio = 25;
        int Dado = (int)(Math.random() * 6) + 1;
        int Jugador_1 = 0;
        int Jugador_2 = 0;
        String respuesta = "";

        do
        {
            Tablero(matriz, inicio);
            System.out.println("Gustas tirar el dado(si/no)? ");
            respuesta = scanner.nextLine().toUpperCase();
            if(respuesta != "SI" && respuesta != "NO")
            {
                System.out.println("Respuesta incorrecta. Ingresa SI o NO.");
            }

        } while(Jugador_1 != 1 && Jugador_2 != 1);
    }

    public static void Tablero(int[][] matriz, int inicio)
    {
        // Inicializamos el arreglo con valores
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                matriz[i][j] = inicio;
                inicio--; // Disminuimos el valor para el próximo número en la matriz
            }
        }

        // Imprimimos el arreglo
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(matriz[i][j] + "\t"); //  \t para formato tabular
            }
            System.out.println(); // Salto de línea después de cada fila
        }
    }
}
