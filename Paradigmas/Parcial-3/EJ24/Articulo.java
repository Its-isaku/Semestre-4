public class Articulo 
{
    private String nombre;
    private double precio;
    protected Double Descuento;

    // Constructor
    public Articulo()
    {
        this.nombre = "";
        this.precio = 0;
        this.Descuento = 0.10;
    }

    // Getters y Setters
    public String getNombre() { return nombre;}
    public void setNombre(String nombre) { this.nombre = nombre;}

    public double getPrecio() { return precio;}
    public void setPrecio(double precio) { this.precio = precio;}

    // Metodos

    public void Convierte()
    {
        this.nombre = this.nombre.toUpperCase();
    }

    public void Convierte(int num)
    {
        this.nombre = this.nombre.toLowerCase();
    }

    public boolean Valida()
    {
        return this.precio > 0;
    }

    public void Valida(double precio)
    {
        if(precio > 1000)
        {
            this.precio = precio - (precio * Descuento);
        }
        else
            this.precio = precio;
    }

    public boolean Valida(String nombre)
    {
        return nombre.length() > 0;
    }

    public void Valida(String nombre, int num)
    {
        boolean numeros = false;
        for (int i = 0; i < nombre.length(); i++) 
        {
            if(Character.isDigit(nombre.charAt(i))) // Verifica si hay numeros
            {
                numeros = true;
            }
        }
        this.nombre = !numeros ? nombre : " ";
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Articulo{");
        sb.append("nombre=").append(nombre);
        sb.append(", precio=").append(precio);
        sb.append(", Descuento=").append(Descuento);
        sb.append('}');
        return sb.toString();
    }


}
