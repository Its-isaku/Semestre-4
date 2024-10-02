//Librerias
import java.time.LocalDateTime;

//Queue para filas de imss
public class Queue_FIFO_2 
{
    private Nodo inicio;
    private Nodo fin;
    
    //valores iniciales
    public Queue_FIFO_2()
    {
        inicio = null; 
        fin = null;
    }

    //Metodo para insertar
    public void Instertar(String Elem, int turno, LocalDateTime hora)
    {
        //Se crea un nuevo Nodo y se le asigna el valor de Elem
        Nodo nuevo = new Nodo();
        nuevo.setElem(Elem);
        nuevo.setHora(hora);
        nuevo.setTurno(turno);

        // Lisat vacia
        if(inicio == null && fin == null) 
        {
            inicio = nuevo;
            fin = nuevo;
        }
        else //NO esta vacio
        {
            Nodo i = inicio;
            while(i.getnext() != null)
            {
                i = i.getnext();
            }
            i.setnext(nuevo);
            fin = nuevo;
        }
    }

        //Metodo oara borrar
        public void Borrar()
        {
            if(inicio == fin) //Vacio o con un elemento
                inicio = fin = null;

            else //mas de un elemento
            {
                Nodo aux = inicio.getnext();
                inicio.setnext(null);
                inicio = aux;
            }
        }

        public void Mostrar()
        {
            Nodo i = inicio;
            while (i != null)
            {
                System.out.println(i.toString());
                i = i.getnext();
            }
        }

        public void Buscar(String Elem)
        {
    
            boolean estado = false;
            Nodo i = inicio;
    
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

        public void Combinar(Queue_FIFO_2 Fila1, Queue_FIFO_2 Fila2)
        {
            Nodo i = Fila1.inicio;
            Nodo j = Fila2.inicio;
            int Turno = 1;
            // se asume que ambas filas estan ordenadas
            while(i != null && j != null)
            {
                if(i.getHora().isBefore(j.getHora()))
                {
                    this.Instertar(i.getElem(), Turno, i.getHora());
                    Turno++;
                    i = i.getnext();
                }
                else if(i.getHora().equals(j.getHora()))
                {
                    this.Instertar(i.getElem(), Turno, i.getHora());
                    Turno++;
                    this.Instertar(j.getElem(), Turno, j.getHora());
                    Turno++;
                    i = i.getnext();
                    j = j.getnext();
                }
                else 
                {
                    this.Instertar(j.getElem(), Turno, j.getHora());
                    Turno++;
                    j = j.getnext();
                }
            }
            // si al terminar hay elementos en alguna fila, se agregan al final
            while(i != null)
            {
                this.Instertar(i.getElem(), Turno, i.getHora());
                Turno++;
                i = i.getnext();
            }
            while(j != null)
            {
                this.Instertar(j.getElem(), Turno, j.getHora());
                Turno++;
                j = j.getnext();
            }
        }


    }



