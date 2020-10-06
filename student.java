import java.io.*;
import java.util.*;

class Student
{
	int mark1,mark2;
	String name;
	int total;

	int getData()
	{

		try{
			DataInputStream dis=new DataInputStream(System.in);
			System.out.println("Enter the name:");
			name=dis.readLine();
			System.out.println("Enter the mark1:");
			mark1=Integer.parseInt(dis.readLine());


			System.out.println("Enter the mark2:");
			mark2=Integer.parseInt(dis.readLine());
			return 1;
		}

		catch(Exception e)
		{
			//e.printStackTrace();
			return 0;
		}
	}

	void calc()
	{
		total=mark1+mark2;
	}

	void display()
	{
		System.out.println("Name  :"+name);
		System.out.println("Mark1 :"+mark1);
		System.out.println("Mark2 :"+mark2);
		System.out.println("Total :"+total);
	}
}


class T2
{
	public static void main(String args[])
	{

		Date d1=new Date();
		System.out.println("Date :"+d1.toLocaleString());

		Student s1[]=new Student[3];
		int  t=0;
		for(int i=0;i<3;i++)
		{
			s1[i]=new Student();
			t=s1[i].getData();
			if(t==0)
			{
				System.out.println("please enter a valid data");
				i=i-1;
				continue;

			}
			s1[i].calc();
			s1[i].display();
		}


	}

}