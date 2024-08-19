public class Lista {
    private nodoej5 inicio;
    private nodoej5 fin;

    //valores iniciales
    public Lista(){
        inicio = null;
        fin = null;
    }
    public void setInicio(nodoej5 variable){    
        inicio = variable;
    }

    public nodoej5 getInicio(){
        return inicio;
    }
    public void setFin(nodoej5 variable){    
        fin = variable;
    }

    public nodoej5 getFin(){
        return fin;
    }

    public void direcciones(){
        System.out.println("inicio: " + inicio);
        System.out.println("fin: " + fin);
    }

    public void insertar(String Elem){
        //System.out.println("elemento recibido: " + elem);
        nodoej5 nuevo = new nodoej5();
        nuevo.setElem(Elem);
        System.out.println("nuevo: " + nuevo.getElem());
    }
}