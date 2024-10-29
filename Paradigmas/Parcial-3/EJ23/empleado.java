public class empleado extends persona
{

    private double tiempo;
    private puesto actividad;// asociasion.

    public puesto getActividad() { return actividad;}
    public void setActividad(puesto actividad) { this.actividad = actividad;}

    public double getTiempo() { return tiempo;}
    public void setTiempo(double tiempo) { this.tiempo = tiempo;}

    public int getId() { return id;}
    public void setId(int id) { this.id = id;}

    public char getTurno() { return turno;}
    public void setTurno(char turno) { this.turno = turno;}

    private int id;
    private char turno;

    public empleado(double tiempo, char turno)
    {
        this.tiempo=tiempo;
        this.turno=turno;
    }

    public empleado()
    {
        this.tiempo=0;
        this.turno=' ';
        this.actividad=null;
    }
    @Override
    public String toString() 
    {
        return "\nempleado [ ID= " + id +  ", Nombre= " + getNombre() + ", Estatura= " + getEstatura() + ", tiempo= " + tiempo + turno +"] \n         [" 
                        + " Puesto=" + getActividad().getNombre() + ", Salario= "+ getActividad().getSalario() + "]"  ;
    }

}
