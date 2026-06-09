public class OrderService {

    private PaymentMethod paymentMethod;
    private EmailNotifier notifier;
    private OrderRepository repository;

    public OrderService(
            PaymentMethod paymentMethod,
            EmailNotifier notifier,
            OrderRepository repository) {

        this.paymentMethod = paymentMethod;
        this.notifier = notifier;
        this.repository = repository;
    }

    public void placeOrder(String orderId, double amount) {

        repository.saveOrder(orderId);

        paymentMethod.pay(amount);

        notifier.sendEmail(
                "Pesanan " + orderId + " berhasil dibuat.");

        System.out.println("Order selesai diproses");
    }
}