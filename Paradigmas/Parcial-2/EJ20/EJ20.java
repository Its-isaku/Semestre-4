//? Juego del Gato

//Librerias

import java.util.Scanner;


public record EJ20() 
{
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) 
    {
        //variables
        String dato = "";
        String Jugador1, Jugador2;
        String[] gato = new String[9];
        int pos;
        int turno = 1;

        System.out.println("\n||---------------Juego del gato---------------||\n");
        // se le asigna X o O a jugadores
        inicializar(gato);
        mostrar(gato);
        System.out.print("Jugador 1 ");
        Jugador1 = PedirLetra();
        Jugador2 = (Jugador1.equals("X"))? "O" : "X"; 
        boolean victoria = false;

        System.out.println("Jugador 1: " + Jugador1);
        System.out.println("Jugador 2: " + Jugador2 + "\n");
        
        
        do
        {
            System.out.println("||--------------------------------------------||\n");
            System.out.print("Posicion jugador " + turno + ": ");
            pos = Integer.parseInt(scanner.nextLine()); // pendiente validar del 1 al 9

            //verificar disponibilidad de posicion
            if(disponible(pos, gato))
            {
                gato[pos - 1] = turno == 1? Jugador1 : Jugador2;
            }
            else System.out.println("Posicion ocupada");

            mostrar(gato);
            turno = turno == 1? 2 : 1; // persona que va a tirar
            victoria = ganador(gato);

        }
        while(!estaLleno(gato) && !victoria);

        if(victoria)
        {
            if(turno == 2)
            {
                System.out.println("\n||--------------------------------------------||\n");
                System.out.println("Gano el jugador 1!");
            }
            else
            {
                System.out.println("\n||--------------------------------------------||\n");
                System.out.println("Gano el jugador 2!");
            }
        }

        System.out.println("\n||--------------------------------------------||\n");
    }
    
    // metodos

    public static String PedirLetra()
    {
        String dato;
        //? verifica que uses X o O
        do
        {
            System.out.println("elige(X/O): "); 
            dato = scanner.nextLine().toUpperCase();
            System.out.println();
        }while(!Valida.SoloXO(dato));

        return dato;
    }

    public static void inicializar(String[] g)
    {
        for (int i = 0; i < g.length; i++) 
            g[i] = Integer.toHexString(i + 1); // pos 0 vale 1 ....
    }   

    public static void mostrar(String[] g)
    {
        for (int i = 0; i < g.length; i+=3) 
        {
            for (int j = 0; j < 3; j++)
                System.out.print("[" + g[i+j] + "] ");
            System.out.println();
        }
        System.out.println();
    }   

    public static boolean disponible(int pos, String[] g)
    {
        if(g[pos - 1].equals("X") || g[pos - 1].equals("O"))
            return false;
        else 
            return true;
    }

    public static boolean estaLleno(String[] g)
    {
        // itera sobre arreglo, si hay numeris no esta vacio
        for (String gato : g) {
            if (Character.isDigit(gato.charAt(0))) {
                return false;
            }
        }
        return true;
    }

    public static boolean ganador(String[] g)
    {
        return  (g[0].equals(g[3]) && g[3].equals(g[6])) ||
                (g[1].equals(g[4]) && g[4].equals(g[7])) ||
                (g[2].equals(g[5]) && g[5].equals(g[8])) ||
                (g[0].equals(g[1]) && g[1].equals(g[2])) ||
                (g[3].equals(g[4]) && g[4].equals(g[5])) ||
                (g[6].equals(g[7]) && g[7].equals(g[8])) ||
                (g[0].equals(g[4]) && g[4].equals(g[8])) ||
                (g[2].equals(g[4]) && g[4].equals(g[6]));
    }
}
