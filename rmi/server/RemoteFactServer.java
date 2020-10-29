import java.rmi.*;

class RemoteFactServer
{
        public static void main(String argv[]) throws Exception
        {
                RemoteFactClass o = new RemoteFactClass();

// bind(String URL, Object o)
 //   Naming.rebind("rmi://sunsoftnode7/FactObject",o);

               Naming.rebind("RemoteFactServer",o);
                System.out.println("FactObject Successfully Registered ...");
                }
        }
