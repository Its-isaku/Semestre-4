public class Empleado extends Persona 
{
    private double Salario;
    private String Id;
    private char Turno;// M: matutino , V: vespertino , N: nocturno

    //? cuando no hay constructor lo toma de la clase padre(Persona)
    public Empleado(double salario, String id, char turno)
    {
        this.Salario = salario;
        this.Id = id;
        this.Turno = turno;
    }

    public double getSalario() { return Salario;}
    public void setSalario(double salario) { Salario = salario;}

    public String getId() { return Id;}
    public void setId(String id) { Id = id;}

    public char getTurno() { return Turno;}
    public void setTurno(char turno) { Turno = turno;}

    @Override
    public String toString() 
    {
        return "Empleado [Salario=" + Salario + 
                ", Id=" + Id + 
                ", Turno=" + Turno + 
                ", getNombre()=" + getNombre() + 
                ", getEstatura()=" + getEstatura() + 
                ", getCurp()=" + getCurp() + 
                ", getActivo()=" + getActivo() + "]";
    }
}
