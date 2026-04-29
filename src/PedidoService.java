public class PedidoService {

    private FacturaService facturaService = new FacturaAdapter();

    public void registrarPedido(Cliente cliente, double monto) {
        System.out.println("Registrando pedido...");

        // Validación
        if (cliente == null || cliente.getNombre().isEmpty()) {
            System.out.println("Error: Cliente inválido");
            return;
        }

        if (monto <= 0) {
            System.out.println("Error: Monto inválido");
            return;
        }

        System.out.println("Pedido validado correctamente");

        // Generación automática de factura
        facturaService.emitirFactura(cliente, monto);
    }
}