class DemoBox
{
	public static void main(String args[])
	{
	Box mybox1= new Box(10.0,20.0,30.0);
	Box mybox2=new Box();
	double area, perimeter;
	area=mybox1.area();
	System.out.print(" the area is :" +area);
	perimeter= mybox1.perimeter();
	System.out.print("the perimeter is: +perimeter");
	mybox1.print();
	area=mybox2.area();
	System.out.print(" the area is :" +area);
	perimeter=mybox2.perimeter();
	System.out.print(" the perimeter is :" +perimeter);
	mybox2.print();
	}
}