import java.util.Scanner;

// Target Interface
interface PaymentGateway {
    void pay(double amount);
}

// Adaptee
class Razorpay {

    public void makePayment(double amount) {
        System.out.println("Payment Successful using Razorpay");
        System.out.println("Amount Paid: ₹" + amount);
    }
}

// Adapter
class RazorpayAdapter implements PaymentGateway {

    Razorpay razorpay = new Razorpay();

    public void pay(double amount) {
        razorpay.makePayment(amount);
    }
}

// Client
public class AdapterPattern {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Amount: ");
        double amount = sc.nextDouble();

        PaymentGateway payment = new RazorpayAdapter();

        payment.pay(amount);

        sc.close();
    }
}