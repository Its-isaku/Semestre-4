
public class NodoStack 
{
    private String Elem;
    private NodoStack next; 

    public void setElem(String variable) 
    {
        Elem = variable;
    }
    
    public String getElem()
    {
        return Elem;
    }

    public void setNext(NodoStack variable)
    {
        next = variable;
    }
    public NodoStack getNext()
    { 
        return next;
    }
}
