

public class ListaDoble 
{
    private Nodo inicio;
    private Nodo fin;

    public ListaDoble()
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

    public boolean Vacio()
    {
        if(inicio == null && fin ==  null)
        {
            return  true;
        }
        else
        {
            return false;
        }
    }

    public void Insertar(String Dato)
    {
        Nodo nuevo = new Nodo();
        nuevo.setDato(Dato);

        if(inicio == null) // Si lista esta vacia
        {
            inicio = nuevo;
            fin = nuevo;
        }
        else // Si lista no esta vacia
        {
            Nodo i = inicio;
            while(i.getNext() != null)
            {
                i = i.getNext();
            }
            i.setNext(nuevo);
            nuevo.setBack(i);
            fin = nuevo;
        }
    }

    public void mostrar()
    {
        if(inicio != null)
        {
            Nodo i = inicio;
            while( i !=  null)
            {
                System.out.println(i.getDato());
                i = i.getNext();
            }
        }
    }

    public void InsertarInicio(String Dato)
    {
        Nodo nuevo = new Nodo();
        nuevo.setDato(Dato);
        Nodo aux = inicio;
        inicio = nuevo;
        nuevo.setNext(aux);
        aux.setBack(inicio);
    }

    public boolean Buscar(String Dato)
    {
        boolean estado = false;
        Nodo i = inicio;

        while(i != null)
        {
            if(Dato.equals(i.getDato()))
            {
                estado = true;
                break;
            }
            i = i.getNext();
        }
        return estado;
    }

    public void InsertarEnMedio(String Dato, int pos)
    {
        Nodo nuevo = new Nodo();
        nuevo.setDato(Dato);

        if(inicio == null)// si lista esta vacia
        {
            inicio = nuevo;
            fin = nuevo;   
        }
        else
        {
            Nodo i = inicio;
            int contador = 1;

            // se recorre la  lista hasta encontrar la posicion deseada
            while(i != null && contador < pos) 
            {
                i = i.getNext();
                contador++;
            }

            // Insertar el nodo en la posicion
            if(i != null)
            {
                nuevo.setNext(i.getNext());
                nuevo.setBack(i);
                if(i.getNext() != null)
                {
                    i.getNext().setBack(nuevo);
                }
                i.setNext(nuevo);

                if(i == fin)
                {
                    fin = nuevo;
                }
            }
        }
    }

    public boolean Borrar(String Dato)
    {
        Nodo i = inicio;
        boolean estado = false;

        while(i != null)
        {
            if(Dato.equals(i.getDato()))
            {
                if(i == inicio)// si i esta en inicio borra el primer Nodo
                {
                    inicio = inicio.getNext();
                    if(inicio != null)
                    {
                        inicio.setBack(null);
                    }
                }
                else if(i == fin)// si i esta en fin se borra el ultimo Nodo
                {
                    fin = fin.getback();
                    if(fin != null)
                    {
                        fin.setNext(null);
                    }
                }
                else // si i esta n alguna posicion especifica
                {
                    i.getNext().setBack(i.getback());
                    i.getback().setNext(i.getNext());
                }

                // limpia los punteros del nodo eliminado
                i.setNext(null);
                i.setBack(null);
                estado = true;
                break;
            }
            i = i.getNext();
        }
        return estado;
    }

    public void MoostrarInverso()
    {
        if(inicio != null)
        {
            Nodo i = inicio;
            while(i !=  null)
            {
                System.out.println(i.getDato());
                i = i.getback();
            }
        }
    }
}
