
class arun
{

public static void main(String args[])
{



String s="madama";
StringBuffer sf=new StringBuffer(s);
String s1=new String(sf.reverse());
if(s1.equals(s))
System.out.println("given string is palindrome");
else 
System.out.println("given string is not a palindrome");
 

}

    
}