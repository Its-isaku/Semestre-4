//librerias

public class EJ7 
{
    //Main
    public static void main(String[] args) 
    {

        double valor1 = (int)(Math.random()*50 + 1);
        /*precio de 3 productos,si el valor es menor a 30 se cobra1% cuano el calor sea entre 30 y 39
        se le cobra un iva 2%, si es mayor de 39 se cobre 3% */

        double  iva = 0;

        //Precio menor a 30 sin Iva, de 30 - 39 Iva 2%, y > 39 Iva 3%
        iva = (valor1 > 39) ? valor1 * 0.03: ((valor1 > 29) ? valor1 * 0.02: 0); 


        System.out.println("\n-----------------------------------------\n");
        System.out.println("Precio 1: " + valor1 + "\n");
        System.out.println("iva: " + iva + "\n");
        System.out.println("Total: " + (valor1 + iva) + "\n");
        System.out.println("\n-----------------------------------------\n");
    }

    //Funciones

}
