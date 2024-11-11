public class Estatica 
{
    //? clase estatica
    public static boolean Bisiesto(int num)
    {
        return num % 4 ==  0;
    }

    //? Generar numero aleatorio
    public static int Aleatorio(int min, int max)
    {
        int aux = (int) (Math.random() * (max - min + 1) + min);
        System.out.print(aux);
        return aux;
    }

    //?
    public static int SigDecada(int num)
    {
        int incremento = 10;
        num += incremento;
        return num;

    }
}
