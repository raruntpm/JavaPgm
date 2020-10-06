import java.io.*;
import java.util.*;

class FrequentWords
{
	String text="";
	int textLength;
	String textArray[];

	public void getWord()
	{
		try
		{
			System.out.println("ENTER SOME TEXT:");
			DataInputStream dis=new  DataInputStream(System.in);
			text=dis.readLine();
		}
		catch(Exception e)
		{
			System.out.println("Error");
		}

	}
	public void SeperateTokens()
	{
		StringTokenizer strToken=new StringTokenizer(text," ");
		textLength=strToken.countTokens();
		System.out.println("COUNTING NUMBER OF WORDS");
		System.out.println("************************");
		System.out.println("NUMBER OF WORD GIVEN:"+" "+ textLength);
		textArray=new String[textLength];
		while(strToken.hasMoreTokens())
		{
			for(int i=0;i<textLength;i++)
			{
				textArray[i]=strToken.nextToken();
				//System.out.println("Tokens"+" "+ textArray[i]);
			}
		}
	}
	public void StringFunction()
	{
		ArrayList strName=new ArrayList();
		for(int j=0;j< textLength;j++)
		{
			int count=0;
			for(int k=0;k< textLength;k++)
			{

				if(!(strName.isEmpty())&&(strName.contains(textArray[k])))
				{
				}
				else
				{
					if(textArray[j].compareTo(textArray[k])==0)
					{
						
						count++;

					}
				}
			}

			
			if(count!=0)
			{
				strName.add(textArray[j]);
				System.out.println("NUMBER OF TIMES "+ " '"+textArray[j] + "' "+ "APPEARED: " +count );
			}
			

		}


	}

}

public class FrequentWordsMain {

	/**
	* @param args the command line arguments
	*/
	public static void main(String[] args) {
		FrequentWords fw=new FrequentWords();
		fw.getWord();
		fw.SeperateTokens();
		fw.StringFunction();

	}

}
