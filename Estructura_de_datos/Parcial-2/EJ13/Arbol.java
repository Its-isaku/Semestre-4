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
                if(Elem > i.getElem())
                {
                    // Validar si nodo derecho esta vacio
                    if(i.getDer() == null)
                        i.setDer(nuevo);
                    else
                        i = i.getDer();
                }
                else
                {
                // Validar si nodo izquierdo esta vacio
                    if(i.getIzq() == null)
                        i.setIzq(nuevo);
                    else
                        i = i.getIzq();
                }
            }
        }
    }

    
}
