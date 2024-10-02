
public class Nodo 
{
    private String Elem;
    private Nodo next; 

    public void setElem(String variable) 
    {
        Elem = variable;
    }
    
    public String getElem()
    {
        return Elem;
    }

    public void setnext(Nodo variable)
    {
        next = variable;
    }
    public Nodo getnext()
    { 
        return next;
    }
}
