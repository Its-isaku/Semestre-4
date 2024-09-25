//Librerias
import java.time.LocalDateTime;

public class Nodo 
{
    private String Elem;
    private Nodo next;
    private int turno;
    private LocalDateTime hora;

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

    public int getTurno() 
    {
        return turno;
    }

    public void setTurno(int turno) 
    {
        this.turno = turno;
    }

    public LocalDateTime getHora()
    {
        return hora;
    }

    public void setHora(LocalDateTime hora) 
    {
        this.hora = hora;
    }

    @Override
    public String toString() 
    {
        return "Paciente [Nombre = " + Elem + ", turno = " + turno + ", hora = " + hora + "]";
    }
}
