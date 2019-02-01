class CircleStatic
{
	private double radius;
	private static int numberofObjects =0;


	public void setradius(double a)
	{
	radius=a;
	numberofObjects++;

	}
	public double getradius()
	{
	return radius;
	}
	public static int getnumberofObjects()
	{
	return numberofObjects;
	}
	public void findarea()
	{
	double area;
	area =3.14*radius*radius;
	System.out.print("the area is :" +area);
	}
}


public class TestCircleStatic
{
	public static void main(String[] args)
	{
	CircleStatic circle1 = new CircleStatic();
	System.out.print("circle1 information");
	circle1.setradius(5);
	System.out.print("circle1 radius:" +circle1.getradius());
	System.out.print("The number of circle objects:" +CircleStatic.getnumberofObjects());
	CircleStatic circle2 =new CircleStatic();
	circle1.findarea();
	circle2.setradius(5);
	System.out.print("circle1 radius:" +circle2.getradius());
	System.out.println("The number of Circle objects:" +CircleStatic.getnumberofObjects());
	circle2.findarea();
	}
}