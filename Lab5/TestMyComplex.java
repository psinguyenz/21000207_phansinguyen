package mymatha;
import java.util.*;
public class TestMyComplex {
    public static void main (String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter complex number 1 (real and imaginary part): ");
        double real1 = sc.nextDouble();
        double img1 = sc.nextDouble();
        MyComplex number1 = new MyComplex(real1, img1);
        System.out.print("Enter complex number 2 (real and imaginary part): ");
        double real2 = sc.nextDouble();
        double img2 = sc.nextDouble();
        MyComplex number2 = new MyComplex(real2, img2);
        System.out.println("Number 1 is: (" + number1.toString() + ")");
        System.out.print("(" + number1.toString() + ")");
        if (number1.isReal() == true) {
            System.out.println(" is a pure real number");
        }
        else {
            System.out.println(" is NOT a pure real number");
        }
        System.out.print("(" + number1.toString() + ")");
        if (number1.isImaginary() == true) {
            System.out.println(" is a pure imaginary number");
        }
        else {
            System.out.println(" is NOT a pure imaginary number");
        }
        System.out.println();
        System.out.println("Number 2 is: (" + number2.toString() + ")");
        System.out.print("(" + number2.toString() + ")");
        if (number2.isReal() == true) {
            System.out.println(" is a pure real number");
        }
        else {
            System.out.println(" is NOT a pure real number");
        }
        System.out.print("(" + number2.toString() + ")");
        if (number2.isImaginary() == true) {
            System.out.println(" is a pure imaginary number");
        }
        else {
            System.out.println(" is NOT a pure imaginary number");
        }
        System.out.println();
        System.out.print("(" + number1.toString() + ")");
        if (number1.equals(number2)) {
            System.out.print(" is equal to ");
        }
        else {
            System.out.print(" is NOT equal to ");
        }
        System.out.println("(" + number2.toString() + ")");
        System.out.print("(" + number1.toString() + ")");
        System.out.print(" + ");
        System.out.print("(" + number2.toString() + ")");
        System.out.print(" = ");
        MyComplex sum = new MyComplex();
        sum = number1.addNew(number2);
        System.out.println("(" + sum.toString() + ")");
    }
}
