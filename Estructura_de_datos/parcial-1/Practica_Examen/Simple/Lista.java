public class Lista 
{
    // Atributos Privados de la clase
    private Nodo inicio;
    private Nodo fin;

    // Metodo constructor
    public Lista()
    {
        inicio = null;
        fin = null;
    }

    //Metodos para alojar Inicio y Fin
    public void setInicio(Nodo valor)
    {
        inicio = valor;
    }

    public Nodo getInicio()
    {
        return inicio;
    }

    public void setFin(Nodo valor)
    {
        fin = valor;
    }

    public Nodo getFin()
    {
        return fin;
    }

    public void Insertar(String Dato)
    {
        // se crea un nuevo Nodo
        Nodo nuevo = new Nodo();
        nuevo.setDato(Dato);

        // Si la lista estavacia se coloca el primer elemento
        if(inicio == null && fin == null) // Lista vacia
        {
            inicio = nuevo;
            fin = nuevo;
        }
        else // Lista no esta vacia
        {
            fin.setNext(nuevo);
            fin = nuevo;
        }
    }

    public void mostrar()
    {
        if(inicio != null) // Lista no esta vacia
        {
            Nodo i = inicio;
            while(i !=null)
            {
                System.out.println(i.getDato());
                i = i.getNext();
            }
        }
        else // Lista  esta vacia
            System.out.println("Lista vacia!");
    }

    public void InsertarInicio(String Dato)
    {
        Nodo nuevo = new Nodo();
        nuevo.setDato(Dato);
        Nodo aux = inicio;
        inicio = nuevo;
        nuevo.setNext(aux);
    }

    public void Buscar(String Dato)
    {
        boolean estado = false;
        Nodo i = inicio;

        while(i != null)
        {
            if(Dato.equals(i.getDato()))
            {
                System.out.println("Elemento encontrado!");
                i = null;
                estado = true;
            }
            else 
                i = i.getNext();
        }
        if(!estado)
            System.out.println("Elemento no encontrado!");
    }

    public void  InsertarEnMedio(String Dato, String Colado)
    {
        boolean estado = false;
        Nodo nuevo = new Nodo();
        nuevo.setDato(Colado);
        Nodo i = inicio;
        Nodo ant = inicio;

        while(i != null && !estado)
        {
            if(Dato.equals(i.getDato()))
            {
                System.out.println("El elemento se encontro!");
                estado = true;
                if(i == inicio)
                    InsertarInicio(Colado);
                else 
                {
                    ant.setNext(nuevo);
                    nuevo.setNext(i);
                }
            }
            else
            {
                if(i != inicio)
                    ant = ant.getNext();
                i = i.getNext();
            }
        }
        if(!estado)
            System.out.println("El elemento no se encuentra en la lista!\n");
    }

    public void Borrar(String Dato)
    {
        boolean estado = false;
        Nodo i = inicio;
        Nodo ant = inicio;

        while(i != null)
        {

            if(Dato.equals(i.getDato()))
            {
                if(i == inicio)
                {
                    inicio = inicio.getNext();
                    i.setNext(null);
                }
                else 
                {
                    if(i == fin)
                        fin = ant;
                    ant.setNext(i.getNext());
                    i.setNext(null);
                }
                System.out.println("el elemento fue borrado de la lista!");
                i = null;
                estado = true;
            }
            else 
            {
                if(i != inicio)
                    ant  = ant.getNext();
                i = i.getNext();
            }
        }
        if(!estado)
            System.out.println("El elemento no se encuentra en la lista!");
    }

}
