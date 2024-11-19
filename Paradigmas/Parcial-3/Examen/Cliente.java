public class Cliente 
{
    //? Atributos
    private String Nombre;
    private String Direccion;
    private String Telefono;

    //? constructor
    public Cliente(String nombre, String direccion, String telefono) 
    {
        this.Nombre = nombre; 
        this.Direccion = direccion;
        this.Telefono = telefono;
    }

    //? Getters y Setters
    public String getNombre() { return Nombre; }
    public void setNombre(String Nombre) { this.Nombre = Nombre; }

    public String getDireccion() { return Direccion; }
    public void setDireccion(String Direccion) { this.Direccion = Direccion; }

    public String getTelefono() { return Telefono; }
    public void setTelefono(String Telefono) { this.Telefono = Telefono; }

    //? Metodos

    @Override
    public String toString() 
    {
        return "Nombre: " + Nombre + ", Direccion: " + Direccion + ", Telefono: " + Telefono;
    }
}
