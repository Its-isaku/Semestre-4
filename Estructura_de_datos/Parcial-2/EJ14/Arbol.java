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

    public NodoArbol_2 getMinimumKey(NodoArbol_2 curr)
    {
        while (curr.getIzq() != null) 
            curr = curr.getIzq();
        return curr;
    }

    //? Metodo para eliminar
    public NodoArbol_2 deleteNode(NodoArbol_2 root, int key){
        // puntero para almacenar el padre del nodo actual
        NodoArbol_2 parent = null;
        NodoArbol_2 curr=root;
        //seccion donde busca si la clave esta en el arbol
        // busca la clave en el BST y establece su puntero principal
        while (curr != null && curr.getElem() != key)
        {
            // actualiza el padre al nodo actual
            parent = curr;

            // si la clave dada es menor que el nodo actual, vaya al subárbol izquierdo;
            // de lo contrario, vaya al subárbol derecho
            if (key < curr.getElem()) {
                curr = curr.getIzq();
            }
            else {
                curr = curr.getDer();
            }
        }

        // regresa si la clave no se encuentra en el árbol
        if (curr == null) {
            return root;
        }
        //fin busqueda

        // Caso 1: el nodo a eliminar no tiene hijos, es decir, es un nodo hoja
        if (curr.getIzq() == null && curr.getDer() == null){
            // si el nodo a eliminar no es un nodo raíz, establezca su
            // padre izquierdo/derecho hijo a nulo
            if (curr != root)
            {
                if (parent.getIzq() == curr) {
                    parent.setIzq(null);
                }
                else {
                    parent.setDer(null);
                }
            }
            // si el árbol solo tiene un nodo raíz, configúrelo como nulo
            else {
                root = null;
            }
        } //fin caso 1

        //caso 2: nodo a eliminar tiene 2 hijos
        else if (curr.getIzq() != null && curr.getDer() != null){
            // encuentra su nodo sucesor en orden
            NodoArbol_2 successor = getMinimumKey(curr.getDer());

            // almacenar el valor del sucesor
            int val = successor.getElem();

            // borra recursivamentemente el sucesor. Nótese que el sucesor
            // tendrá como máximo un hijo (hijo derecho)
            deleteNode(root, successor.getElem());

            // copia el valor del sucesor al nodo actual
            curr.setElem(val);
        } //fin caso 2

        // Caso 3: el nodo a eliminar solo tiene un hijo
        else {
            // elige un nodo hijo
            NodoArbol_2 child = (curr.getIzq() != null)? curr.getIzq(): curr.getDer();

            // si el nodo a eliminar no es un nodo raíz, establezca su padre
            // a su hijo
            if (curr != root)
            {
                if (curr == parent.getIzq()) {
                    parent.setIzq(child);
                }
                else {
                    parent.setDer(child);
                }
            }

            // si el nodo que se va a eliminar es un nodo raíz, establezca la raíz en el hijo
            else {
                root = child;
            }
        } //fin caso 3

        return root;
    }


}
