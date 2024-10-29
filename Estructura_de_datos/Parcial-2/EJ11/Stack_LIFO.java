public class Stack_LIFO
{
    private NodoStack Cabeza=null;
    private NodoStack fin=null;

    public Stack_LIFO()
    {
        Cabeza = null;
        fin = null;
    }

    public NodoStack getCabeza() { return Cabeza; }
    public void setCabeza(NodoStack cabeza) { Cabeza = cabeza; }

    public NodoStack getFin() { return fin; }
    public void setFin(NodoStack fin) { this.fin = fin; }

    public void insertar(String Elem)
    {
        NodoStack Nuevo = new NodoStack(); 
        Nuevo.setElem(Elem);
        if(Cabeza==null && Cabeza==fin)
        {
            Cabeza=Nuevo;
            fin=Nuevo;
        }
        else
        {
            Cabeza.setNext(Nuevo);
            Cabeza = Nuevo;
        }
    }

    public void mostrar()
    {
        Stack_LIFO Aux = new Stack_LIFO();
        while(Cabeza != null)
        {
            System.out.println(Cabeza.getElem());
            Aux.insertar(Cabeza.getElem());
            this.borrar();
        }

        //

    }

    public void borrar()
    {
        if(Cabeza == fin)
            Cabeza = fin = null;
        else
        {
            NodoStack i = fin;
            while(i.getNext() != Cabeza)
                i = i.getNext();
            i.setNext(null);
            Cabeza = i;
        }
    }

    public void limpiar()
    {
        Cabeza=fin=null;
    }
}