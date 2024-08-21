public class Lista {
    private Nodo inicio;
    private Nodo fin;

    //valores iniciales
    public Lista()
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

        Nodo i = inicio;

        while( i != null)
        {
            if(Elem.equals(i.getElem()))
            {
                System.out.println("El elemento se encuentra en la lista.");
                i = null;
            }
            else
            {
                i = i.getnext();
            }
        }
    }
}


/*

    Tarea :
    -Terminar opcion 4
    - hay que guardar la hora en la que un nombre es introducido a la lista ( debes agregar nueva variiable de tiempo al nodo || fecha y hora)
    - y mostrarla al mostrar la lista
    - sacar la diferencia de tiempos al meter a alguien en medio o al principio

 */
