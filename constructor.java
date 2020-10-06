// constructor overloading

class Box
{
double width; 
double height;
double depth;

Box(double w, double x, double y)
{
width=w;
height=x;
depth=y;
}

Box(double w)
{
width=w;		// for cube
height=w;
depth=w;
}

Box(Box ob)
{
width=ob.width;		// passing object as parameter
height=ob.height;
depth=ob.depth;
}

Box()
{
width=-1;		// un initialized one
height=-1;
depth=-1;
}

void volume()
{
System.out.println(width*height*depth);
}



}
class arun{
public static void main(String args[])
{
Box mybox1= new Box(1,2,3);
Box mybox2= new Box(6);
Box mybox3= new Box();

Box myclone= new Box(mybox1);

mybox1.volume();
mybox2.volume();
mybox3.volume();
myclone.volume();
}
}