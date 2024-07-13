package javaCore.Kenum.test;

import javaCore.Kenum.dominio.Cliente;
import javaCore.Kenum.dominio.TipoCliente;

public class ClienteTeste01 {
    public static void main(String[] args) {
        Cliente cliente = new Cliente("Jiraya", TipoCliente.PESSOA_JURIDICA);
        Cliente cliente2 = new Cliente("Tsubasa",TipoCliente.PESSOA_FISICA);

        System.out.println(cliente);
    }
}
