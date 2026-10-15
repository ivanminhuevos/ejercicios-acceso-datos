package cc.ivanmin;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;


class ClienteUtilsTest {
    ArrayList<Cliente> clientes;
    @BeforeEach
    void setUp() {
        clientes = new ArrayList<>();

        clientes.add(new Cliente(1, "Ivan", "Minguet", 20));
        clientes.add(new Cliente(2, "Ronal", "Reina", 20));
        clientes.add(new Cliente(3, "Hugo", "Lopez", 18));
        clientes.add(new Cliente(4, "Lucas", "Tortosa", 19));
    }

    @Test
    void showClients() {
        ClienteUtils.showClients(clientes);
        assertTrue(true);
    }

    @Test
    void getClientsQuantity() {
        assertEquals(4, ClienteUtils.getClientsQuantity(clientes));
    }

    @Test
    void getClientsQuantityArray() {
        Cliente[] clienteArray = clientes.toArray(new Cliente[0]);

        assertEquals(4, ClienteUtils.getClientsQuantity(clienteArray));
    }
}