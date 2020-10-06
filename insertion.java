class arun
{




	public static void main(String args[])
	{
		int a[]={3,5,4,1,2};
		int newvalue,j;
		for(int i=1;i<a.length;i++)
		{
			newvalue=a[i];
			j=i;
			while(j>0 && a[j-1]>newvalue)
			{
				a[j]=a[j-1];
				j--;
			}
			a[j]=newvalue;




		}








		for (int i=0;i<5;i++)
		System.out.print(a[i]+" ");

	}
}