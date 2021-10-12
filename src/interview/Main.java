package interview;

import java.util.Arrays;

class Main {
    public static void main(String[] args) {
//         System.out.println("Sum = "+sumOfAnyNumber(5));
//        System.out.println("Binary = " + toBinary(5));
//        System.out.println("REPLACE 0 AND 1 IN BINARY AND TO DECIMAL = "+Integer.parseInt(replaceDigit(toBinary(5)), 2));
//        System.out.println("\n=============================");
//        System.out.println("SWAP TO DIGIT AND TO DECIMAL = " + Integer.parseInt(swapInNDigit(toBinary(5)), 2));
        String name = "Mausam";//012345
        System.out.println(name.toCharArray().length);
        System.out.println(name.length());
        System.out.println(name.substring(3,6));
    }

    private static String swapInNDigit(String toBinary) {

        String[] split = toBinary.split("(?<=\\G.{2})");
        for (int i = 0; i < split.length; i++) {
            StringBuilder sb = new StringBuilder(split[i]);
            split[i] = new String(sb.reverse());

        }
        ;

        String s = new String(Arrays.toString(split));

        s = s.replace("[", "");
        s = s.replace("]", "");
        s = s.replace(",", "");
        s = s.replace(" ", "");
        System.out.println("CHANGED BITS = " + s);
        return s;
    }

    private static String replaceDigit(String toBinary) {
        StringBuilder builder = new StringBuilder(toBinary);
        for (int i = 0; i < toBinary.length(); i++) {
            if (toBinary.charAt(i) == '0') {
                builder.setCharAt(i, '1');
            } else {
                builder.setCharAt(i, '0');
            }
        }

        System.out.println("REPLACED BITS = " + builder);
        return new String(builder);
    }

    private static String toBinary(int number) {
        String binary = Integer.toBinaryString(number);
        int count = binary.length();
        for (int i = 0; i < (8 - count); i++) {
            binary = "0" + binary;
        }

        System.out.println("ORIGINAL BITS = " + binary);
        return binary;
    }

    private static int sumOfAnyNumber(int number) {
        int sum = 0;
        for (int i = 0; i <= number; i++) {
            sum = sum + i;
        }
        return sum;
    }
}