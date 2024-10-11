
public class NodoSE 
{
    private int Elem;
    private NodoSE next; 
    private NodoSE back; 

    public void setElem(int variable) 
    {
        Elem = variable;
    }
    
    public int getElem()
    {
        return Elem;
    }

    public void setnext(NodoSE variable)
    {
        next = variable;
    }
    public NodoSE getnext()
    { 
        return next;
    }

    public NodoSE getBack() {
        return back;
    }

    public void setBack(NodoSE variable) {
        this.back = variable;
    }
}
