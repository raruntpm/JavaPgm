import java.io.DataInputStream;
import java.io.PrintStream;

class Matrix
{
	int a[][]={ { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
	int b[][]={ { 1, 0, 0 }, { 0, 1, 0 }, { 0, 0, 1 } };
	int c[][]=new int[3][3];

	void calc()
	{
		for (int i=0;i<3;i++)
		{
			for (int j=0;j<3;j++)
			{
				for (int k=0;k<3;k++)
				{
					c[i][j]+=a[i][k]*b[k][j];
				}
			}
		}
	}

	void display()
	{
		for (int i=0;i<3;i++)
		{
			for (int j=0;j<3;j++)
			{
				System.out.print(c[i][j]);
			}
			System.out.println();
		}
	}

	public static void main(String args[])
	{
		Matrix obj=new Matrix();
		obj.calc();
		obj.display();
	}
}
