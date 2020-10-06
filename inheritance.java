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

//it inherites box

class Boxweight extends Box {
double weight;
Boxweight (double w, double x, double y,double m)
{
//width=w;
//height=x;
//depth=y;

// calling the superclass constructor

super(w,x,y);
weight=m;
}
}



class arun{
public static void main(String args[])
{
Boxweight mybox1= new Boxweight(1,2,3,4);
Boxweight mybox2= new Boxweight(6,3,4,5);

mybox1.volume();
mybox2.volume();

System.out.println("weight of box1 "+mybox1.weight);
System.out.println("weight of box2 "+mybox2.weight);

}
}