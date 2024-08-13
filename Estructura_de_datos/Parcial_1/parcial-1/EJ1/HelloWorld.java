public class HelloWorld 
{
    public static void main(String[] args)
    {
        System.out.println("Hello World");

        //---------------------------------------------

        int a,b,c;

        a = 0;
        b = 0;
        c = a + b;

        System.out.println(c);

        if ( c > 0)
        {
            System.out.println("El resultado es positivo");
        }
        else if (c < 0)
        { 
            System.out.println("El resultado es negativo");
        }
        else
        {
            System.out.println("El resultado es cero");
        } 
        
    }
}