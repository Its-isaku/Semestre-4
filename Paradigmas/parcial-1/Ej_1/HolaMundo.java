import java.util.Scanner;

public class HolaMundo 
{
    public static void main(String[] args) 
    {

        Scanner scanner = new Scanner(System.in);
        
        /*
        char letra;
        */

        char[] iniciales = new char[10];
        String nombre;
        String paterno;
        String materno;
        byte aa ,mm, dd;
        boolean bisiesto;

        /*
        byte edad;
        float promedio;
        Double valor;
        int numero;
        boolean continuar;
        */
        
        System.out.println("--------------------------\n");
        System.out.println("Ejercicio 1\n");
        System.out.println("--------------------------\n");

        System.out.println("Nombre: ");
        nombre = scanner.next();

        System.out.println("Apellido paterno: ");
        paterno = scanner.next();

        System.out.println("Apellido materno: ");
        materno = scanner.next();

        System.out.println("Dame tu año de nacimiento: ");
        System.out.println("el anio debe ser ultimos 2 digitos: ");
        do{
        System.out.println("anio: ");
        aa = scanner.nextByte();
        }while((aa < 1 || aa > 99) && (aa + "").length()<2);

        bisiesto = aa % 4 == 0;

        do{
        System.out.println("mes: ");
        mm = scanner.nextByte();
        }while(mm < 1 || mm > 12);

        int Ver_dias_mes = VerificarDias(mm, bisiesto);

        do{
            System.out.println("dia: ");
            dd = scanner.nextByte();

            }while((dd < 1 || dd > Ver_dias_mes));
            


        /*
        System.out.println("letra: ");
        letra = scanner.next().charAt(0);
        */

        iniciales[0] = paterno.toUpperCase().charAt(0);
        iniciales[1] = ' ';
        iniciales[2] = materno.toUpperCase().charAt(0);
        iniciales[3] = nombre.toUpperCase().charAt(0);

        iniciales[4] = (aa + "").charAt(0);
        

        if(aa <= 9)
        {
            iniciales[4] = '0';
            iniciales[5] = (aa + "").charAt(0);
        }
        else
        {
            iniciales[4] = (aa + "").charAt(0);
            iniciales[5] = (aa + "").charAt(1);
        
        }
        
        iniciales[6] = (mm + "").charAt(0);
        if(mm <= 9)
        {
            iniciales[6] = '0';
            iniciales[7] = (mm + "").charAt(0);
        }
        else
        {
            iniciales[6] = (mm + "").charAt(0);
            iniciales[7] = (mm + "").charAt(1);
        }
        
        iniciales[8] = (dd + "").charAt(0);
        if(dd <= 9)
        {
            iniciales[8] = '0';
            iniciales[9] = (dd + "").charAt(0);
        }
        else
        {
            iniciales[8] = (dd + "").charAt(0);
            iniciales[9] = (dd + "").charAt(1);
        }

        System.out.println("\n");

        System.out.println("--------------------------\n");
        System.out.println("Comporbando datos:\n");
        System.out.println(nombre +  " "  + paterno + " " + materno + "\n");
        System.out.println("--------------------------\n");
        System.out.println("Iniciales:\n");
        Desplear_arreglo(iniciales);
        System.out.println("\n");
        System.out.println("--------------------------\n");

        if(bisiesto == true)
        {
            System.out.println("EL anio es bisiesto");
        }
        else
        {
            System.out.println("EL anio no es bisiesto");
        }
        
        
        /*
        System.out.println(letra);
        */
                

    } 

    public static void Desplear_arreglo(char[] a)
    {
        for (int i = 0; i < a.length; i++)
        {
            System.out.print(a[i]);
        }
    }


    public static int VerificarDias(int mes, boolean bisiesto)
    {
    
        switch (mes) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                return 31; // meses con 31 dias
            case 4:
            case 6:
            case 9:
            case 11:
                return 30; // meses con 30 dias
            case 2:
                if (bisiesto)
                {
                    return 29; // febrero bisiesto
                }
                else
                {
                    return 28; // febrero no bisiesto
                }
            default:
                return 0;
        }
    
    }

}