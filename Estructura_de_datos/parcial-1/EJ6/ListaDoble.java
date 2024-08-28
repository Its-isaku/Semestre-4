public class ListaDoble
{
    private NodoEJ6 inicio;
    private NodoEJ6 fin;

    //valores iniciales
    public ListaDoble()
    {
        inicio = null;
        fin = null;
    }
    public void setInicio(NodoEJ6 variable)
    {    
        inicio = variable;
    }

    public NodoEJ6 getInicio()
    {
        return inicio;
    }
    public void setFin(NodoEJ6 variable)
    {    
        fin = variable;
    }

    public NodoEJ6 getFin()
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
        NodoEJ6 nuevo = new NodoEJ6();
        nuevo.setElem(Elem);
    
        //lisat vacia coloca el primer elemento
        if (inicio == null)// lista vacia
        {
            inicio = nuevo;
            fin = null;
        }
        else
        {
            NodoEJ6 i = inicio;
            while(i.getnext()!= null)
            {
                i = i.getnext();
            }
            i.setnext(nuevo);
            nuevo.setback(i);
            fin = nuevo;
        }
    }

    public void mostrar()
    {
        if(inicio != null)
        {
            NodoEJ6 i = inicio;
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
        NodoEJ6 nuevo = new NodoEJ6();
        nuevo.setElem(Elem);
        NodoEJ6 aux = inicio;
        inicio = nuevo;
        nuevo.setnext(aux);
    }

    public void Buscar(String Elem)
    {

        boolean estado = false;
        NodoEJ6 i = inicio;

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
        NodoEJ6 nuevo =  new NodoEJ6();
        nuevo.setElem(colado);
        NodoEJ6 i = inicio;
        NodoEJ6 ant = inicio;

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
        NodoEJ6 i = inicio;
        NodoEJ6 ant = inicio;

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
