import java.util.Scanner;


public class EJ9 
{
    
    //main
    public static void main(String[] args) 
    {
        
        System.out.println("\n---------------------repaso de ciclos y condiciones----------------------\n");
        Scanner scanner = new Scanner(System.in);
        

        int dd,mm,aa;
        String mes = "";

        System.out.println("dame tu fecha de nacimiento:\n(Escribe en 2 digitos)\n");

        System.out.print("dia: ");
        dd = Integer.parseInt(scanner.nextLine());

        do{
        System.out.print("mes: ");
        mm = scanner.nextInt();
        }while(mm < 1 || mm > 12);
        
        System.out.print("anio: ");
        aa = scanner.nextInt();

        System.out.println("naciste el " + NombreDia(dd) + " de " + NombreMes(mm) + " del " + aa);

        System.out.println("\n--------------------------------------------------------------------------\n");

    }


    //Librerias

    public static String NombreMes(int mm)
    {
        String mes = "";
        switch (mm) 
        {
            case 1 -> mes = "Enero";

            case 2 -> mes = "febrero";

            case 3 -> mes = "marzo";
                
            case 4 -> mes = "abril";
                
            case 5 -> mes = "mayo";

            case 6 -> mes = "junio";
            
            case 7 -> mes = "julio";
                
            case 8 -> mes = "agosto";
                
            case 9 -> mes = "septiembre";

            case 10 -> mes = "octubre";

            case 11 -> mes = "noviembre";
            
            case 12 -> mes = "diciembre";
        }
        return mes;
    }

    public static String NombreDia(int numero)
    {
        String dia = "";
        int decenas = numero / 10;
        int unidades = numero % 10;

        if(numero >= 10 || numero <= 15)
        {
            switch (numero) 
            {

                case 11 -> dia = "once";

                case 12 -> dia = "doce";

                case 13 -> dia = "trece";

                case 14 -> dia = "catorce";

                case 15 -> dia = "quince";

            }
        }
        else
        {
            switch (decenas) 
            {
                case 1 -> dia = "Dieci";

                case 2 -> dia = "veinti";
            }

        switch (unidades)
            {
                case 1 -> dia += "uno";

                case 2 -> dia += "dos";

                case 3 -> dia += "tres";

                case 4 -> dia += "cuatro";

                case 5 -> dia += "cinco";

                case 6 -> dia += "seis";

                case 7 -> dia += "siete";

                case 8 -> dia += "ocho";

                case 9 -> dia += "nueve";
            }
        }  
        return dia;
    }

}
