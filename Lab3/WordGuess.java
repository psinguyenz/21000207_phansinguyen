import java.util.Scanner;

public class WordGuess {
    public static boolean[] array(String str, char ch, int strLen, boolean[] check) {
        boolean[] array = new boolean[strLen];
        for (int idx = 0; idx < strLen; idx++) {
            array[idx] = check[idx];
        }
        for (int idx = 0; idx < strLen; idx++) {
            if (ch == str.charAt(idx)) {
                array[idx] = true;
            }
        }
        return array;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        final String str = "testing";
        int strLen = str.length();
        int count = 0;
        int trials = 1;
        boolean[] check = new boolean[strLen];
        for (int idx = 0; idx < strLen; idx++) {
            check[idx] = false;
        }
        while (count == 0) {
            System.out.print("Key in one character or your guess word: ");
            String input = in.next();
            if (input.length() == 1) {
                char ch = input.charAt(0);
                check = array(str, ch, strLen, check);
                for (int idx = 0; idx < strLen; idx++) {
                    if (check[idx] == true) {
                        System.out.print(str.charAt(idx));
                    } else {
                        System.out.print("_");
                    }
                }
                System.out.println();
            } else {
                if (input.length() != strLen) {
                    System.out.println("Wrong word!");
                } else {
                    if (input.equals(str)) {
                        System.out.println("Congrastulation!");
                        System.out.println("You got in " + trials + " trials");
                    } else {
                        System.out.println("Wrong word!");
                    }
                }
            }
            trials += 1;
        }
    }
}
