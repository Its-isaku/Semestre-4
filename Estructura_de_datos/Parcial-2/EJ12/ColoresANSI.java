import java.util.HashMap;
import java.util.Map;

public class ColoresANSI 
{
    public static final String RESET = "\u001B[0m";

    public static final String[] COLORES = 
    {
        "\u001B[31m", // Rojo
        "\u001B[32m", // Verde
        "\u001B[33m", // Amarillo
        "\u001B[34m", // Azul
        "\u001B[35m", // Magenta
        "\u001B[36m", // Cian
        "\u001B[37m"  // Blanco
    };

    // Mapa para almacenar el color de cada numero
    public static final Map<Integer, String> mapaColores = new HashMap<>();

    // Asigna un color unico a cada número
    static 
    {
        for (int i = 0; i < COLORES.length; i++) {
            mapaColores.put(i + 1, COLORES[i % COLORES.length]);
        }
    }
}
