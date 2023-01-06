public class FibonacciInt {
    public static void FibonacciInt() {
        int count = 0;
        int value = 2;
        int num1 = 1;
        int num2 = 1;
        while (count == 0) {
            int output = num1 + num2;
            if (output >= Integer.MAX_VALUE && output <= Integer.MIN_VALUE) {
                System.out.println("The factorial of " + value + "is out of range");
                count += 1;
            } else {
                System.out.println("The factorial of " + value + output);
            }
            num1 = num2;
            num2 = output;
        }
    }

    public static void main(String[] args) {
        FibonacciInt();
    }
}
