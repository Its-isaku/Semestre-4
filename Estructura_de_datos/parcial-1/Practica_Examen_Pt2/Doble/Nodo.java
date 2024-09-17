public class Nodo 
{
    private String Dato;
    private Nodo Next;
    private  Nodo Back;

    public void setDato(String valor)
    {
        Dato = valor;
    }

    public String getDato()
    {
        return Dato;
    }

    public void setNext(Nodo valor)
    {
        Next = valor;
    }

    public Nodo getNext()
    {
        return Next;
    }

    public void setBack(Nodo valor)
    {
        Back = valor;
    }

    public Nodo getback()
    {
        return Back;
    }
}
