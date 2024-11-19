

public class HashArray
{
    private String[] Arreglo;
    private int Size;

    //? constructor
    public HashArray(int size)
    {
        this.Size = size;
        Arreglo = new String[size];
        for (int i = 0; i < Arreglo.length; i++) 
            Arreglo[i] = "Vacio";
    }

    public void Mostrar()
    {
        for(int i = 0; i < Arreglo.length; i++)
            System.out.println(i + " : " + Arreglo[i]);
    }

    public void Buscar(String dato)
    {
        int pos = 0, SumaAscii = 0;

        for (int i = 0; i < dato.length(); i++)    //? recorre la cadena
            SumaAscii += dato.codePointAt(i);    //? suma los valores ascii de cada caracter
        pos = SumaAscii % Size;    //? calcula la posicion

        if(Arreglo[pos].equals(dato))
            System.out.println(dato + " se encuentra en la posicion: " + pos);
        else
            System.out.println("Fue colision buscando la posicion....");
    }

    public void AsignaHash(String dato)
    {
        int pos = 0, SumaAscii = 0;

        for (int i = 0; i < dato.length(); i++)    //? recorre la cadena
            SumaAscii += dato.codePointAt(i);    //? suma los valores ascii de cada caracter

        //SumaAscii += Math.pow(dato.codePointAt(i), i+1);    //? suma los valores ascii de cada caracter    


        pos = SumaAscii % Size;    //? calcula la posicion
        System.out.println(dato + " va en posicion: " + pos);

        if(Arreglo[pos].equals("Vacio"))
            Arreglo[pos] = dato;
        else
        {
            System.out.println("\nPosicion ocupada....\nBuscando Otra posicion!\n");

            while(!Arreglo[pos].equals("Vacio"))
            { 
                pos++;  //? se incrementa la posicion
                if(pos == Size) //? si llega al final del arreglo se devuelve al inicio
                    pos = 0;
            }
            System.out.println("Se asigno en la posicion: " + pos);
            Arreglo[pos] = dato;
        }
    }
}
