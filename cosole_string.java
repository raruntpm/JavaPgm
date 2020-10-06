import java.io.*;
class showfile{
	public static void main(String args[])
	throws IOException
	{
		String c;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("'stop' to quit ");

		do{
			c =   br.readLine();
			System.out.println(c);
		}while( !c.equals("stop"));

	}
}