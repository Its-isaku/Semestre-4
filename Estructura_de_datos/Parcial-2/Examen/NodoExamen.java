public class NodoExamen 
{
    private String Elem;
    private NodoExamen Next;
    private String TipoConsulta;
    private int TiempoConsulta;
    
    // getters y setters
    
    public String getElem() { return Elem;}
    public void setElem(String elem) { this.Elem = elem;}

    public NodoExamen getNext() { return Next;}
    public void setNext(NodoExamen next) { this.Next = next;}

    public String getTipoConsulta() { return TipoConsulta;}
    public void setTipoConsulta(String tipoConsulta) { this.TipoConsulta = tipoConsulta;}

    public int getTiempoConsulta() { return TiempoConsulta;}
    public void setTiempoConsulta(int tiempoConsulta) { this.TiempoConsulta = tiempoConsulta;}

}
