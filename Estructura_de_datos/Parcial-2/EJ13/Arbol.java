public class Arbol 
{
    private NodoArbol Raiz;

    // Getter y setter de Raiz
    public NodoArbol getRaiz() { return Raiz; }
    public void setRaiz(NodoArbol raiz) { Raiz = raiz; }

    // constructor
    public Arbol()
    {
        Raiz = null;
    }

    // Verifica si esta vacio
    public boolean vacio()
    {
        return (Raiz == null);
    }

    //Insertar elementos a arbol
    public void Instertar(int Elem)
    {
        NodoArbol nuevo = new NodoArbol();
        nuevo.setElem(Elem);

        if(vacio())
            Raiz = nuevo;
        else
        {
            NodoArbol i = Raiz;
            while(i!=null)
            {
                if(Elem > i.getElem()) // validar si nodo derecho esta vacio
                {
                    // Validar si nodo derecho esta vacio
                    if(i.getDer() == null)
                    {
                        i.setDer(nuevo);
                        i = null;
                    }
                        else // si no esta vacio
                        i = i.getDer();
                } // fin if derecha
                else
                {
                // Validar si nodo izquierdo esta vacio
                    if(i.getIzq() == null) // validar si nodo izquierdo esta vacio
                    {
                        i.setIzq(nuevo);
                        i = null;
                    }
                    else // si no esta vacio
                        i = i.getIzq();
                } // fin else izquierda
            }
        }
    }

    // Mostrar arbol en preorden
    public void MostrarPreOrden(NodoArbol aux)
    {
        if(aux != null)
        {
            System.out.print(aux.getElem() + " - ");
            MostrarPreOrden(aux.getIzq());
            MostrarPreOrden(aux.getDer());
        }
    }

    // Mostrar arbol en postorden
    public void MostrarInOrden(NodoArbol aux)
    {
        if(aux != null)
        {
            MostrarInOrden(aux.getIzq());
            System.out.print(aux.getElem() + " - ");
            MostrarInOrden(aux.getDer());
        }
    }

    // Mostrar arbol en postorden
    public void MostrarPostOrden(NodoArbol aux)
    {
        if(aux != null)
        {
            MostrarPostOrden(aux.getIzq());
            MostrarPostOrden(aux.getDer());
            System.out.print(aux.getElem() + " - ");
        }
    }

    // mostrar por niveles
    public void Mayor_Menor(NodoArbol aux)
    {
        if(aux != null)
        {
            Mayor_Menor(aux.getDer());
            System.out.print(aux.getElem() + " - ");
            Mayor_Menor(aux.getIzq());
        }
    }

    // Meteodo para buscar
    public boolean Buscar(int num)
    {
        NodoArbol i = Raiz;
        boolean encontrado = false;
        while(i != null && !encontrado)
        {
            if(i.getElem() == num) // si el numero es igual al nodo
                encontrado = true;
            else
                i = (num > i.getElem()) ? i.getDer() : i.getIzq(); // si no es igual, se mueve a la derecha o izquierda
        }
        return encontrado;
    }

    
}
