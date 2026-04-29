public class FacturaAdapter implements FacturaService {

    private LegacyBillingSystem legacySystem = new LegacyBillingSystem();

    @Override
    public void emitirFactura(Cliente cliente, double monto) {
        System.out.println("Generando factura electrónica...");

        try {
            legacySystem.createInvoice(cliente.getNombre(), monto);

            System.out.println(" Factura generada correctamente");
            System.out.println("Cliente: " + cliente.getNombre());
            System.out.println("Monto: S/ " + monto);

        } catch (Exception e) {
            System.out.println(" Error al generar factura: " + e.getMessage());
        }
    }
}