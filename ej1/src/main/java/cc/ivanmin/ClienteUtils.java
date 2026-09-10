package cc.ivanmin;

import java.util.List;

public class ClienteUtils {
    public static void showClients(List<Cliente> clientes) {
        System.out.println("LISTADO DE CLIENTES:");
        for(Cliente c : clientes) {
            System.out.printf("%s %s\n", c.getNombre(), c.getApellido());
        }
    }

    public static int getClientsQuantity(List<Cliente> clientes) {
        return clientes.size();
    }

    public static int getClientsQuantity(Cliente[] clientes) {
        return clientes.length;
    }
}
