package lr2_1_6;

public class DecimalToBinaryCustom {
    public static void main(String[] args) {
        double number = 0.03584;
        System.out.println("Decimal: " + number);
        System.out.println("Binary: " + convertToBinary(number));
    }

    public static String convertToBinary(double number) {
        int sign = (number < 0) ? 1 : 0;
        number = Math.abs(number);

        int integerPart = (int) number;
        double fractionalPart = number - integerPart;

        String binaryInteger = Integer.toBinaryString(integerPart);
        StringBuilder binaryFractional = new StringBuilder();

        while (fractionalPart != 0 && binaryFractional.length() < 100) {
            fractionalPart *= 2;
            int digit = (int) fractionalPart;
            binaryFractional.append(digit);
            fractionalPart -= digit;
        }

        String mantissa = (binaryInteger + binaryFractional).substring(1, 13);
        int exponent = binaryInteger.length() - 1;
        int exponentBias = 4;
        int biasedExponent = exponent + exponentBias;
        String binaryExponent = String.format("%4s", Integer.toBinaryString(biasedExponent)).replace(' ', '0');

        return String.format("Mantissa Sign: %d, Mantissa: %s, Exponent Sign: %d, Exponent: %s",
                (number < 0) ? 1 : 0, mantissa.substring(4,12),(biasedExponent < 0) ? 0 : 1, binaryExponent);
    }
}
