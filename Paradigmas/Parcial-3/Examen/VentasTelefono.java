public class VentasTelefono 
{
    //? Atributos
    private String Producto;
    private int Precio;
    private int Cantidad;

    //? constructor
    public VentasTelefono(String producto, int precio, int cantidad) 
    {
        this.Producto = producto;
        this.Precio = precio;
        this.Cantidad = cantidad;
    }

    //? Getters y Setters
    public String getProducto() { return Producto; }
    public void setProducto(String Producto) { this.Producto = Producto; }

    public int getPrecio() { return Precio; }
    public void setPrecio(int Precio) { this.Precio = Precio; }

    public int getCantidad() { return Cantidad; }
    public void setCantidad(int Cantidad) { this.Cantidad = Cantidad; }
    
    //? Metodos

    @Override
    public String toString() 
    {
        return "Producto: " + Producto + ", Precio: $" + Precio + ", Cantidad: " + Cantidad;
    }
    
}
