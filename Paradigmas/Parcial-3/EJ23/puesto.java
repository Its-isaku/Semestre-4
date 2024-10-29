public class puesto 
{
    private int num;
    private int salario;
    private String nombre;

    public int getSalario() {return salario;}
    public void setSalario(int salario) {this.salario = salario;}

    public String getNombre() {return nombre;}
    public void setNombre(String nombre) {this.nombre = nombre;}

    public int getNum() {return num;}
    public void setNum(int num) {this.num = num;}

    public puesto()
    {
        this.salario=1800; //semanal
        this.nombre="ayudante";
    }

    
    public puesto(int salario, String nombre) 
    {
        this.salario = salario;
        this.nombre = nombre;
    }

    public puesto(int num, int salario, String nombre) 
    {
        this.num=num;
        this.salario = salario;
        this.nombre = nombre;
    }

    @Override
    public String toString() 
    {
        return "puesto [num=" + num + ", salario=" + salario + ", nombre=" + nombre + "]";
    }

}
