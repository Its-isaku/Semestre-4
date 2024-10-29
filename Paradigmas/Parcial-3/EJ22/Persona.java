public class Persona 
{
    //? atributos
    private String Nombre;
    private float Estatura;  
    private String curp; // probar con otros accesos
    private boolean Activo; // default: false

    //* constructor con datos iniciales/default
    public Persona()
    {
        this.Nombre = "";
        this.Estatura = 0;
        this.curp = "";
        this.Activo = false;
    }

    //* constructor con parametros
    public Persona(String Nombre, float Estatura, boolean Activo)
    {
        this.Nombre = Nombre;
        this.Estatura = Estatura;
        this.Activo = false;
    }

    public Persona(float Estatura, String Nombre, boolean Activo)
    {
        this.Nombre = Nombre;
        this.Estatura = Estatura;
        this.Activo = false;
    }

    public Persona(String Nombre)
    {
        this.Nombre = Nombre;
    }

    //? metodos: get, set, constructor, otros para funcion del usuario

    public String getNombre() {return Nombre;}
    public void setNombre(String nombre) {Nombre = nombre;}

    public float getEstatura() {return Estatura;}
    public void setEstatura(float estatura) {Estatura = estatura;}

    public String getCurp() {return curp;}
    public void setCurp(String curp) {this.curp = curp;}

    public boolean getActivo() {return Activo;}
    public void setActivo(boolean activo) {Activo = activo;}

    @Override
    public String toString() 
    {
        return "Persona [Nombre=" + Nombre +
                ", Estatura=" + Estatura + 
                ", curp=" + curp + 
                ", Activo=" + Activo + "]";
    }

    //* otros metodos
    public void crece(float valor)
    {
        this.Estatura += valor;
    }
}
