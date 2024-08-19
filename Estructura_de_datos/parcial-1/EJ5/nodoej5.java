//modelo se 
//molde de una clase
public class nodoej5 {
    private String Elem;
    private nodoej5 next; //cuerda que unae a otro elemento
    //get asignacion o conloca elemento en a caja
    //mas adelante se cambiaran el nombre de las variables
    public void setElem(String variable) {
        Elem = variable;
    }
    //get permite visualizar el contenido, regresa
    public String getElem(){
        return Elem;
    }

    public void setnext(nodoej5 variable)
    {
        next = variable;
    }
    public nodoej5 getnext(){
        return next;
    }
}