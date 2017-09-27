public class cercle extends Figura{
    public double radio;
    public double area()
    {
        return radio* Math.PI;
    }
    public cercle(double b)
    {   this.radio = b;
    }
}
