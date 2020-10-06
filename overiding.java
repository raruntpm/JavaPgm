 class a {				// if final precedes class name it cannot be
int i,j;				// inherited... (final class a)
a(int a, int b){
i=a;
j=b;
}

void show()
{
System.out.println("i and j: " +i+ " " +j);
}
}
 
class b extends a {

int k;

b(int a, int b,int c){

super(a,b);
k=c;

}

void show()
{

super.show();  			// A's show
System.out.println("k= " +k);
}
}

class override {
public static void main(String args[]){

b obj=new b(1,2,3);
obj.show();


}}