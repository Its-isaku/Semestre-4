![Lista Enlazada](LE.png) 

Una **lista enlazada simple** es una estructura de datos lineal en la que cada elemento (llamado Nodo) contiene dos partes:

- **Datos**: la información que almacena el Nodo.
- **Referencia al siguiente Nodo**: un puntero o enlace que apunta al siguiente Nodo en la lista.

**Características**:

- Los Nodos se conectan en una secuencia lineal.
- La lista empieza con un Nodo inicial llamado **cabeza** (head), y cada nodo apunta al siguiente hasta llegar al último nodo, que tiene una referencia nula (null) para indicar el final de la lista.
- El recorrido de una lista enlazada simple solo se puede hacer en una **dirección hacia adelante** (de la cabeza al último nodo).

**Ejemplo**: Imagina una cadena de personas en fila, donde cada persona le da la mano a la persona siguiente en la fila. Si quieres llegar al final de la fila, debes pasar por cada persona desde el principio.

------------------------
## Estructura para crear una lista Enlazada simple

Para crear una Lista enlazada simple se deben tener 3 Clases:
1. **Clase Nodo**
	-  La clase `Nodo` es una representación de cada elemento en la lista enlazada. Cada nodo contiene un valor y una referencia al siguiente nodo en la lista.
2. **Clase Lista**
	- La clase `Lista` maneja las operaciones de la lista enlazada, como insertar, eliminar y mostrar los Nodos. 
3. **Clase principal**
	- La clase principal contiene el método `main`, donde se instanciarán los objetos de la lista y se probarán sus métodos.

-----------------------------------
## Lenguajes para crear una lista enlazada simple:

### **Java**

#### 1. **Clase Nodo:**
```java title=Nodo
// Se crea la clase Nodo
Public class Nodo
{
	// Se crean las variables
	Private String Elemento;
	Private Nodo Next;

	// Se crean los metodos necesarios en la clase Nodo
	Public void setElem(String Variable) 
	{
		Elem = Variable;
	}

	Public String getElem()
	{
		return Elem
	}

	public void setnext(Nodo variable)
	{
		next = variable;
	} 
	
	public Nodo getnext() 
	{
		return next; 
	}
}
```

##### **Explicacion paso a paso:**

1. **Definición de la clase `Nodo`:**
	```
	Public class Nodo
	{
		
	}
	```
	
	- La clase `Nodo` es una plantilla para crear nodos individuales en una lista enlazada. Un nodo contiene un valor (Elem) y una referencia al siguiente nodo en la lista(Next).

2. **Atributos privados de la clase:**
	```
	// Se crean las variables
	private String Elem;
	private Nodo next;
	```
	
	- `Elem`: Es un atributo de tipo `String` que almacena el valor o dato del nodo.
	- `next`: Es una referencia de tipo `Nodo` que apunta al siguiente nodo en la lista enlazada. Si `next` es `null`, significa que este nodo es el último en la lista.

3. **Método `setElem(String variable)`:**
	```
	public void setElem(String variable) 
	{
		Elem = variable; 
	}
	```
	
	- Este método es un "setter" para el atributo `Elem`. Permite asignar un valor al atributo `Elem` del nodo. La variable `variable` es el valor que se desea almacenar en el nodo.

4. **Método `getElem()`:**
	```
	Public String getElem()
	{
		return Elem
	}
	```
	
	- Este método es un "getter" para el atributo `Elem`. Permite obtener el valor almacenado en `Elem`.

5. **Método `setnext(Nodo variable)`:**
	```
	public void setnext(Nodo variable)
	{
		next = variable;
	}
	```
	
	- Este método es un "setter" para el atributo `next`. Permite asignar una referencia a otro nodo que será el siguiente en la lista. La variable `variable` es una instancia de `Nodo` que se convertirá en el siguiente nodo.

6. **Método `getnext()`:**
	```
	public Nodo getnext() 
	{
		return next; 
	}
	```
	
	- Este método es un "getter" para el atributo `next`. Permite obtener la referencia al siguiente nodo en la lista.

#### 2. **Clase Lista:**
```java title=Lista
// Se crea la clase Lista
public class Lista
{
    private Nodo inicio;
    private Nodo fin;

    public Lista()
    {
        inicio = null;
        fin = null;
    }
    
    public void setInicio(Nodo variable)    
        inicio = variable;

    public Nodo getInicio()
        return inicio;

    public void setFin(Nodo variable)    
        fin = variable;

    public Nodo getFin()
        return fin;

    public void insertar(String Elem)
    {
        Nodo nuevo = new Nodo();
        nuevo.setElem(Elem);
    
        // lista vacía coloca el primer elemento
        if (inicio == null && fin == null) // lista vacía
        {
            inicio = nuevo;
            fin = nuevo;
        }
        else
        {
            fin.setnext(nuevo);
            fin = nuevo;
        }
    }

    public void mostrar()
    {
        if(inicio != null)
        {
            Nodo i = inicio;
            while(i != null)
            {
                System.out.println(i.getElem());
                i = i.getnext();
            }
        }
        else
        {
            System.err.println("La lista está vacía!\n");
        }
    }

    public void InsertarInicio(String Elem)
    {
        Nodo nuevo = new Nodo();
        nuevo.setElem(Elem);
        Nodo aux = inicio;
        inicio = nuevo;
        nuevo.setnext(aux);
    }

    public void Buscar(String Elem)
    {
        boolean estado = false;
        Nodo i = inicio;

        while(i != null)
        {
            if(Elem.equals(i.getElem()))
            {
                System.out.println("El elemento se encuentra en la lista.\n");
                i = null;
                estado = true; 
            }
            else
                i = i.getnext();
        }
        if (!estado)
            System.out.println("El elemento no se encuentra en la lista\n");
    }

    public void InsertarEnMedio(String Elem, String colado)
    {
        boolean estado = false;
        Nodo nuevo = new Nodo();
        nuevo.setElem(colado);
        Nodo i = inicio;
        Nodo ant = inicio;

        while(i != null && !estado)
        {
            if(Elem.equals(i.getElem()))
            {
                System.out.println("El elemento se encuentra en la lista.\n");
                estado = true; 

                if(i == inicio)
                {
                    InsertarInicio(colado);
                }
                else
                {
                    ant.setnext(nuevo);
                    nuevo.setnext(i);
                }
            }
            else
            {
                if(i != inicio)
                    ant = ant.getnext();
                i = i.getnext();
            }
        }

        if (!estado)
            System.out.println("El elemento no se encuentra en la lista\n");
    }

    public void Borrar(String Elem)
    {
        boolean estado = false;
        Nodo i = inicio;
        Nodo ant = inicio;

        while(i != null)
        {
            if(Elem.equals(i.getElem()))
            {
                if (i == inicio)
                {
                    inicio = inicio.getnext();
                    i.setnext(null);
                } 
                else
                {
                    if(i == fin)
                        fin = ant;
                    ant.setnext(i.getnext());
                    i.setnext(null);
                }

                System.out.println("El elemento fue borrado de la lista.\n");
                i = null;
                estado = true; 
            }
            else
            {
                if(i != inicio)
                    ant = ant.getnext();

                i = i.getnext();
            }
        }
        if (!estado)
            System.out.println("El elemento no se encuentra en la lista\n");
    }
}
```

##### **Explicacion paso a paso:**

1. **Atributos privados de la clase:**
	```
	private Nodo inicio;
    private Nodo fin;
	```
	
	- `inicio`: Una referencia al primer nodo de la lista enlazada.
	- `fin`: Una referencia al último nodo de la lista enlazada.

2. **Constructor de la clase `Lista`:**
	```
	public Lista()
    {
        inicio = null;
        fin = null;
    }
	```
	
	- El constructor inicializa la lista vacía, estableciendo tanto `inicio` como `fin` en `null`.

3. **Métodos `setInicio` y `getInicio`::**
	```
	public void setInicio(Nodo variable)  
		inicio = variable;  
	
	public Nodo getInicio()  
		return inicio; 
	```
	
	- Estos métodos son getters y setters para manejar el nodo inicial de la lista.

4. **Métodos `setFin` y `getFin`:**
	```
	public void setFin(Nodo variable)    
        fin = variable;

    public Nodo getFin()
        return fin;
	```
	
	- Estos métodos son getters y setters para manejar el nodo final de la lista.

5. **Método `insertar(String Elem)`:**
	```
	public void insertar(String Elem)
    {
        Nodo nuevo = new Nodo();
        nuevo.setElem(Elem);
    
        // lista vacía coloca el primer elemento
        if (inicio == null && fin == null) // lista vacía
        {
            inicio = nuevo;
            fin = nuevo;
        }
        else
        {
            fin.setnext(nuevo);
            fin = nuevo;
        }
    }
	```
	
	**Crear un nuevo nodo:**
	- `Nodo nuevo = new Nodo();` crea una instancia de un nuevo nodo.
	
	**Asignar un valor al nuevo nodo:**
	 - `nuevo.setElem(Elem);` asigna el valor proporcionado (`Elem`) al nodo recién creado utilizando el método `setElem` de la clase `Nodo`.
	
	**Verificar si la lista está vacía:**
	- `if (inicio == null && fin == null)` verifica si tanto `inicio` como `fin` son `null`, lo que indicaría que la lista está vacía.
	
	**Si la lista está vacía, el nuevo nodo se convierte en el inicio y fin:**
	- `inicio = nuevo;` y `fin = nuevo;` asignan el nuevo nodo tanto al inicio como al fin de la lista.
	
	**Si la lista no está vacía:**
	- `fin.setnext(nuevo);` establece el siguiente nodo del actual `fin` como el nuevo nodo.
	- `fin = nuevo;` actualiza el fin de la lista para que sea el nuevo nodo.

6. **Método `mostrar()`:**
	```
	public void mostrar()
    {
        if(inicio != null)
        {
            Nodo i = inicio;
            while(i != null)
            {
                System.out.println(i.getElem());
                i = i.getnext();
            }
        }
        else
        {
            System.out.println("La lista está vacía!\n");
        }
    }
	```
	
	**Verificar si la lista no está vacía:**
	- `if (inicio != null)` comprueba si el nodo de inicio no es `null`
	
	**Recorrer e imprimir cada nodo:**
	- - `Nodo i = inicio;` inicializa una variable `i` para recorrer la lista desde el inicio.
	- `while (i != null)` recorre la lista mientras el nodo actual no sea `null`.
	- `System.out.println(i.getElem());` imprime el valor almacenado en el nodo actual.
	- `i = i.getnext();` avanza al siguiente nodo en la lista.
	
	**Si la lista está vacía, imprimir un mensaje de error:**
	- `else { System.out.println("La lista está vacía!\n"); }` imprime un mensaje de error indicando que la lista está vacía.

7. **Método `InsertarInicio(String Elem)`:**
	```
	public void InsertarInicio(String Elem)
    {
        Nodo nuevo = new Nodo();
        nuevo.setElem(Elem);
        Nodo aux = inicio;
        inicio = nuevo;
        nuevo.setnext(aux);
    }
	```
	
	 **Crear un nuevo nodo:**
    - `Nodo nuevo = new Nodo();` crea una nueva instancia de `Nodo`.
    
	**Asignar un valor al nuevo nodo:**
    - `nuevo.setElem(Elem);` asigna el valor proporcionado (`Elem`) al nuevo nodo.
    
	**Almacenar el nodo actual de inicio en una variable auxiliar:**
    - `Nodo aux = inicio;` almacena el nodo actual de inicio en una variable `aux`.
    
	**Establecer el nuevo nodo como el inicio de la lista:**
    - `inicio = nuevo;` actualiza el inicio de la lista para que sea el nuevo nodo.
    
	**Conectar el nuevo nodo al antiguo inicio:**
    - `nuevo.setnext(aux);` establece el nodo siguiente del nuevo nodo como el nodo que anteriormente era el inicio.

8. **Método `Buscar(String Elem)`**
	```
	public void Buscar(String Elem)
    {
        boolean estado = false;
        Nodo i = inicio;

        while(i != null)
        {
            if(Elem.equals(i.getElem()))
            {
                System.out.println("El elemento se encuentra en la lista.\n");
                i = null;
                estado = true; 
            }
            else
                i = i.getnext();
        }
        if (!estado)
            System.out.println("El elemento no se encuentra en la lista\n");
    }
	```
	
	 **Inicializar una bandera para el estado de búsqueda:**
    - `boolean estado = false;` inicializa una bandera para indicar si el elemento fue encontrado.
    
	 **Recorrer la lista desde el inicio:**
    - `Nodo i = inicio;` inicializa una variable `i` para recorrer la lista desde el nodo de inicio.
    
	**Buscar el elemento en cada nodo:**
    - `while (i != null)` recorre la lista mientras el nodo actual no sea `null`.
    - `if (Elem.equals(i.getElem()))` compara el valor buscado (`Elem`) con el valor del nodo actual.
    - Si se encuentra el elemento, imprime un mensaje y termina la búsqueda.
    - Si no, avanza al siguiente nodo con `i = i.getnext();`.
    
    **Verificar el resultado de la búsqueda:**
    - `if (!estado)` comprueba si la bandera `estado` sigue siendo `false`, lo que indicaría que el elemento no se encontró, y se imprime un mensaje correspondiente.

9. **Método `InsertarEnMedio(String Elem, String colado)`:**
	```
	public void InsertarEnMedio(String Elem, String colado)
    {
        boolean estado = false;
        Nodo nuevo = new Nodo();
        nuevo.setElem(colado);
        Nodo i = inicio;
        Nodo ant = inicio;

        while(i != null && !estado)
        {
            if(Elem.equals(i.getElem()))
            {
                System.out.println("El elemento se encuentra en la lista.\n");
                estado = true; 

                if(i == inicio)
                {
                    InsertarInicio(colado);
                }
                else
                {
                    ant.setnext(nuevo);
                    nuevo.setnext(i);
                }
            }
            else
            {
                if(i != inicio)
                    ant = ant.getnext();
                i = i.getnext();
            }
        }

        if (!estado)
            System.out.println("El elemento no se encuentra en la lista\n");
    }
	```
	
	**Inicialización:**    
    - Se inicializan variables: `estado` en `false`, `nuevo` como un nuevo nodo con el valor `colado`, y dos referencias de nodos (`i` e `ant`) para recorrer la lista.
    
	**Búsqueda del nodo de referencia:**
    - Se recorre la lista como en el método `Buscar`, comparando cada nodo con `Elem`.
    - Si se encuentra el nodo con el valor `Elem`, se actualiza `estado` a `true` y se determina dónde insertar el nuevo nodo.
    
	**Inserción del nuevo nodo:**
    - Si el nodo con `Elem` es el `inicio`, se utiliza el método `InsertarInicio` para agregar `colado` al principio.
    - Si no, se inserta `nuevo` entre `ant` e `i`, actualizando las referencias correspondientes (`ant.setnext(nuevo)` y `nuevo.setnext(i)`).
    
	**Resultado de la búsqueda:**
    - Si el nodo con `Elem` no se encuentra en la lista, se imprime un mensaje indicando que el elemento no está en la lista.

10. **Método `Borrar(String Elem)`:**
	```
	public void Borrar(String Elem)
    {
        boolean estado = false;
        Nodo i = inicio;
        Nodo ant = inicio;

        while(i != null)
        {
            if(Elem.equals(i.getElem()))
            {
                if (i == inicio)
                {
                    inicio = inicio.getnext();
                    i.setnext(null);
                } 
                else
                {
                    if(i == fin)
                        fin = ant;
                    ant.setnext(i.getnext());
                    i.setnext(null);
                }

                System.out.println("El elemento fue borrado de la lista.\n");
                i = null;
                estado = true; 
            }
            else
            {
                if(i != inicio)
                    ant = ant.getnext();
                i = i.getnext();
            }
        }
        if (!estado)
            System.out.println("El elemento no se encuentra en la lista\n");
    }
	```
	
	1. **Inicialización de Variables:**
	- El método comienza inicializando una variable booleana `estado` en `false`. Esta variable se utiliza para verificar si se encontró el nodo que se desea eliminar.
	- También inicializa dos referencias de tipo `Nodo`, `i` y `ant`.
	    - `i` se utiliza para recorrer la lista y comienza apuntando al nodo `inicio` (el primer nodo de la lista).
	    - `ant` (abreviatura de "anterior") también comienza apuntando al nodo `inicio` y se utiliza para mantener la referencia al nodo anterior a `i` durante el recorrido de la lista.
	    
	2. **Recorrido de la Lista:**
	- El método utiliza un bucle `while` para recorrer la lista desde el `inicio` hasta que encuentra el nodo que se desea eliminar o hasta que llega al final de la lista (`i` es `null`).
	- Durante cada iteración del bucle, el método verifica si el valor almacenado en el nodo actual (`i.getElem()`) es igual al valor que se desea eliminar (`Elem`).
	
	3. **Verificación de coincidencia del nodo:**
	- Si se encuentra un nodo cuyo valor coincide con `Elem`, el método procede a eliminar ese nodo de la lista.
	- Existen dos casos principales para manejar la eliminación de un nodo:
	    - El nodo a eliminar es el primero en la lista (`inicio`).
	    - El nodo a eliminar es cualquier otro nodo (puede ser intermedio o el último nodo).
	
	4. **Eliminación del nodo si es el primero (`inicio`):**
	- Si el nodo a eliminar es el primer nodo de la lista (`i == inicio`), se actualiza el puntero `inicio` para que apunte al segundo nodo de la lista (`inicio.getnext()`).
	- Esto elimina efectivamente el primer nodo de la lista.
	- Luego, el método desconecta el nodo eliminado estableciendo su referencia `next` a `null`. Esto es importante para liberar la referencia al siguiente nodo y evitar posibles problemas de referencia.
	
	5. **Eliminación del nodo si no es el primero:**
	- Si el nodo a eliminar no es el primer nodo de la lista, hay dos sub-casos a considerar:
	    - **Si el nodo es el último (`fin`):**
        - Se actualiza el puntero `fin` para que apunte al nodo anterior (`ant`), ya que el nodo actual `i` será eliminado.
    - Si el nodo es intermedio:
        - Se actualiza la referencia `next` del nodo anterior (`ant`) para que apunte al nodo siguiente del actual (`i.getnext()`). Esto efectivamente "salta" el nodo actual `i`, eliminándolo de la lista.
	- Finalmente, el método desconecta el nodo eliminado (`i`) estableciendo su referencia `next` a `null`.
	
	6. **Finalización de la eliminación:**
	- Una vez que el nodo se elimina, el método establece `i` en `null` para salir del bucle `while`.
	- También actualiza la variable `estado` a `true` para indicar que el nodo fue encontrado y eliminado correctamente.
	- Se imprime un mensaje para informar al usuario que el nodo ha sido eliminado.
	
	7. **Si no se encuentra el nodo:**
	- Si el bucle `while` termina sin haber encontrado el nodo (`estado` sigue siendo `false`), significa que no existe un nodo con el valor `Elem` en la lista.
	- En este caso, se imprime un mensaje indicando que el elemento no se encuentra en la lista.

#### 3. **Clase Principal:**
```
//Librerias
import java.util.Scanner;

  
//se crea clase Main
public class EJ5 {

    public static void main (String[] args)

    {

        System.out.println("||--------------------Ejercicio 5---------------------||\n");

        Scanner leer = new  Scanner(System.in);

        ListaEj5 grupo = new ListaEj5();

        String nombre;

        String colado;

        int opc = 0;

        do{

            menu();

            System.err.println("Elige: ");

            opc = Integer.parseInt(leer.nextLine());

            System.out.println("\n||-------------------------------------------------||\n");

            switch (opc)

            {

                case 1:

                System.out.print("Nombre para agragar: ");

                nombre = leer.nextLine();

                grupo.insertar(nombre);

                System.out.println("\n");

                break;

                case 2:

                System.err.println("Lista del grupo:\n");

                grupo.mostrar();

                System.out.println("\n");

                break;

                case 3:

                System.out.print("Nombre para insertar al inicio: ");

                nombre = leer.nextLine();

                grupo.InsertarInicio(nombre);

                System.out.println("\n");

                break;

                case 4:

                System.out.print("Nombre para buscar: ");

                nombre = leer.nextLine();

                System.out.println("\n");

                grupo.Buscar(nombre);

                break;

                case 5:

                System.out.println("Nombre para insertar: ");

                colado = leer.nextLine();

                System.out.println("Despues de quien: ");

                nombre = leer.nextLine();

                grupo.InsertarEnMedio(nombre, colado);

                break;

                case 6:

                    System.out.println("nombre a borrar: ");

                    nombre = leer.nextLine();

                    grupo.Borrar(nombre);

                break;
  
                case 9:

                System.out.println("Saliendo....\n");

                break;
            }

        }while(opc != 9);

        //fin del main
    }
    public static void menu()

    {
        System.out.println("||-------------------Listas simples-------------------||\n");

        System.out.println("1 -> Insertar");

        System.out.println("2 -> Mostrar");

        System.out.println("3 -> Insertar inicio");

        System.out.println("4 -> Bucar");

        System.out.println("5 -> Insertar dentro de lista");

        System.out.println("6 -> Borrar");

        System.out.println("9 -> Salir");

        System.out.println("\n||-------------------------------------------------||\n");
    }
}
```

##### **Explicacion paso a paso:**

1. **Importación y Declaración de la Clase:**
	```
	import java.util.Scanner;
	```
	
	- importa la clase `Scanner` de `java.util` para permitir la entrada del usuario desde la consola.

2. **Método Principal `main`:**
	```
	public static void main(String[] args) 
	{
	 // Configuración inicial 
	}
	```
	
	- El método `main` es el punto de entrada de la aplicación. Configura el entorno para la interacción con el usuario y la lista enlazada.

3. **Configuración Inicial:**
	```
	Scanner leer = new Scanner(System.in);
	ListaEj5 grupo = new ListaEj5();
	String nombre;
	String colado;
	int opc = 0;
	```
	
	- Se crea una instancia de `Scanner` llamada `leer` para leer la entrada del usuario desde la consola.
	- Se crea una instancia de `ListaEj5` llamada `grupo` que representa la lista enlazada sobre la que se realizarán las operaciones.
	- Se declaran dos variables de tipo `String`, `nombre` y `colado`, para almacenar los nombres introducidos por el usuario.
	- La variable `opc` se inicializa en `0` y se utilizará para manejar la selección del usuario en el menú.**

4. **Bucle `do-while` para el Menú de Opciones:**
	```
	do {
    // Mostrar menú y manejar la entrada del usuario
	} while(opc != 9);
	```
	
	- Se utiliza un bucle `do-while` para mostrar el menú repetidamente hasta que el usuario elija la opción `9` para salir.
	- Dentro del bucle, se llama al método `menu()` para mostrar las opciones disponibles al usuario.

5. **Mostrar el Menú:**
	```
	menu();
	```
	
	- El método `menu()` se llama para imprimir el menú de opciones en la consola. Este método simplemente muestra las opciones numeradas para que el usuario elija una acción.

6. **Lectura de la Elección del Usuario:**
	```
	System.err.println("Elige: ");
	opc = Integer.parseInt(leer.nextLine());
	```
	
	- Se solicita al usuario que elija una opción introduciendo un número correspondiente a la acción que desea realizar.
	- La entrada del usuario se lee como una cadena y se convierte a un entero utilizando `Integer.parseInt()`.

7. **Estructura `switch` para Manejar las Opciones del Usuario:**
	```
	switch (opc) 
	{
    case 1: // Insertar al final
    case 2: // Mostrar lista
    case 3: // Insertar al inicio
    case 4: // Buscar
    case 5: // Insertar en medio
    case 6: // Borrar
    case 9: // Salir
	}
	```
	
	 - Dependiendo del valor de `opc`, se ejecuta un caso diferente en la estructura `switch`.
	- Cada caso representa una acción que el usuario puede realizar en la lista enlazada.

8. **Opción 1 - Insertar al Final:**
	```
	case 1:
	    System.out.print("Nombre para agragar: ");
	    nombre = leer.nextLine();
	    grupo.insertar(nombre);
	    System.out.println("\n");
    break;
	```
	
	 - El usuario introduce un nombre que se quiere agregar al final de la lista.
	- Este nombre se lee y se pasa al método `insertar` de la clase `Lista`, que agrega el nombre al final de la lista

9. **Opción 2 - Mostrar la Lista:**
	```
	case 2:
	    System.err.println("Lista del grupo:\n");
	    grupo.mostrar();
	    System.out.println("\n");
    break;
	```
	
	- Llama al método `mostrar` de `Lista` para imprimir todos los elementos de la lista.
	- Si la lista está vacía, el método `mostrar` imprimirá un mensaje de error indicando que la lista está vacía.

10. **Opción 3 - Insertar al Inicio:**
	```
	case 3:
	    System.out.print("Nombre para insertar al inicio: ");
	    nombre = leer.nextLine();
	    grupo.InsertarInicio(nombre);
	    System.out.println("\n");
    break;
	```
	
	- El usuario introduce un nombre que desea insertar al inicio de la lista.
	- Este nombre se lee y se pasa al método `InsertarInicio` de `Lista`, que inserta el nombre al principio de la lista.

11. **Opción 4 - Buscar un Elemento:**
	```
	case 4:
    System.out.print("Nombre para buscar: ");
    nombre = leer.nextLine();
    System.out.println("\n");
    grupo.Buscar(nombre);
    break;
	```
	
	- El usuario introduce un nombre para buscar en la lista.
	- Este nombre se lee y se pasa al método `Buscar` de `Lista`, que verifica si el nombre está presente en la lista e imprime el resultado.

12. **Opción 5 - Insertar en Medio de la Lista:**
	```
	case 5:
    System.out.println("Nombre para insertar: ");
    colado = leer.nextLine();
    System.out.println("Despues de quien: ");
    nombre = leer.nextLine();
    grupo.InsertarEnMedio(nombre, colado);
    break;
	```
	
	 - El usuario introduce dos nombres: el primero (`colado`) es el nuevo nombre que se desea insertar, y el segundo (`nombre`) es el nombre del nodo despues del cual se quiere insertar el nuevo nodo.
	- Ambos nombres se leen y se pasan al método `InsertarEnMedio` de `Lista`, que inserta el nuevo nodo antes del nodo especificado.

13. **Opción 6 - Eliminar un Nodo:**
	```
	case 6:
    System.out.println("nombre a borrar: ");
    nombre = leer.nextLine();
    grupo.Borrar(nombre);
    break;
	```
	
	 - El usuario introduce el nombre del nodo que desea eliminar de la lista.
	- Este nombre se lee y se pasa al método `Borrar` de `Lista`, que elimina el nodo que contiene el nombre especificado.

14. **Opción 9 - Salir del Programa:**
	```
	case 9: 
    System.out.println("Saliendo....\n");
    break;
	```
	
	- Esta opción simplemente imprime un mensaje de salida y termina el bucle `do-while`, cerrando así el programa.

# **Python**

## 1. Clase Nodo:
```python
# Clase Nodo
class Nodo:
    def __init__(self, elemento):
        # Inicializa el nodo con el dato y el siguiente nodo en None
        self.elemento = elemento
        self.next = None
    
    def set_elem(self, elemento):
        self.elemento = elemento

    def get_elem(self):
        return self.elemento

    def set_next(self, nodo):
        self.next = nodo

    def get_next(self):
        return self.next
```

### Explicación paso a paso:

1. **Definición de la clase `Nodo`:**
   - En **Python**, definimos la clase `Nodo` para representar cada elemento de la lista enlazada simple.

2. **Constructor de la clase:**
   - El constructor inicializa dos atributos:
     - `elemento`: que almacena el valor o dato del nodo.
     - `next`: que inicialmente es `None`, indicando que no hay un nodo siguiente aún.

3. **Método `set_elem(elemento)`:**
   - Este método asigna un valor al atributo `elemento`.

4. **Método `get_elem()`:**
   - Devuelve el valor almacenado en el nodo.

5. **Método `set_next(nodo)`:**
   - Asigna al atributo `next` el nodo que será el siguiente en la lista.

6. **Método `get_next()`:**
   - Retorna la referencia al siguiente nodo.

---

## 2. Clase Lista:
```python
# Clase Lista
class Lista:
    def __init__(self):
        # Inicializa la lista vacía
        self.inicio = None
        self.fin = None

    def insertar(self, elem):
        nuevo = Nodo(elem)
        
        # Verificar si la lista está vacía
        if self.inicio is None and self.fin is None:
            self.inicio = nuevo
            self.fin = nuevo
        else:
            self.fin.set_next(nuevo)
            self.fin = nuevo

    def mostrar(self):
        if self.inicio is not None:
            i = self.inicio
            while i is not None:
                print(i.get_elem())
                i = i.get_next()
        else:
            print("La lista está vacía!
")

    def insertar_inicio(self, elem):
        nuevo = Nodo(elem)
        aux = self.inicio
        self.inicio = nuevo
        nuevo.set_next(aux)

    def buscar(self, elem):
        estado = False
        i = self.inicio

        while i is not None:
            if elem == i.get_elem():
                print("El elemento se encuentra en la lista.
")
                estado = True
                break
            i = i.get_next()

        if not estado:
            print("El elemento no se encuentra en la lista
")

    def insertar_en_medio(self, elem, colado):
        estado = False
        nuevo = Nodo(colado)
        i = self.inicio
        ant = self.inicio

        while i is not None and not estado:
            if elem == i.get_elem():
                estado = True
                if i == self.inicio:
                    self.insertar_inicio(colado)
                else:
                    ant.set_next(nuevo)
                    nuevo.set_next(i)
            else:
                if i != self.inicio:
                    ant = ant.get_next()
                i = i.get_next()

        if not estado:
            print("El elemento no se encuentra en la lista
")

    def borrar(self, elem):
        estado = False
        i = self.inicio
        ant = self.inicio

        while i is not None:
            if elem == i.get_elem():
                if i == self.inicio:
                    self.inicio = self.inicio.get_next()
                else:
                    if i == self.fin:
                        self.fin = ant
                    ant.set_next(i.get_next())
                estado = True
                print("El elemento fue borrado de la lista.
")
                break
            else:
                if i != self.inicio:
                    ant = ant.get_next()
                i = i.get_next()

        if not estado:
            print("El elemento no se encuentra en la lista
")
```

### Explicación paso a paso:

1. **Atributos `inicio` y `fin`:**
   - El constructor inicializa dos referencias:
     - `inicio`: para apuntar al primer nodo.
     - `fin`: para apuntar al último nodo.

2. **Método `insertar(elem)`:**
   - Inserta un nuevo nodo al final de la lista.
   - Si la lista está vacía, el nuevo nodo se convierte en el inicio y fin.
   - Si no, el nuevo nodo se conecta al último nodo y se actualiza `fin`.

3. **Método `mostrar()`:**
   - Recorre la lista desde el inicio e imprime los valores de cada nodo.

4. **Método `insertar_inicio(elem)`:**
   - Inserta un nuevo nodo al inicio de la lista.

5. **Método `buscar(elem)`:**
   - Busca un nodo con un valor específico en la lista.

6. **Método `insertar_en_medio(elem, colado)`:**
   - Inserta un nuevo nodo después de un nodo con un valor específico.

7. **Método `borrar(elem)`:**
   - Elimina un nodo con un valor específico de la lista.

---

## 3. Clase Principal:
```python
# Clase Principal
def menu():
    print("||-------------------Listas simples-------------------||
")
    print("1 -> Insertar")
    print("2 -> Mostrar")
    print("3 -> Insertar inicio")
    print("4 -> Buscar")
    print("5 -> Insertar dentro de lista")
    print("6 -> Borrar")
    print("9 -> Salir")
    print("
||-------------------------------------------------||
")

def main():
    print("||--------------------Ejercicio---------------------||
")
    
    grupo = Lista()
    opc = 0
    
    while opc != 9:
        menu()
        opc = int(input("Elige: "))
        print("
||-------------------------------------------------||
")
        
        if opc == 1:
            nombre = input("Nombre para agregar: ")
            grupo.insertar(nombre)
            print("
")
        elif opc == 2:
            print("Lista del grupo:
")
            grupo.mostrar()
            print("
")
        elif opc == 3:
            nombre = input("Nombre para insertar al inicio: ")
            grupo.insertar_inicio(nombre)
            print("
")
        elif opc == 4:
            nombre = input("Nombre para buscar: ")
            grupo.buscar(nombre)
            print("
")
        elif opc == 5:
            colado = input("Nombre para insertar: ")
            nombre = input("Despues de quien: ")
            grupo.insertar_en_medio(nombre, colado)
            print("
")
        elif opc == 6:
            nombre = input("Nombre a borrar: ")
            grupo.borrar(nombre)
            print("
")
        elif opc == 9:
            print("Saliendo...
")

if __name__ == "__main__":
    main()
```

### Explicación paso a paso de la clase principal:

1. **Función `menu()`**:
   - Imprime el menú de opciones para el usuario. Ofrece las operaciones básicas de una lista enlazada, como insertar, mostrar, buscar y borrar nodos.

2. **Función `main()`**:
   - Contiene el ciclo principal del programa, donde el usuario puede interactuar con la lista enlazada a través del menú.
   - Dependiendo de la opción seleccionada por el usuario, se ejecutan las funciones correspondientes para manejar la lista.
