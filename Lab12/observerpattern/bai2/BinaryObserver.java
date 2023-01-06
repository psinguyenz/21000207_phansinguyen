package observerpattern.bai2;

public class BinaryObserver extends Observer{
    private String binary;

    public BinaryObserver(Subject subject) {
        super(subject);
        subject.attach(this);
    }

    @Override
    public void update() {
        this.binary = convertDecimalToBinary(this.subject.getState());
    }

    private String convertDecimalToBinary(int decimal) {
        String digits = "0123456789ABCDEF";
        if (decimal <= 0) return "0";
        int base = 2;
        String hex = "";
        while (decimal > 0) {
            int digit = decimal % base;
            hex = digits.charAt(digit) + hex;
            decimal = decimal / base;
        }
        return hex;
    }

    @Override
    public String toString() {
        return "Binary Number: " + binary;
    }
}
