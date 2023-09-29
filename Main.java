package prope;

public class Main {

    public static void main(String[] args) {
        // Crear una instancia de la cajera
        Cajera cajera = new Cajera("Cajera1");

        // Crear varios clientes con sus respectivos carros de compra
        Cliente cliente1 = new Cliente("Cliente1", new int[]{2, 3, 5});
        Cliente cliente2 = new Cliente("Cliente2", new int[]{1, 4, 2, 6});
        Cliente cliente3 = new Cliente("Cliente3", new int[]{2, 1});

        // Atender a los clientes uno por uno
        atenderCliente(cajera, cliente1);
        atenderCliente(cajera, cliente2);
        atenderCliente(cajera, cliente3);
    }

    public static void atenderCliente(Cajera cajera, Cliente cliente) {
        long tiempoInicio = System.currentTimeMillis();

        // Procesar la compra del cliente
        cajera.procesarCompra(cliente, tiempoInicio);

        System.out.println("Tiempo total de atención para " + cliente.getNombre() + ": " +
                (System.currentTimeMillis() - tiempoInicio) / 1000 + "seg\n");
    }
}
