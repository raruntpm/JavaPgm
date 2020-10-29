import java.rmi.*;

public interface RemoteFactInterface extends Remote 
{

        public int sub(int n,int b) throws RemoteException;
        public int add(int n,int b) throws RemoteException;

 }

