

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
        int pos = calcularHash(dato);
    
        // Resolución de colisión por sondeo lineal
        while (!Arreglo[pos].equals("Vacio"))
        {
            if (Arreglo[pos].equals(dato))
            {
                System.out.println(dato + " se encuentra en la posición: " + pos);
                return;
            }
            pos = (pos + 1) % Size; // Avanzar al siguiente índice
        }
        System.out.println("El dato no se encuentra en el arreglo.");
    }
    
    private int calcularHash(String dato)
    {
        int hashValue = 0;
        int base = 31;
        for (int i = 0; i < dato.length(); i++)
        {
            hashValue = (hashValue * base + dato.codePointAt(i)) % Size;
        }
        return hashValue;
    }
    
    public void AsignaHash(String dato)
    {
        int pos = calcularHash(dato);
    
        if (Arreglo[pos].equals("Vacio"))
        {
            Arreglo[pos] = dato;
        }
        else
        {
            System.out.println("\nPosición ocupada....\nBuscando otra posición!\n");
        
            while (!Arreglo[pos].equals("Vacio"))
            {
                pos = (pos + 1) % Size; // Sondeo lineal
            }
            Arreglo[pos] = dato;
            System.out.println("Se asignó en la posición: " + pos);
        }
    }
}
