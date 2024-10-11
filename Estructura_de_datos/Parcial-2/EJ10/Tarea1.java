/*
 * Ejercicio 10 Serpientes y esaleras
 * Tablero , dado aleatorio
 * Queue: posiciones en la que ha caido
!||---------------------Reglas----------------------||
 * 1. Dado 1 al 4 avanza
 * 2. Dado cae 5: elige si avanza o no
 * 3. dado ces 6: avanza o regresa a ultima posicion
 * 4. Escaleras: pos 6 sube a 11, pos 15 sube a 18 , pos 8 sube a 20 (si da tiempo, Escaleras aleatorias)
 * 5. Serpientes pos 24 baja a 17, pos 21 baja a 10, pos 9 baja a 2(si da tiempo, Serpientes aleatorias)
 * 6. Si al tirar se pasa de puntos de la meta, debe regresarse
 * 7. Gana el que llegue exacto a la meta
*/


//Librerias
import java.util.Scanner;

// Juego de serpientes y escaleras
public class Tarea1
{
    public static void main(String[] args)
    {
        // variables
        Scanner scanner = new Scanner(System.in);
        Lista_DobleSE Jugador_1 = new Lista_DobleSE();
        Lista_DobleSE Jugador_2 = new Lista_DobleSE();
        Lista_DobleSE Jugador_3 = new Lista_DobleSE();
        int turno = 1;
        int opc = 0;

        int[][] matriz = new int[5][5];
        int inicio = 25;
        String respuesta = "";

        System.out.println("\n||---------------------Ejercicio 10, serpientes y escaleras---------------------||\n");

        do
        {
            menu();
            System.out.print("Dame una opcion: ");
            opc = Integer.parseInt(scanner.nextLine());
            System.out.println();

            switch (opc)
            {
                case 1 -> 
                {
                    NuevoJeugo(Jugador_1, Jugador_2, Jugador_3); 
                    System.out.println("juego inicializado!");
                }

                case 2 ->
                {
                    int Dado = (int)(Math.random() * 6) + 1;
                    System.out.println("Turno del juador: " + turno);

                    if(Dado == 5)
                    {
                        System.out.print("Avanzas o te quedas? S/N ");
                        respuesta = scanner.nextLine().toUpperCase();
                        if ("S".equals(respuesta))
                            turno = avanza(turno, Dado, Jugador_1, Jugador_2, Jugador_3);
                        else// no avanza asi que cambia de turno
                            turno = CambiaTurno(turno);
                    }
                    else // no cayo 5
                        if(Dado == 6)
                        {
                            System.out.print("Avanzas o regresas? A/R ");
                            respuesta = scanner.nextLine().toUpperCase();

                            if ("A".equals(respuesta)) // avanza
                                turno = avanza(turno, Dado, Jugador_1, Jugador_2, Jugador_3);
                            else// borrar ultimo
                                turno = regresa(turno, Jugador_1, Jugador_2, Jugador_3);
                        }
                        else // cae 1 a 4
                            turno = avanza(turno, Dado, Jugador_1, Jugador_2, Jugador_3);


                System.out.println("\nposiciones del jugador 1 ");
                Jugador_1.Mostrar();
                System.out.println("\nposiciones del jugador 2 ");
                Jugador_2.Mostrar();
                System.out.println("\nposiciones del jugador 3 ");
                Jugador_3.Mostrar();
                System.out.println();
                Tablero(matriz, inicio);
                System.out.println();

                }

                case 3 ->
                {

                }

                case 4 ->
                {

                }

                case 5 ->
                {

                }

                case 6 ->
                {

                }

                case 7 ->
                {

                }

                case 9 -> System.out.println("Saliendo.....");
                default -> System.out.println("Opcion no valida!");
            }

            //Tablero(matriz, inicio);
            
        } while(!Meta(Jugador_1, Jugador_2, Jugador_3) && opc != 9); // NO has llegado a la meta
        System.out.println("\nalguien ya gano");
    }

    public static boolean Meta(Lista_DobleSE Jugador_1, Lista_DobleSE Jugador_2, Lista_DobleSE Jugador_3)
{
    if(Jugador_1.getFin() != null && Jugador_1.getFin().getElem() == 25 ||
            Jugador_2.getFin() != null && Jugador_2.getFin().getElem() == 25 ||
            Jugador_3.getFin() != null && Jugador_3.getFin().getElem() == 25)
    {
        return true;
    }
    else
    {
        return false;
    }
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

    public static void menu() 
    {

        System.out.println("\n||---------------------Stack FiFo--------------------||\n");
        System.out.println("1 -> Iniciar el juego"); 
        System.out.println("2 -> Tirar Dado");
        System.out.println("3 -> Bucar");
        System.out.println("4 -> Borrar de fila 1");
        System.out.println("5 -> Unificar");
        System.out.println("9 -> Salir"); 
        System.out.println("\n||---------------------------------------------------||\n");

    }

    public static void NuevoJeugo(Lista_DobleSE Jugador_1, Lista_DobleSE Jugador_2, Lista_DobleSE Jugador_3)
    {
        Jugador_1.Reuniciar();
        Jugador_2.Reuniciar();
        Jugador_3.Reuniciar();
    }

    public static int avanza(int turno, int dado, Lista_DobleSE Jugador_1, Lista_DobleSE Jugador_2, Lista_DobleSE Jugador_3 )
    {
        switch (turno)
        {
            case 1 ->
            {
                if(Jugador_1.getInicio() == null)
                    Jugador_1.Instertar(dado);
                else
                {
                    Jugador_1.Instertar(Jugador_1.getFin().getElem() + dado);
                }
                turno = 2;
            }

            case 2 ->
            {
                if(Jugador_2.getInicio() == null)
                    Jugador_2.Instertar(dado);
                else
                {
                    Jugador_2.Instertar(Jugador_1.getFin().getElem() + dado);
                }
                turno = 3;
            }

            case 3 ->
            {
                if(Jugador_3.getInicio() == null)
                    Jugador_3.Instertar(dado);
                else
                {
                    Jugador_3.Instertar(Jugador_1.getFin().getElem() + dado);
                }
                turno = 1;
            }
        }
        return turno;
    }

    public static int regresa(int turno, Lista_DobleSE Jugador_1, Lista_DobleSE Jugador_2, Lista_DobleSE Jugador_3 )
    {
        switch (turno)
        {
            case 1 -> 
            {
                if (Jugador_1 != null)
                    Jugador_1.BorraUltimo(); 
                turno = 2; 
            }

            case 2 -> 
            {
                if (Jugador_2 != null)
                    Jugador_2.BorraUltimo(); 
                turno = 3; 
            }

            case 3 ->
            {
                if (Jugador_3 != null)
                    Jugador_3.BorraUltimo(); 
                turno = 1; 
            }
        }
        return turno;
    }

    public static int CambiaTurno(int turno)
    {
        return turno == 1? 2 : (turno == 2 ? 3 : 1); 
    }
}
