class test{

int a,b;

test (int i,int j)
{
a=i;
b=j;
}

void meth (test ob){
ob.a *=2;
ob.b /=2;
}}


class callbyrefer {
public static void main(String args[]) {

test ob= new test(10,20);


System.out.println( "a="+ob.a+"b="+ob.b);

ob.meth(ob);

System.out.println( "a="+ob.a+"b="+ob.b);
}
}