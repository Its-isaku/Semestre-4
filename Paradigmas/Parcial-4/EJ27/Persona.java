public class Persona 
{

    public Persona() 
    {
        //? Constructor vacio
    }

    public Persona(int id, String nombre, String apellido, String correo, String genero, int edad) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.correo = correo;
        this.genero = genero;
        this.edad = edad;
    }

    Integer id;
    String nombre;
    String apellido;
    String correo;
    String genero;
    Integer edad;

    //? Getter y Setter :)

    public Integer getId() { return id;}
    public void setId(Integer id) { this.id = id; }

    public String getNombre() { return nombre;}
    public void setNombre(String nombre) { this.nombre = nombre; }

    public String getApellido() { return apellido; }
    public void setApellido(String apellido) { this.apellido = apellido; }

    public String getCorreo() { return correo; }
    public void setCorreo(String correo) { this.correo = correo; }

    public String getGenero() { return genero; }
    public void setGenero(String genero) { this.genero = genero; }

    public Integer getEdad() { return edad; }
    public void setEdad(Integer edad) { this.edad = edad; }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Persona{");
        sb.append("id=").append(id);
        sb.append(", nombre=").append(nombre);
        sb.append(", apellido=").append(apellido);
        sb.append(", correo=").append(correo);
        sb.append(", genero=").append(genero);
        sb.append(", edad=").append(edad);
        sb.append('}');
        return sb.toString();
    }


    

};