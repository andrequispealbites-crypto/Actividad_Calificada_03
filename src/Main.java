import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("=== SISTEMA DE PEDIDOS ===");

        // Entrada de datos
        System.out.print("Ingrese nombre del cliente: ");
        String nombre = sc.nextLine();

        System.out.print("Ingrese monto de la compra: ");
        double monto = sc.nextDouble();

        Cliente cliente = new Cliente(nombre);
        PedidoService pedidoService = new PedidoService();

        // Registro del pedido (automáticamente genera factura)
        pedidoService.registrarPedido(cliente, monto);

        sc.close();
    }
}