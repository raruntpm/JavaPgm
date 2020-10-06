

import java.io.*;

class selectiosort
{	int data[]=new int[30];
	int num,Location;
	int minVal;
	public void getData()
	{
		try
		{
			DataInputStream dis=new DataInputStream(System.in);
			System.out.println("SELECTION SORT");
			System.out.println("**************");
			System.out.println("HOW MANY NUMBERS YOU LIKE TO SORT:");
			num=Integer.parseInt(dis.readLine());

			System.out.println("ENTER THE NUMBERS:");
			for(int i=0;i<num;i++)
			{
				data[i]=Integer.parseInt(dis.readLine());
			}
		}
		catch(Exception e)
		{
		}
		
	}

	public void displayData()
	{
		System.out.println("SORTED NUMBERS ARE:");
		for(int i=0;i<num;i++)
		{
			System.out.println(data[i]);
		}
	}

	public void processSort()
	{

		for(int j=0;j<num;j++)
		{

			minVal=data[j];
			Location=j;

			for(int k=j;k<num-1;k++)
			{
				if(minVal>data[k+1])
				{
					minVal=data[k+1];
					Location=k+1;
				}

			}
			//Interchange the min val in the list with the initail assignment of list
			int temp=data[j];
			data[j]=data[Location];
			data[Location]=temp;

		}

	}

}

public class selectiosortMain {

	public static void main(String[] args) {
		selectiosort sels=new selectiosort();
		sels.getData();
		sels.processSort();
		sels.displayData();

	}

}
