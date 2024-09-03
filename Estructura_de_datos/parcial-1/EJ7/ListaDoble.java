import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

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
        NodoEJ6 nuevo = new NodoEJ6();
        nuevo.setElem(Elem);
    
        //lisat vacia coloca el primer elemento
        if (inicio == null)// lista vacia
        {
            inicio = nuevo;
            fin = nuevo;
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
    }

    public void InsertarInicio(String Elem)
    {
        NodoEJ6 nuevo = new NodoEJ6();
        nuevo.setElem(Elem);
        NodoEJ6 aux = inicio;
        inicio = nuevo;
        nuevo.setnext(aux);
        aux.setback(inicio);
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
                estado = true; 

                if(i == inicio)
                {
                    InsertarInicio(colado);
                }
                else
                {
                    i.getback().setnext(nuevo);
                    nuevo.setnext(i);
                    nuevo.setback(i.getback());
                    i.setback(nuevo);
                }
                
            }
            else
            {
                i = i.getnext();
            }
        }

        if (estado == false)
            System.out.println("El elemento no se esncuentra en la lista\n");
    }
 
    public boolean Borrar(String Elem)
    {
        boolean estado = false;
        NodoEJ6 i = inicio;

        while( i != null && estado == false)
        {
            if(Elem.equals(i.getElem()))
            {
                estado = true;

                if(inicio == fin)
                { 
                    inicio = fin = null;
                }
                else if (i == inicio)
                {
                    inicio = inicio.getnext();
                    i.setnext(null);
                    inicio.setback(null);
                } 
                else
                {
                    if(i == fin)//Borra el ultimo
                    {
                        fin = fin.getback();
                        i.setback(null);
                        fin.setnext(null);
                    }
                    else// enmedio
                    {
                        i.getnext().setback(i.getback());
                        i.getback().setnext(i.getnext());
                        i.setnext(null);
                        i.setback(null);
                    }
                }
                
                estado = true; 
            }
            else i = i.getnext();

        }
        return estado;
    }

    public void limpiar()
    {
        inicio = fin = null;
    }

    public boolean vacio()
    {
        if(inicio == fin && inicio == null)
            return  true;
        else
            return false;
    }

    public void guardarEnArchivo(String nombreArchivo) throws IOException 
    {
        try (BufferedWriter escritor = new BufferedWriter(new FileWriter(nombreArchivo))) 
        {
            NodoEJ6 actual = inicio; // Comenzamos desde el nodo inicial
            while (actual != null) {
                escritor.write(actual.getElem()); // Escribir el dato del nodo en el archivo
                escritor.newLine(); // Nueva línea para cada dato
                actual = actual.getnext(); // Mover al siguiente nodo
            }
            escritor.close(); // Cerrar el archivo para liberar recursos
        }
    }

    public void mostrarInverso()
    {
        if(inicio != null)
        {
            NodoEJ6 i = fin;

            while(i != null)
            {
                System.out.println(i.getElem());
                i = i.getback();
            }
        }
    }
}


