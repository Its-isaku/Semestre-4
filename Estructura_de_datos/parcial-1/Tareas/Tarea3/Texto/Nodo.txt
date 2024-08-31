//Liberrias
import java.time.LocalDateTime;

public class Nodo 
{
    private String Elem;
    private Nodo next; //cuerda que unae a otro elemento
    private LocalDateTime FechaHora;

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

    
    public void setFecha_Hora(LocalDateTime FechaHora)
    {
        this.FechaHora = FechaHora;
    }

    public LocalDateTime getFecha_Hora()
    {
        return FechaHora;
    }
}
