public class Tarea  implements Comparable<Tarea>
{
    private int prioridad;
    private String descripcion;

    public Tarea(int prioridad, String descripcion) {
        this.prioridad = prioridad;
        this.descripcion = descripcion;
    }

    @Override
    public int compareTo(Tarea otra) {
        return Integer.compare(this.prioridad, otra.prioridad);
    }

    @Override
    public String toString() {
        return "Tarea{" + "prioridad=" + prioridad + ", descripcion=" + descripcion + '}';
    }

    public int getPrioridad() { return prioridad;}
    public void setPrioridad(int prioridad) { this.prioridad = prioridad;}

    public String getDescripcion() { return descripcion;}
    public void setDescripcion(String descripcion) { this.descripcion = descripcion;}

    
}
