class circle
{
	 private double radius;
	 public double area;
	 public void setRadius()
	 {
	 	radius=5;
	 }
	public void getRadius()
	{
		System.out.print(radius);
	}
	voidfind area()
	 {
	 area=3.14*radius*radius;
	 }
	 void displayarea()
	 {
	 System.out.println("the area of circle is :" +area);
	 }	 
}
class circledemo2	
{
	public static void main( String args[])
	{
	circle c = new circle();
	c.setRadius ;
	c.getRadius;
    c.findarea();
    c.displayarea();

	}
}