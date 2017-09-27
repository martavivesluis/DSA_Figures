public class Rectangle extends Figura
{
    public double base;
    public double altura;
    public double area()
    {
        return base*altura;
    }
    public Rectangle(double b,double t )
    {   this.base = b;
        this.altura = t;
    }
}