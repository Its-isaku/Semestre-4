//Librerias

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;


public class Lista {
    private Nodo inicio;
    private Nodo fin;
    private DateTimeFormatter formatter;

    //valores iniciales
    public Lista()
    {
        inicio = null;
        fin = null;

        //Define el formato para fecha y hora
        formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");

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
        Nodo nuevo = new Nodo();
        nuevo.setElem(Elem);
        nuevo.setFecha_Hora(LocalDateTime.now());//guarda la fecha y a hora

    
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
                //Formatea la fecha y la hora
                String FechaHoraFormateada = i.getFecha_Hora().format(formatter);
                System.out.println("Nombre: " + i.getElem() + ", Fecha y hora de ingreso:  " + FechaHoraFormateada);
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
        nuevo.setFecha_Hora(LocalDateTime.now());//guarda la fecha y a hora
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

    //Metodo para insertar nombre en posiscion deseada
    public void InsertarPosicion(String Elem, int posicion)
    {
        Nodo nuevo = new Nodo();
        nuevo.setElem(Elem);
        nuevo.setFecha_Hora(LocalDateTime.now());//guarda la fecha y a hora

        if(inicio == null)// si esta vacia el nuevo nodo se convierte en inicio
        {
            inicio = nuevo;
            fin = nuevo;
        }
        else if(posicion == 0 )// si la posicion es 0 se inserta al inicio
        { 
            nuevo.setnext(inicio);
            inicio = nuevo;
        }
        else
        {
            Nodo actual = inicio;
            int i = 0;

            // se recorre hasta la posicion deseada o hasta el final de la lista
            while(actual != null && i < posicion -1)
            {
                actual =actual.getnext();
                i++;
            }

            if(actual != null)// si aun no se alcanza el final
            {
                nuevo.setnext(actual.getnext());
                actual.setnext(nuevo);

                //si se inserta al final se actualiza  fin
                if(nuevo.getnext() == null)
                {
                    fin = nuevo;
                }
            }else 
            {
                System.out.println("La posicion esta fuera de los limites! \n");
            }
        }
    }
}