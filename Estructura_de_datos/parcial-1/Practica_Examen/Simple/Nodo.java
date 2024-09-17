// clase nodo
public class Nodo 
{
    //variables
    private String Dato; // Referencia al dato 
    private Nodo Next; //Referencia al siguiente Nodo

    //Metodos necesarios para la clase
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
}
