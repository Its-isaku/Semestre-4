//Librerias
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class Lista
{
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
        //System.out.println("elemento recibido: " + elem);
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

public void mostrar() {
    if (inicio == null) {
        System.err.println("La lista está vacía!\n");
        return;
    }

    Nodo actual = inicio;

    // Primera pasada: Mostrar nombres y fechas
    while (actual != null) {
        System.out.println("Nombre: " + actual.getElem() + ", Fecha y hora de ingreso: " + actual.getFecha_Hora().format(formatter));
        actual = actual.getnext(); // Avanza al siguiente nodo
    }

    System.out.println("--------------------------------------------------------------------------------------");

    // Segunda pasada: Mostrar desfases de tiempo
    actual = inicio.getnext(); // Empezamos desde el segundo nodo
    LocalDateTime fechaHoraInicio = inicio.getFecha_Hora();

    while (actual != null) 
    {
        long totalSegundos = ChronoUnit.SECONDS.between(fechaHoraInicio, actual.getFecha_Hora());
        System.out.printf(actual.getElem() + " tiene un desfase de" + totalSegundos / 3600 + " horas, "+ (totalSegundos % 3600) / 60 +" minutos,"+ totalSegundos % 60+" segundos%n");
        actual = actual.getnext();
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

    public void InsertarEnMedio(String Elem, String colado)
    {
        
        boolean estado = false;
        Nodo nuevo =  new Nodo();
        nuevo.setElem(colado);
        Nodo i = inicio;
        Nodo ant = inicio;
        nuevo.setFecha_Hora(LocalDateTime.now());//guarda la fecha y a hora

        while(i != null && estado == false)
        {
            if(Elem.equals(i.getElem()))
            {
                System.out.println("El elemento se encuentra en la lista.\n");
                estado = true; 

                if(i == inicio)
                {
                    InsertarInicio(colado);
                }
                else
                {
                    ant.setnext(nuevo);
                    nuevo.setnext(i);
                }
                
            }
            else
            {
                if(i != inicio)
                    ant = ant.getnext();
                i = i.getnext();
            }
        }

        if (estado == false)
            System.out.println("El elemento no se esncuentra en la lista\n");
    }

    public void Borrar(String Elem)
    {
        boolean estado = false;
        Nodo i = inicio;
        Nodo ant = inicio;

        while( i != null)
        {
            if(Elem.equals(i.getElem()))
            {
                if (i == inicio)
                {
                    inicio = inicio.getnext();
                    i.setnext(null);
                } 
                else
                {
                    if(i == fin)
                        fin = ant;
                    ant.setnext(i.getnext());
                    i.setnext(null);
                }
                

                System.out.println("El elemento fue borrado de la lista.\n");
                i = null;
                estado = true; 
            }
            else
            {
                if(i != inicio)
                    ant = ant.getnext();

                i = i.getnext();
            }
        }
        if (estado == false)
            System.out.println("El elemento no se esncuentra en la lista\n");
    }
}


