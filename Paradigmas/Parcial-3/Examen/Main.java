/*
? Examen parcial 2 Paradigmas de la programacion

* Tema grupal: Tiendita electrónicos

! Sección para llevar: 15 puntos
* Cada alumno desarrollara las clase asignadas: atributos, constructores, get, set y otros métodos.
* Debe incluir validaciones estáticas o en la misma clase.
* Realice un menú que permita: alta, baja, consulta, mostrar, salir, como mínimo.
* Debe incluir lectura y escritura de archivos.

! Sección día del examen: 5 puntos
* El día del examen se presenta la sección asignada y se pedirá una modificación sobre el código.

! Cuestiones importantes:
* a) El alumno debe presentar ambas secciones para tener los puntos del examen.
*     En caso de no presentar alguna, se obtiene cero puntos.
* b) Si no termina la sección para llevar, al menos debe tener un avance estable
*     (compile y no truene), que le permita realizar la sección del día del examen.
* c) Secciones iguales en cualquier examen: se cancela todo el examen.

! Clases
* 1. Empleados y Sucursales. Sofia
* 2. Productos y categorías. Gareth
* 3. Accesorios. Pertenece a un producto. Villa
* 4. Ventas en tienda. Paola
* 5. Apartados. Jose
* 6. Ventas por teléfono. Isai
* 7. Clientes y Menu de todo. Rubio

* Si usted necesita clases de otro compañero, usted haga su propia clase con datos básicos.
 */

//? Liberias
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main
{
    //? Variables globales
    public static Scanner scanner = new Scanner(System.in);   //? Scanner global
    public static int opc;  //? Opcion del menu
    public static List<VentasTelefono> productos = new ArrayList<>();   //? Lista de productos(objetos)

    //? Clase principal
    public static void main(String[] args) throws IOException 
    {
        //? Variables
        String archivo = "productos.txt";

        //? Cargar productos desde el archivo
        leerArchivo(archivo);

        //? inicio
        System.out.println("\n||------------------------Examen 2 - Paradigmas------------------------||");
        do
        {
            menu(); //? Muetsra el menu
            switch (opc) 
            {

                case 1 -> AltaProductos();    //? Dar de alta producto

                case 2 -> BajaProductos();     //? Dar de baja producto

                case 3 -> ConsultarProductos();    //? Consultar producto

                case 4 -> mostrarProductos();    //? Mostrar productos disponibles

                case 5 -> HacerPedido();     //? hacer pedido

                case 6 ->  {}   //? Hacer apartado

                case 7 ->  {}   //? Pagar apartado

                case 9 -> System.out.println("\nSaliendo...\n");    //? Salir
            
                default -> System.out.println("Opcion invalida");   //? Opcion invalida
            }

        }while(opc!=9); //? Mientras la opcion sea diferente de 9

        //? Guardar productos al archivo al salir
        guardarArchivo(archivo);

        System.out.println("||---------------------------------------------------------------------||\n");

    }

    //? Metodos

    //* Menu
    public static void menu()
    {
        System.out.println("\n||------------------------Menu------------------------||");
        System.out.println("|| 1 -> Dar de alta producto                          ||");
        System.out.println("|| 2 -> Dar de baja producto                          ||");
        System.out.println("|| 3 -> Consultar producto                            ||");
        System.out.println("|| 4 -> Mostrar productos disponibles                 ||");
        System.out.println("|| 5 -> hacer pedido                                  ||");
        System.out.println("|| 6 -> Hacer apartado                                ||");
        System.out.println("|| 7 -> Pagar apartado                                ||");
        System.out.println("|| 9 -> Salir                                         ||"); 
        System.out.println("||----------------------------------------------------||\n");
        opc = Integer.parseInt(scanner.nextLine());
    }

     //? Metodo para leer el archivo de productos
    public static void leerArchivo(String archivo) throws IOException
    {
        List<String> lineas = Files.readAllLines(Paths.get(archivo));   //? Leer todas las lineas del archivo
        for (String linea : lineas)  //? Recorrer las lineas
        {
            String[] datos = linea.split(",");    //? Separar los datos por coma
            String nombre = datos[0];   //? Nombre del producto
            int precio = Integer.parseInt(datos[1]);    //? Precio del producto
            int cantidad = Integer.parseInt(datos[2]);  //? Cantidad del producto
            productos.add(new VentasTelefono(nombre, precio, cantidad));    //? Agrega el producto a la lista
        }
        System.out.println("Productos cargados correctamente.\n");    
    }

     //? Metodo para guardar productos en el archivo
    public static void guardarArchivo(String archivo) throws IOException
    {
        List<String> lineas = new ArrayList<>();    //? Lista de lineas de productos
        for (VentasTelefono producto : productos)   //? Recorrer los productos
        {
            lineas.add(producto.getProducto() + "," + producto.getPrecio() + "," + producto.getCantidad());     //? Agregar los productos a la lista con el mismo formato
        }
        Files.write(Paths.get(archivo), lineas);    //? Escribir las lineas en el archivo
        System.out.println("Productos guardados correctamente.\n");
    }

    //? Metodo para dar de alta un producto
    public static void AltaProductos()
    {
        System.out.println("Ingrese el nombre del producto:");  //? Solicitar nombre del producto
        String nombre = scanner.nextLine();
        System.out.println("Ingrese el precio del producto:");  //? Solicitar precio del producto
        int precio = Integer.parseInt(scanner.nextLine());
        System.out.println("Ingrese la cantidad del producto:");    //? Solicitar cantidad del producto
        int cantidad = Integer.parseInt(scanner.nextLine());

        productos.add(new VentasTelefono(nombre, precio, cantidad));    //? Agregar el producto a la lista
        System.out.println("Producto agregado exitosamente.");
    }

    //? Metodo para dar de baja un producto
    public static void BajaProductos()
    {
        System.out.println("Ingrese el nombre del producto a dar de baja:");    //? Solicitar nombre del producto a dar de baja
        String nombre = scanner.nextLine();
        boolean encontrado = false;

        for (VentasTelefono producto : productos)   //? Recorrer los productos
        {
            if (producto.getProducto().equalsIgnoreCase(nombre))  //? Si el producto es igual al nombre ingresado
            {
                productos.remove(producto); //? Eliminar el producto
                System.out.println("Producto eliminado exitosamente.");
                encontrado = true;
                break;
            }
        }

        if (!encontrado)   //? Si no se encontro el producto
            System.out.println("Producto no encontrado.");
    }

    //? Metodo para consultar un producto
    public static void ConsultarProductos()
    {
        System.out.println("Ingrese el nombre del producto a consultar:");  //? Solicitar nombre del producto a consultar
        String nombre = scanner.nextLine();
        boolean encontrado = false;

        for (VentasTelefono producto : productos)   //? Recorrer los productos
        {
            if (producto.getProducto().equalsIgnoreCase(nombre))    //? Si el producto es igual al nombre ingresado
            {
                System.out.println(producto);   //? Mostrar el producto
                encontrado = true;
                break;
            }
        }

        if (!encontrado)    //? Si no se encontro el producto
            System.out.println("Producto no encontrado.");
    }

    //? Metodo para mostrar todos los productos
    public static void mostrarProductos()
    {
        System.out.println("Productos disponibles:");
        for (VentasTelefono producto : productos)
        {
            System.out.println(producto);
        }
    }

    //? Metodo para hacer un pedido y reducir la cantidad de stock
    public static void HacerPedido()
    {
        System.out.println("Ingrese el nombre del producto a pedir:");  //? Solicitar nombre del producto a pedir
        String nombre = scanner.nextLine();
        System.out.println("Ingrese la cantidad que desea pedir:");   //? Solicitar cantidad del producto a pedir
        int cantidadPedido = Integer.parseInt(scanner.nextLine());  
        boolean encontrado = false;

        for (VentasTelefono producto : productos)   //? Recorrer los productos
        {
            if (producto.getProducto().equalsIgnoreCase(nombre))    //? Si el producto es igual al nombre ingresado
            {
                if (producto.getCantidad() >= cantidadPedido)   //? Si la cantidad en stock es mayor o igual a la cantidad del pedido
                {
                    producto.setCantidad(producto.getCantidad() - cantidadPedido);  //? Restar la cantidad del pedido a la cantidad en stock
                    System.out.println("Pedido realizado exitosamente.");
                } 
                else   //? Si la cantidad en stock es menor a la cantidad del pedido
                    System.out.println("Cantidad insuficiente en stock.");
                encontrado = true;
                break;
            }
        }

        if (!encontrado)  //? Si no se encontro el producto
            System.out.println("Producto no encontrado.");
    }

    /*
    ! FAlTANTE
    ? Crear metodo de persona para poder registrar los apartados
    ? crear txt donde se guarden los apartados
    ? Pedir datos de la persona y direccion a donde se enviara el producto (opc 5)
    ? Hacer apartados
    ? Pagar apartados
     */
}
