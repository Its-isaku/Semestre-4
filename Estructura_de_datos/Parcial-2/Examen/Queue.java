
import java.util.Random;

//? se importa la libreria random para generar los horarios aleatorios y el tipo de consulta

public class Queue 
{
    private NodoExamen inicio;
    private NodoExamen fin;
    private Random random = new Random(); // se crea un objeto de la clase Random
    
    //valores iniciales
    public Queue()
    {
        inicio = null;
        fin = null;
    }

    // Getters y setters
    public NodoExamen getInicio() { return inicio; }
    public void setInicio(NodoExamen inicio) { this.inicio = inicio; }

    public NodoExamen getFin() { return fin; }
    public void setFin(NodoExamen fin) { this.fin = fin; }

    public Random getRandom() { return random; }
    public void setRandom(Random random) { this.random = random; }

    //Metodo para insertar
    public void Instertar(String Elem)
    {
        
        NodoExamen nuevo = new NodoExamen(); //Se crea un nuevo NodoExamen y se le asigna el valor de Elem
        nuevo.setElem(Elem); // se asigna el valor de Elem al nuevo nodo

        // se asignan aleatoriamente los valores de TipoConsulta
        String tipoConsulta = random.nextBoolean()? "Consulta General" : "Consulta Especializada"; 
        nuevo.setTipoConsulta(tipoConsulta);

        // se asignan aleatoriamente los valores de TiempoConsulta
        int tiempoConsulta;
        if(tipoConsulta.equals("Consulta General"))
            tiempoConsulta = random.nextInt(6) + 5;
        else 
            tiempoConsulta = random.nextInt(21) + 10;
        nuevo.setTiempoConsulta(tiempoConsulta);


        // Agregar a la cola
        if (inicio == null && fin == null) // esta vacio
        {
            inicio = nuevo;
            fin = nuevo;
        } 
        else // NO esta vacio
        {
            fin.setNext(nuevo);
            fin = nuevo;
        }
    }

        //Metodo oara borrar
        public void Borrar()
        {
            if(inicio == fin) //Vacio o con un elemento
                inicio = fin = null;

            else //mas de un elemento
            {
                NodoExamen aux = inicio.getNext();
                inicio.setNext(null);
                inicio = aux;
            }
        }

        public void Mostrar()
        {
            NodoExamen i = inicio;
            while (i != null)
            {
                System.out.println(i.getElem());
                i = i.getNext();
            }
        }

        public void Buscar(String Elem)
        {
    
            boolean estado = false;
            NodoExamen i = inicio;
    
            while( i != null)
            {
                if(Elem.equals(i.getElem()))
                {
                    System.out.println("El elemento se encuentra en la lista.\n");
                    i = null;
                    estado = true; 
                }
                else
                {
                    i = i.getNext();
                }
            }
            if (estado == false)
                System.out.println("El elemento no se esncuentra en la lista\n");
            
        }
    }



