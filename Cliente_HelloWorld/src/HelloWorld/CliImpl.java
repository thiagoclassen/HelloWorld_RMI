package HelloWorld;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class CliImpl extends UnicastRemoteObject implements InterfaceCli {

    protected CliImpl() throws RemoteException {
        super();
        // TODO Auto-generated constructor stub
    }

    private static final long serialVersionUID = -420190198171917249L;


    @Override
    public void echo(String msg) {
        System.out.println(msg);
    }

}