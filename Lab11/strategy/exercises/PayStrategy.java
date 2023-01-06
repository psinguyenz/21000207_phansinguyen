package designpattern.strategy.exercises;

public interface PayStrategy {
    boolean pay(int paymentAmount);
    void collectPaymentDetails();
}
