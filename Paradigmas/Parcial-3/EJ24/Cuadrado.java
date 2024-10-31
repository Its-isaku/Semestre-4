public class Cuadrado extends  Figura
{

    private double base;
    private double altura;
    private  double A; // Area
    private double P;// perimetro

    // Constructor
    public Cuadrado()
    {
        this.base = 0;
        this.altura = 0;
        this.A = 0;
        this.P = 0;
    }
        // Getters y Setters
        public double getBase() {return base;}
        public void setBase(double base) {this.base = base;}
    
        public double getAltura() {return altura;}
        public void setAltura(double altura) {this.altura = altura;}
    
        public double getA() { return A;}
        public void setA(double a) {A = a;}
    
        public double getP() {return P;}
        public void setP(double p) {P = p;}

    // base = radio
    @Override
    public void area()
    {
        this.A = base * base;
    }

    //altura = diametro
    public void perimetro()
    {
        this.P = base * 4;
    }
    @Override
    public String toString() {
        return "Cuadrado [base=" + base + ", A=" + A + ", P=" + P + "]";
    }

    //toString
    
}
