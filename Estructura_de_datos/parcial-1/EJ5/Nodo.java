//modelo se 
//molde de una clase
public class Nodo 
{
    private String Elem;
    private Nodo next; //cuerda que unae a otro elemento

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

    public void setnext(Nodo variable)
    {
        next = variable;
    }
    public Nodo getnext()
    {
        return next;
    }
}