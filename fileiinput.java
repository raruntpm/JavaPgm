import java.io.*;
class showfile{
	public static void main(String args[])
	throws IOException
	{
		int i;
		FileInputStream fin;
		FileOutputStream fout;

		try {
			fin= new FileInputStream(args[0]);
		}

		catch(FileNotFoundException e){
			System.out.println("file not found");
			return;
		}

		try {
			fout= new FileOutputStream(args[1]);
		}

		catch(FileNotFoundException e){
			System.out.println("file not found");
			return;
		}

		do{
			i = fin.read();
			if(i != -1) fout.write(i);;
		}while(i != -1);
		fin.close();
		fout.close();
	}
}