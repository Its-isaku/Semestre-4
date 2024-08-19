// molde de una classe 
//modelo de la caja para mascotas
public class Nodo 
{
    private String mascota;
    private Nodo Next; //cuaarda que une a otro objeto
    

    //set es  la assignacion para la caja
    // mas adelante se cambiaran el nombre de las cariables
    public void setMascota(String variable)
    {
        mascota = variable;
    }


    //get permite visualisar el contenido, regresa
    public String getMascota()
    {
        return mascota;
    }


    public void setNext(Nodo varaible)
    {
        Next = varaible;
    }


    public Nodo getNext()
    {
        return Next;
    }
}


