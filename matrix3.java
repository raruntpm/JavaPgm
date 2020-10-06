import java.io.*;
class matrix3
{
	int row1,column1,row2,column2;
	int array1[][],array2[][],array3[][];	
	
	
	public void getMatrix()
	{
		try
		{
			DataInputStream dis=new DataInputStream(System.in);
			System.out.println("enter the row of first matrix");
			row1=Integer.parseInt(dis.readLine());

			System.out.println("enter the column of first matrix");
			column1=Integer.parseInt(dis.readLine());
			System.out.println("enter the row of second matrix");
			row2=Integer.parseInt(dis.readLine());
			System.out.println("enter the column of second matrix");
			column2=Integer.parseInt(dis.readLine());

			if(column1!=row2)
			{
				System.out.println("matrix multiplication is not possible");
			}
			else
			{
				//array1=int [row1];
				//for(i=0;i<row1;i++)
				//array1[i]=new int [column1];
				array1=new int[row1][column1];
				System.out.println("enter the first matrix");
				for(int i=0;i<row1;i++)
				{
					for(int j=0;j<column1;j++)
					{
						System.out.println("enter the value of array["+ i +"] and array [" + j+ "]");
						array1[i][j]=Integer.parseInt(dis.readLine());
					}
				}
				//for(i=0;i<row2;i++)
				//array1[i]=new int [column1];
				//		array2=int [row2];
				array2=new int[row2][column2];
				System.out.println("enter the first matrix");
				for(int i=0;i<row2;i++)
				{
					for(int j=0;j<column2;j++)
					{
						System.out.println("enter the value of array["+ i +"] and array [" + j+ "]");
						array2[i][j]=Integer.parseInt(dis.readLine());
					}
				}
			}
		}
		catch(Exception e)
		{
			
			System.out.println("error");

		}	
		
	}
	public void matrixCalc()
	{
		array3=new int[row1][column2];
		//array3=int [row1];
		//for(i=0;i<column2;i++)
		//array3[row1]=new int[column2];
		
		for(int i = 0; i < row1; i++) {
			for(int j = 0; j < column2; j++) {
				//array3[i][j]=0;
				for(int k = 0; k < row2; k++){
					
					array3[i][j] += array1[i][k]*array2[k][j];
				}
			}  
		}
		
	}
	public void displaymatrix()
	{
		
		System.out.println("Multiply of both matrix : ");
		for(int i = 0; i < row1; i++) {
			for(int j = 0; j < column2; j++) 
			{
				System.out.print(" "+array3[i][j]);
			} 
			System.out.println();
		} 
		System.out.println();
	}
}

class matrixmain
{
	public static void main(String args[])
	{
		matrix3 m3=new matrix3 ();
		m3.getMatrix();
		m3.matrixCalc();
		m3.displaymatrix();
	}
}	