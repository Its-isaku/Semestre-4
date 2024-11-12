//? Librerias
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.Scanner;

public class VentasTelefono 
{
    //? Atributos
    private String Producto;
    private int Precio;
    private int Cantidad;
     private static Scanner scanner = new Scanner(System.in); //? Scanner para operaciones de usuario

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

    //? Metodo para alta de productos
    public static VentasTelefono altaProducto() 
    {
        System.out.println("Ingrese el nombre del producto:");
        String nombre = scanner.nextLine();

        System.out.println("Ingrese el precio del producto:");
        int precio = Integer.parseInt(scanner.nextLine());

        System.out.println("Ingrese la cantidad del producto:");
        int cantidad = Integer.parseInt(scanner.nextLine());

        return new VentasTelefono(nombre, precio, cantidad);    //? Retorna un nuevo producto 
    }
    
    //? Metodo para dar de baja un producto
    public static void bajaProducto(List<VentasTelefono> productos) 
    {
        System.out.println("Ingrese el nombre del producto a dar de baja:");
        String nombre = scanner.nextLine();

        productos.removeIf(producto -> producto.getProducto().equalsIgnoreCase(nombre));    //? Remueve el producto si el nombre es igual al ingresado
        System.out.println("Producto eliminado exitosamente.");
    }

    //? Metodo para consultar un producto
    public static void consultarProducto(List<VentasTelefono> productos) 
    {
        System.out.println("Ingrese el nombre del producto a consultar:");
        String nombre = scanner.nextLine();

        for (VentasTelefono producto : productos) 
        {
            if (producto.getProducto().equalsIgnoreCase(nombre)) 
            {
                System.out.println(producto);
                return;
            }
        }
        System.out.println("Producto no encontrado.");
    }

    //? Metodo para mostrar todos los productos
    public static void mostrarProductos(List<VentasTelefono> productos) 
    {
        System.out.println("Productos disponibles:");
        for (VentasTelefono producto : productos)   //? Recorrer los productos
            System.out.println(producto);   //? Mostrar el producto
    }

    //? Metodo para realizar un pedido
    public void hacerPedido() 
    {
        System.out.println("Ingrese la cantidad que desea pedir:");
        int cantidadPedido = Integer.parseInt(scanner.nextLine());

        System.out.println("Ingrese el nombre del cliente:");
        String nombre = scanner.nextLine();

        System.out.println("Ingrese la dirección del cliente:");
        String direccion = scanner.nextLine();

        System.out.println("Ingrese el teléfono del cliente:");
        String telefono = scanner.nextLine();

        Cliente cliente = new Cliente(nombre, direccion, telefono);     //? Crear un nuevo cliente

        if (cantidadPedido <= Cantidad)     //? Si la cantidad pedida es menor o igual a la cantidad en stock
        {
            Cantidad -= cantidadPedido;    //? Restar la cantidad pedida a la cantidad en stock
            System.out.println("Pedido realizado exitosamente para " + cliente.getNombre() + " con dirección " + cliente.getDireccion());   //? Mostrar mensaje de pedido exitoso
        } 
        else
            System.out.println("Cantidad insuficiente en stock.");  //? Mostrar mensaje de cantidad insuficiente
    }

    //? Metodo para realizar un apartado
    public void hacerApartado() throws IOException 
    {
        System.out.println("Ingrese el nombre del cliente:");
        String nombre = scanner.nextLine();
        
        System.out.println("Ingrese la dirección del cliente:");
        String direccion = scanner.nextLine();

        System.out.println("Ingrese el teléfono del cliente:");
        String telefono = scanner.nextLine();

        Cliente cliente = new Cliente(nombre, direccion, telefono);    //? Crear un nuevo cliente

        System.out.println("Ingrese el monto inicial para el apartado(debe ser al menos 25%):");        
        int montoInicial = Integer.parseInt(scanner.nextLine());

        if (montoInicial >= Precio * 0.25)  //? Si el monto inicial es al menos el 25% del precio del producto 
        {
            int faltante = Precio - montoInicial;   //? Calcular el faltante
            String apartado = cliente.toString() + ", Producto: " + Producto + ", Monto inicial: " + montoInicial + ", Faltante: " + faltante + "\n";   //? Crear el apartado

            try (FileWriter writer = new FileWriter("Apartados.txt", true)) //? Escribir en el archivo de apartados
            {
                writer.write(apartado);   //? Escribir el apartado
                System.out.println("Apartado realizado con éxito.");    
            }
        } 
        else    //? Si el monto inicial es menor al 25% del precio del producto
            System.out.println("El monto inicial debe ser al menos el 25% del precio del producto.");
    }

    //? Metodo para pagar un apartado
    public void pagarApartado(String clienteNombre) throws IOException 
    {
        List<String> apartados = Files.readAllLines(Paths.get("Apartados.txt"));    //? Leer todos los apartados
        try (FileWriter writer = new FileWriter("Apartados.txt"))   //? Escribir en el archivo de apartados
        {
            for (String apartado : apartados)   //? Recorrer los apartados
            {
                if (!apartado.contains("Nombre: " + clienteNombre) || !apartado.contains("Producto: " + Producto))  //? Si el apartado no contiene el nombre del cliente o el producto
                {
                    writer.write(apartado + "\n");  //? Escribir el apartado
                }
            }
            System.out.println("Apartado pagado y eliminado con éxito.");   //? Mostrar mensaje de apartado pagado
        }
    }

}
