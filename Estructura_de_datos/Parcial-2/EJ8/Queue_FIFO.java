public class Queue_FIFO 
{
    private Nodo inicio;
    private Nodo fin;
    
    //valores iniciales
    public Queue_FIFO()
    {
        inicio = null;
        fin = null;
    }

    //Metodo para insertar
    public void Instertar(String Elem)
    {
        //Se crea un nuevo Nodo y se le asigna el valor de Elem
        Nodo nuevo = new Nodo();
        nuevo.setElem(Elem);

        // Lisat vacia
        if(inicio == null && fin == null)
        {
            inicio = nuevo;
            fin = nuevo;
        }
        else //NO esta vacio
        {
            Nodo i = inicio;
            while(i.getnext() != null)
            {
                i = i.getnext();
            }
            i.setnext(nuevo);
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
                Nodo aux = inicio.getnext();
                inicio.setnext(null);
                inicio = aux;
            }
        }

        public void Mostrar()
        {
            Nodo i = inicio;
            while (i != null)
            {
                System.out.println(i.getElem());
                i = i.getnext();
            }
        }

        public void Buscar(String Elem)
        {
    
            boolean estado = false;
            Nodo i = inicio;
    
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
                    i = i.getnext();
                }
            }
            if (estado == false)
                System.out.println("El elemento no se esncuentra en la lista\n");
            
        }
    }



