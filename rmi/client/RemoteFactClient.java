import java.rmi.*;

class RemoteFactClient
{
        public static void main(String argv[]) throws Exception
        {
              
              // RemoteFactInterface o = (RemoteFactInterface) Naming.lookup("rmi://sunsoftnode7/FactObject");

                RemoteFactInterface o = (RemoteFactInterface) Naming.lookup("rmi://127.0.0.1/RemoteFactServer");
        

                System.out.println("Client Add="+o.add(5,10));
                System.out.println("Client sub="+o.sub(5,10));
                }
        }
