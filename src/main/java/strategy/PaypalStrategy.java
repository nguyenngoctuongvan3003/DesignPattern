package strategy;

public class PaypalStrategy implements PaymentStrategy {
    private String emailId;
    private String password;
    public PaypalStrategy(String emailId, String password) {
        this.emailId = emailId;
        this.password = password;
    }
    @Override
    public void pay(int amount) {
        // TODO Auto-generated method stub
        System.out.println(amount + "paid using Paypal");
    }

    

}
