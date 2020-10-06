class arun
{

int linearSearch(int[] array, int value) {

int i,right=array.length-1;
int flag=1;
for(i=0;i<=right;i++)
{
if( array[i]==value)
{
	flag=0;
	break;
}
}
if(flag==1)
	return -1;
else
	return i;



      
}


public static void main(String args[])
{

int a[]={2,3,4,8,10,56,84};
int b;
arun obj=new arun();
b=obj.linearSearch(a,5);

	System.out.print(b);

}
}