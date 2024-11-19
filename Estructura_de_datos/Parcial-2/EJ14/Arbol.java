public class Arbol 
{
    private NodoArbol_2 Raiz;
    public int cont;

    //? Getter y setter de Raiz
    public NodoArbol_2 getRaiz() { return Raiz; }
    public void setRaiz(NodoArbol_2 raiz) { Raiz = raiz; }

    //? constructor
    public Arbol()
    {
        Raiz = null;
    }

    //? Verifica si esta vacio
    public boolean vacio()
    {
        return (Raiz == null);
    }

    //? Insertar elementos a arbol
    public void Instertar(int Elem)
    {
        NodoArbol_2 nuevo = new NodoArbol_2();
        nuevo.setElem(Elem);

        if(vacio())
            Raiz = nuevo;
        else
        {
            NodoArbol_2 i = Raiz;
            while(i!=null)
            {
                if(Elem > i.getElem()) //* validar si nodo derecho esta vacio
                {
                    //* Validar si nodo derecho esta vacio
                    if(i.getDer() == null)
                    {
                        i.setDer(nuevo);
                        i = null;
                    }
                        else //* si no esta vacio
                        i = i.getDer();
                } //* fin if derecha
                else
                {
                //* Validar si nodo izquierdo esta vacio
                    if(i.getIzq() == null) //* validar si nodo izquierdo esta vacio
                    {
                        i.setIzq(nuevo);
                        i = null;
                    }
                    else //* si no esta vacio
                        i = i.getIzq();
                } //* fin else izquierda
            }
        }
    }

    //? Mostrar arbol en preorden
    public void MostrarPreOrden(NodoArbol_2 aux)
    {
        if(aux != null)
        {
            System.out.print(aux.getElem() + " - ");
            MostrarPreOrden(aux.getIzq());
            MostrarPreOrden(aux.getDer());
        }
    }

    //? Mostrar arbol en postorden
    public void MostrarInOrden(NodoArbol_2 aux)
    {
        if(aux != null)
        {
            MostrarInOrden(aux.getIzq());
            System.out.print(aux.getElem() + " - ");
            MostrarInOrden(aux.getDer());
        }
    }

    //* Mostrar arbol en postorden
    public void MostrarPostOrden(NodoArbol_2 aux)
    {
        if(aux != null)
        {
            MostrarPostOrden(aux.getIzq());
            MostrarPostOrden(aux.getDer());
            System.out.print(aux.getElem() + " - ");
        }
    }

    //* mostrar por niveles
    public void Mayor_Menor(NodoArbol_2 aux)
    {
        if(aux != null)
        {
            Mayor_Menor(aux.getDer());
            System.out.print(aux.getElem() + " - ");
            Mayor_Menor(aux.getIzq());
        }
    }

    //? Meteodo para buscar
    public boolean Buscar(int num)
    {
        cont = 0;
        NodoArbol_2 i = Raiz;
        boolean encontrado = false;
        while(i != null && !encontrado)
        {
            cont++;
            if(i.getElem() == num) //* si el numero es igual al nodo
                    encontrado = true;
            else
                i = (num > i.getElem()) ? i.getDer() : i.getIzq(); //* si no es igual, se mueve a la derecha o izquierda
        }
        return encontrado;
    }

    //? Metodo para eliminar
    public void Eliminar(NodoArbol_2 i,int num, NodoArbol_2 ant ) //* la primera vez recbe la raiz como i, null como ant
    {
        boolean encontrado = false;

        if(i.getElem() == num) //* caso 1: cuando i no tiene hijos/ e un elemento
        {
            if(this.getRaiz().getIzq() == null && this.getRaiz().getDer() == null) //* La raiz es el unico Nodo 
                Raiz = null;
            else //* Caso 2: Cuando Nodo no tiene hijos
            {
                if(i.getIzq() == null && i.getDer() == null)
                {
                    if(ant.getIzq() == i) //* si el nodo a eliminar es el izquierdo
                        ant.setIzq(null); 
                    else //* si el nodo a eliminar es el derecho
                        ant.setDer(null);
                }
                else //* */ caso 3: cuando si tiene hijos
                {
                    System.out.println("Probando caso 3");
                }
            }
        }
        else // anvanzar la i
        {
            if(num < i.getElem()) //* avanzar a la izquierda
                Eliminar(i.getIzq(), num, i); //* i es el nodo actual, num es el numero a eliminar, ant es el nodo anterior
            else //* avanzar a la derecha
                Eliminar(i.getDer(), num, i); //* i es el nodo actual, num es el numero a eliminar, ant es el nodo anterior
        }


    }


}
