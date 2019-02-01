import java.util.*;
class Box
 {
double width, w;
double height, h;
double depth, d;
void setDim ()
{
	w = width;
	h=height;
	d=depth;
}

double volume ()

    {
	return w*h*d;
	}
}
class Boxdemo
{
	public static void main(String args[])
	{
	double vol;
	Scanner Input = new Scanner(System.in);
	Box b1 =new Box();
	Box b2 =new Box();
	System.out.println("enter the values");
	b1.width= Input.nextInt();
	b1.height= Input.nextInt();
	b1.depth= Input.nextInt();
	b1.setDim();
	vol=b1.volume();
	System.out.print("The volume is :"+vol);
	}
}