class ExArg
{
public static void main(String argv[]) throws Exception
          {
int length=argv.length;                            
System.out.println(“No of arguments=”+length);
for(int i=0;i<length;i++)
System.out.println(“Argument[“+i+”]=”+argv[i]);
          }
}
