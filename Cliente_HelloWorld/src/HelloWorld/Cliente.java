package HelloWorld;

import java.rmi.Remote;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class Cliente {
    public static void main(String[] args) throws Exception {

        String maquinaServidor = "servis";
        int portaSN = 1337;

        System.setSecurityManager(null);

        Registry referenciaServicoNomes = LocateRegistry.getRegistry(null, portaSN);        

        InterfaceServ derps = (InterfaceServ) referenciaServicoNomes.lookup("servis");

        CliImpl cli = new CliImpl();

        derps.chamar("asd", cli);       
        
    }
}