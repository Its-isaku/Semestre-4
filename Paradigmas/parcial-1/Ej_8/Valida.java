public class Valida 
{
    public static boolean StrVacio(String elem)
    {
        if(elem.length() ==  0)
            return true;
        else
            return false;

    }

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

    public static boolean positivos(int numero)
    {
        if(numero > 0) return true;
        else return false;
    }

}
