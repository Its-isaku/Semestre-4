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
            switch (opc) {
                case 1 -> productos.add(VentasTelefono.altaProducto());    //? Dar de alta producto

                case 2 -> VentasTelefono.bajaProducto(productos);          //? Dar de baja producto

                case 3 -> VentasTelefono.consultarProducto(productos);     //? Consultar producto

                case 4 -> VentasTelefono.mostrarProductos(productos);      //? Mostrar productos disponibles

                case 5 -> 
                {
                    System.out.println("Ingrese el nombre del producto a pedir:"); 
                    String nombreProducto = scanner.nextLine();

                    for (VentasTelefono producto : productos)   //? Recorrer los productos
                    {
                        if (producto.getProducto().equalsIgnoreCase(nombreProducto)) //? Si el producto es igual al ingresado
                        {
                            producto.hacerPedido(); //? hacer pedido  
                            break;
                        }
                    }
                }

                case 6 -> 
                {
                    System.out.println("Ingrese el nombre del producto a apartar:");
                    String nombreProducto = scanner.nextLine();

                    for (VentasTelefono producto : productos)   //? Recorrer los productos
                    {
                        if (producto.getProducto().equalsIgnoreCase(nombreProducto))    //? Si el producto es igual al ingresado
                        {
                            producto.hacerApartado(); //? Hacer apartado
                            break;
                        }
                    }
                }

                case 7 -> 
                {
                    System.out.println("Ingrese el nombre del producto a pagar:");  //? Pregu tar el nombre del producto
                    String nombreProducto = scanner.nextLine();
                    System.out.println("Ingrese el nombre del cliente que realizó el apartado:");   //? Preguntar el nombre del cliente
                    String nombreCliente = scanner.nextLine();
                    
                    for (VentasTelefono producto : productos)   
                    {
                        if (producto.getProducto().equalsIgnoreCase(nombreProducto))    //? Si el producto es igual al ingresado
                        {
                            producto.pagarApartado(nombreCliente); //? Pagar apartado y borralo de archivo
                            break;
                        }
                    }
                }
                case 9 -> System.out.println("\nSaliendo...\n");    //? Salir
                default -> System.out.println("Opcion invalida");
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
}
