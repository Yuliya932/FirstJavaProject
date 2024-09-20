package lr2;

import java.util.Scanner;

public class Main {

    // Переведём число из десятичной системы в двоичную
    public static String convertDecimalToBinary(int decimal) {
        int remainder;
        String output = "";
        while (decimal >= 1) {
            remainder = (decimal % 2);
            output = Integer.toString(remainder) + output;
            decimal = decimal / 2;
        }
        return output;
    }

    // Переведём числоиз двоичной в десятичную
    public static int convertBinaryToDecimal(int binaryDigit) {
        int decimal = 0;
        int n = 0;
        int temp = 0;
        while (binaryDigit > 0) {
            temp = binaryDigit % 10;
            decimal += temp * Math.pow(2, n);
            binaryDigit = binaryDigit / 10;
            n++;
        }
        return decimal;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Введите число: ");
        int number = in.nextInt();

        System.out.println("Введите систему счисления своего числа 2 или 10: ");
        int notation = in.nextInt();
        String binary =convertDecimalToBinary(number);

        if (notation == 2) {
            System.out.println(convertBinaryToDecimal(number));
        } if (notation == 10) {
                System.out.println(binary);
            }
    }
}

