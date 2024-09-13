import java.util.Scanner;

public class HolaMundo 
{
    public static void main(String[] args) 
    {

        Scanner scanner = new Scanner(System.in);

        //Creo variables
        char[] iniciales = new char[10];
        String nombre;
        String paterno;
        String materno;
        byte aa ,mm, dd;
        boolean bisiesto;
        
        System.out.println("--------------------------\n");
        System.out.println("Ejercicio 1\n");
        System.out.println("--------------------------\n");

        //pido el nombre del usuario
        System.out.println("Nombre: ");
        nombre = scanner.next();

        //Pido apellido paterno del  usuario
        System.out.println("Apellido paterno: ");
        paterno = scanner.next();
        //Pido apellido materno del usuario
        System.out.println("Apellido materno: ");
        materno = scanner.next();

        //pido fecha de nacimiento del usuario
        System.out.println("Dame tu año de nacimiento: ");
        System.out.println("el anio debe ser ultimos 2 digitos: ");
        do{
        System.out.println("anio: ");
        aa = scanner.nextByte();
        }while((aa < 1 || aa > 99) && (aa + "").length()<2);

        //verifico si es bisiesto
        bisiesto = aa % 4 == 0;

        do{
        System.out.println("mes: ");
        mm = scanner.nextByte();
        }while(mm < 1 || mm > 12);

        //Llamo a función para verificar los dias del mes y ver si es bisiesto
        int Ver_dias_mes = VerificarDias(mm, bisiesto);

        do{
            System.out.println("dia: ");
            dd = scanner.nextByte();

            }while((dd < 1 || dd > Ver_dias_mes));

        //Alojo datos en el arreglo
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

        //Imprimo resultados
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
    } 

    // Metodo para desplegar arreglo
    public static void Desplear_arreglo(char[] a)
    {
        for (int i = 0; i < a.length; i++)
        {
            System.out.print(a[i]);
        }
    }


    // Metodo para verificar los dias del mes segun el mes y el año
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