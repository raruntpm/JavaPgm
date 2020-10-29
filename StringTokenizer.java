import java.util.*;
class ExStringTokenizer
{
 	public static void main(String argv[])
        {
String data=””ram,sam,tam,sekar,raju”;
StringTokenizer st = new StringTokenizer(data,”,”);  
// StringTokenizer(String obj, String delimiter)
while (st.hasMoreTokens())
{
String s = (String) st.nextToken();
System.out.println(s);
}	
        }
}
