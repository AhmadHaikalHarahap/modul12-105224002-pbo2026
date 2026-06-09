public class Main {

    public static void main(String[] args) {

        PaymentMethod payment = new CreditCard();
        EmailNotifier notifier = new EmailSystem();
        OrderRepository repository = new OrderRepository();

        OrderService orderService =
                new OrderService(payment, notifier, repository);

        orderService.placeOrder("ORD001", 500000);

        // Contoh refund
        if (payment instanceof Refundable) {
            ((Refundable) payment).refund(100000);
        }

        System.out.println();

        // Ganti metode pembayaran tanpa ubah OrderService
        PaymentMethod voucher = new GiftVoucher();

        OrderService orderService2 =
                new OrderService(voucher, notifier, repository);

        orderService2.placeOrder("ORD002", 200000);
    }
}