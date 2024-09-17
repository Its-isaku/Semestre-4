//modelo se 
//molde de una clase
public class NodoEJ6 
{
    private String Elem;
    private NodoEJ6 next; //cuerda que unae a otro 
    private NodoEJ6 back;

    //get asignacion o conloca elemento en a caja
    //mas adelante se cambiaran el nombre de las variables
    public void setElem(String variable) 
    {
        Elem = variable;
    }
    
    //get permite visualizar el contenido, regresa 
    public String getElem()
    {
        return Elem;
    }

    public void setnext(NodoEJ6 variable)
    {
        next = variable;
    }
    public NodoEJ6 getnext()
    { 
        return next;
    }
    
    public void setback(NodoEJ6 variable)
    {
        back = variable;
    }
    public NodoEJ6 getback()
    { 
        return back;
    }
}
