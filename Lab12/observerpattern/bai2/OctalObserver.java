package observerpattern.bai2;

public class OctalObserver extends Observer{
    private String octal;

    public OctalObserver (Subject subject) {
        super(subject);
        subject.attach(this);
    }

    @Override
    public void update() {
        this.octal = convertDecimalToOctal(this.subject.getState());
    }

    private String convertDecimalToOctal(int decimal) {
        String digits = "0123456789ABCDEF";
        if (decimal <= 0) return "0";
        int base = 8;
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
        return "Octal Number: " + octal;
    }
}
