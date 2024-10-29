public class Lista_DobleSE
{
    private NodoSE inicio;
    private NodoSE fin;
    
    //valores iniciales
    public Lista_DobleSE()
    {
        inicio = null;
        fin = null;
    }

    public NodoSE getInicio() {
        return inicio;
    }

    public void setInicio(NodoSE inicio) 
    {
        this.inicio = inicio;
    }

    public NodoSE getFin() 
    {
        return fin;
    }

    public void setFin(NodoSE fin) 
    {
        this.fin = fin;
    }

    public void Reuniciar()
    {
        inicio = fin = null;
    }

    //Metodo para insertar
    public void Instertar(int Elem)
    {
        //Se crea un nuevo NodoSE y se le asigna el valor de Elem
        NodoSE nuevo = new NodoSE();
        nuevo.setElem(Elem);

        // Lisat vacia
        if(inicio == null && fin == null)
        {
            inicio = nuevo;
            fin = nuevo;
        }
        else //NO esta vacio
        {
            NodoSE i = inicio;
            while(i.getnext() != null) 
            {
                i = i.getnext();
            }
            i.setnext(nuevo);
            nuevo.setBack(i);
            fin = nuevo;
        }
    }

        //Metodo oara borrar
        public void Borrar() // borra inicio
        {
            if(inicio == fin) //Vacio o con un elemento
                inicio = fin = null;

            else //mas de un elemento
            {
                NodoSE aux = inicio.getnext();
                inicio.setnext(null);
                inicio = aux;
            }
        }

        public void BorraUltimo()
        {
            if(inicio == fin )
                inicio = fin = null;
            else
            {
                fin = fin.getBack();
                fin.getnext().setBack(null);
                fin.setnext(null);
            }
        }

        public void Mostrar()
        {
            NodoSE i = inicio;
            while (i != null)
            {
                System.out.println(i.getElem());
                i = i.getnext();
            }
        }

        public void Buscar(int Elem)
        {
    
            boolean estado = false;
            NodoSE i = inicio;
    
            while( i != null)
            {
                if(Elem == i.getElem())
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



