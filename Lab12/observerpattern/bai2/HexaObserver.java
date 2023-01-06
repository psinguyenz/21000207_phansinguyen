package observerpattern.bai2;

public class HexaObserver extends Observer{
    private String hexa;

    public HexaObserver (Subject subject) {
        super(subject);
        subject.attach(this);
    }

    @Override
    public void update() {
        this.hexa = convertDecimalToHexa(this.subject.getState());
    }

    private String convertDecimalToHexa(int decimal) {
        String digits = "0123456789ABCDEF";
        if (decimal <= 0) return "0";
        int base = 16;
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
        return "Hexa number: " + hexa;
    }
}
