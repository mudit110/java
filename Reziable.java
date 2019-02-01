interface GeometricObject
{
   double Perimeter();
   double Area();
    public void double getPerimeter();
    public void double getArea();
    }
    class CIrcle implements GeometricObjects
    {
    double radius=1.0;
    Circle(doouble radius)
    public double getPerimeter(){
    Perimeter=2*3.14*radius;
    return Perimeter;
    }
    public double getradius;
    Area=3.14*radius*radius;
    return Area;
    }
}    

interface Resizeable
{
    public double resize(int percentage)
    }


    class ResizeableCircle implements Resizable extends Circle
    {
    ResizableCircle(double radius)
    {
    this.radius=radius;
    }
    public double Resizable(int percentage)
    {
    radius=(radius*percentage)/100;
    
    }
}


class TestCircle
{
    public static void main(String args[])
    {
    Circle c =new Circle;
    c.getPerimeter();
    c.getArea();
    c.Resizeable();
}