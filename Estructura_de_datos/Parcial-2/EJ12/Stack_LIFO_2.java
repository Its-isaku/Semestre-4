

public class Stack_LIFO_2
{
    private NodoStack_2 Cabeza=null;
    private NodoStack_2 fin=null;
    protected int cont = 0; 

    public Stack_LIFO_2()
    {
        Cabeza = null;
        fin = null;
    }

    public NodoStack_2 getCabeza() { return Cabeza; }
    public void setCabeza(NodoStack_2 cabeza) { Cabeza = cabeza; }

    public NodoStack_2 getFin() { return fin; }
    public void setFin(NodoStack_2 fin) { this.fin = fin; }

    public void insertar(int Elem)
    { 
        NodoStack_2 Nuevo = new NodoStack_2(); 
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
        cont = 0;
        if (!vacia()) 
        {
            Stack_LIFO_2 Aux = new Stack_LIFO_2();
            
            while (Cabeza != null) 
            {
                int valor = Cabeza.getElem();
                // Obtener el color específico para el valor desde el mapa de colores
                String color = ColoresANSI.mapaColores.getOrDefault(valor, ColoresANSI.RESET);
                System.out.println(color + valor + ColoresANSI.RESET);
    
                Aux.insertar(valor);
                this.borrar();
            }
    
            while (Aux.Cabeza != null) 
            {
                this.insertar(Aux.Cabeza.getElem());
                Aux.borrar();
            }
        }
    }

    //Validar ganador
    public Boolean ValidarGanador()
    {
        if(!vacia() && Cabeza.getElem() == 1 && fin.getElem() == 5)
        {
            if (!vacia()) 
            {
                Stack_LIFO_2 Aux = new Stack_LIFO_2();

                while (Cabeza != null) 
                {
                    Aux.insertar(Cabeza.getElem());
                    this.borrar();
                    cont++;
                }
            
                while (Aux.Cabeza != null) 
                {
                    this.insertar(Aux.Cabeza.getElem());
                    Aux.borrar();
                }
            }
            if(cont == 5)
            {
                System.out.println("Ganaste!");
                return true;
            }
            else
                return false;
        }
        else
            return false;
    }
    

    public void borrar()
    {
        if(Cabeza == fin)
            Cabeza = fin = null;
        else
        {
            NodoStack_2 i = fin;
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

    public boolean vacia()
    {
        return (Cabeza == null);
    }
}