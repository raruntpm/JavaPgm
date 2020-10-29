import java.rmi.*;
import java.rmi.server.*;

public class RemoteFactClass extends UnicastRemoteObject
                        implements RemoteFactInterface
{
          RemoteFactClass() throws RemoteException
        {
                super();
                }

        
                public int add(int a,int b) throws RemoteException
                {
                int c=a+b;
                return(c);
                  }


                public int sub(int a,int b) throws RemoteException
                {
                int c=a-b;
                return(c);
                  }

       
        }

