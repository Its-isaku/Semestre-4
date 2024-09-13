public class Valida 
{
    // metodo para validar si es vacio
    public static boolean StrVacio(String elem)
    {
        if(elem.length() ==  0)
            return true;
        else
            return false;

    }

    // metodo para validar si son letras
    public static boolean SoloLetras(String cadena)
    {
        int ultimo =cadena.length() -1;
        if(cadena.charAt(0) ==  ' ' || cadena.charAt(ultimo) == ' ')
        {
            System.out.println("sin espacios al inicio o fnal!");
            return  false;
        }

        for(int index = 0; index < cadena.length(); index++)
        {

            if(cadena.charAt(index) == ' ')
            {

            }
            else
            {
                if(!Character.isLetter(cadena.charAt(index)))
                {
                    System.out.println("Solo puede tener letras!");
                    return false;
                }
            }
        }
        return  true;
    }

    // metodo para validar si es un numero positivo
    public static boolean positivos(int numero)
    {
        if(numero > 0) return true;
        else return false;
    }

}
