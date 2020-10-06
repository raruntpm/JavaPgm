import java.io.*;
import java.util.*;

class ArrangeNames
{
	public static void main(String args[])
	{
		try
		{
			List names=new ArrayList();
			System.out.println("Number of names want to add");
			DataInputStream dis=new DataInputStream(System.in);
			int num=Integer.parseInt(dis.readLine());
			System.out.println("List the names to sort");
			for(int i=0;i<num;i++)
			{
				names.add(dis.readLine());
			}
			Collections.sort(names);
			System.out.println("Sorted Names are:");
			for(int i=0;i<num;i++)
			{
				
				System.out.println(names.get(i));
			}

		}
		
		catch(Exception e)
		{
			System.out.println("Error");
		}
	}
}