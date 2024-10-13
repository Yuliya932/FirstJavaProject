package lr2_1_6;

public class Main {
    private static final String digits = "0123456789ABCDEF";
    public static void main(String[] args) {
//        System.out.println(987.116 + " -> " + convertDecimalToAnything(987.116, 2, 5));
//        System.out.println(219 + " -> " +convertDecimalToAnything(219, 2));
        System.out.println(ParseNumberToNormalForm(0.03584, 8,  4));
    }
    public static String ParseNumberToNormalForm(double num, int countMantis,  int numOfrasryd)
    {
        String binDigit = convertDecimalToAnything(num, 2, 10);
        String binDigitFull = "";
        int order = 0;
        for(int i = 0; i < binDigit.length(); i++)
        {
            char currChar = binDigit.charAt(i);
            if(currChar == ',')
            {
                order = i;
                continue;
            }
            binDigitFull += binDigit.charAt(i);
            if(binDigitFull.length() == countMantis) break;
        }
        if(binDigitFull.length() < countMantis)
        {
            binDigitFull ="0".repeat(8-binDigitFull.length());
        }
        //return num<0?"1." : "0." + binDigitFull + " " + ;
        return binDigitFull + " " + ParseOrderToNormalForm(order, numOfrasryd);
    }
    public static String ParseOrderToNormalForm(int num, int numOfrasryd)
    {
        String binDigit = convertDecimalToAnything(num, 2);
        String binDigitFull = "";
        for(int i = 0; i < binDigit.length(); i++)
        {
            binDigitFull += binDigit.charAt(i);
            if(binDigitFull.length() == numOfrasryd) break;
        }
        if(binDigitFull.length() < numOfrasryd)
        {
            binDigitFull ="0".repeat(numOfrasryd-binDigitFull.length()) + binDigitFull;
        }
        return binDigitFull;
    }
    public static String convertDecimalToAnything(int decimalDigit, int systemIndex) {
        int remainder;
        String output = "";
        while (decimalDigit > 0) {
            remainder = (decimalDigit % systemIndex);
            output = Integer.toString(remainder) + output;
            decimalDigit = decimalDigit / systemIndex;
        }
        return output;
    }
    public static String convertDecimalToAnything(double decimalDigit, int systemIndex, int accuracy) {
        int intPart = (int)decimalDigit;
        double dPart = decimalDigit - intPart;
        double remainder = dPart;
        String output = "";
        for (int i = 0; i < accuracy; i++)
        {
            remainder *= systemIndex;
            if(remainder < 1)
            {
                output += 0;
            }
            else
            {
                output += 1;
                remainder -= 1;
            }

        }
        return convertDecimalToAnything(intPart, systemIndex) + "," + output;
    }

}
