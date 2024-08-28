public class ListaEj5
{
    private Nodo inicio;
    private Nodo fin;

    //valores iniciales
    public ListaEj5()
    {
        inicio = null;
        fin = null;
    }
    public void setInicio(Nodo variable)
    {    
        inicio = variable;
    }

    public Nodo getInicio()
    {
        return inicio;
    }
    public void setFin(Nodo variable)
    {    
        fin = variable;
    }

    public Nodo getFin()
    {
        return fin;
    }

    public void direcciones()
    {
        System.out.println("inicio: " + inicio);
        System.out.println("fin: " + fin);
    }

    public void insertar(String Elem)
    {
        //System.out.println("elemento recibido: " + elem);
        Nodo nuevo = new Nodo();
        nuevo.setElem(Elem);
    
        //lisat vacia coloca el primer elemento
        if (inicio == null && fin == null)// lista vacia
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
            System.err.println("La lisat esta vacia!\n");
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

    public void InsertarEnMedio(String Elem, String colado)
    {
        
        boolean estado = false;
        Nodo nuevo =  new Nodo();
        nuevo.setElem(colado);
        Nodo i = inicio;
        Nodo ant = inicio;

        while(i != null && estado == false)
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

        if (estado == false)
            System.out.println("El elemento no se esncuentra en la lista\n");
    }

    public void Borrar(String Elem)
    {
        boolean estado = false;
        Nodo i = inicio;
        Nodo ant = inicio;

        while( i != null)
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
        if (estado == false)
            System.out.println("El elemento no se esncuentra en la lista\n");
    }
}
