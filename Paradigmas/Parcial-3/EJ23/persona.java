public class persona 
{
    //atributos
    //metodos: get, set, constructor, otros para funcion del usuario.
    private String nombre;

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public float getEstatura() { return estatura; }
    public void setEstatura(float estatura) { this.estatura = estatura; }

    public boolean isActivo() { return activo; }
    public void setActivo(boolean activo) { this.activo = activo; }

    public String getCurp() { return curp; }
    public void setId(String curp) { this.curp = curp; }

    private float estatura;
    private boolean activo;
    private String curp;
    
    //constructor con los datos iniciales, default
    public persona()
    {
        this.nombre = "pendiente";
        this.estatura=0;
        activo = false;
    }

    public persona(String nombre, float estatura, boolean activo)
    {
        this.nombre = nombre;
        this.estatura= estatura;
        this.activo = activo;
    }

    public persona(String nombre)
    {
        this.nombre=nombre;
        this.estatura=0;
        activo=false;
    }

    @Override
    public String toString() 
    {
        return "persona [nombre=" + nombre + ", estatura=" + estatura + ", activo=" + activo + ", id=" + curp + "]";
    }

    // OTROS METODOS;
    public void crece(float valor)
    {
        this.estatura += valor;
    }

}
