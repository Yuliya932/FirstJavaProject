package lr1_;

import java.util.HashMap;
import java.util.Map;

public class Main {
    private static final int[] digits = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};

    public static void main(String[] args) {
        Map<Character, Integer> charToDigit = new HashMap<>();
        solve(charToDigit, new boolean[10], "SEND", "MORE", "MONEY");
    }

    public static boolean solve(Map<Character, Integer> charToDigit, boolean[] usedDigits, String s1, String s2, String s3) {
        if (charToDigit.size() == 8) {
            int num1 = toNumber(s1, charToDigit);
            int num2 = toNumber(s2, charToDigit);
            int num3 = toNumber(s3, charToDigit);

            if (num1 + num2 == num3) {
                System.out.println(s1 + " + " + s2 + " = " + s3);
                System.out.println(num1 + " + " + num2 + " = " + num3);
                return true;
            }
            return false;
        }

        for (char ch : "SENDMOREY".toCharArray()) {
            if (!charToDigit.containsKey(ch)) {
                for (int digit : digits) {
                    if (!usedDigits[digit]) {
                        charToDigit.put(ch, digit);
                        usedDigits[digit] = true;

                        if (solve(charToDigit, usedDigits, s1, s2, s3)) {
                            return true;
                        }

                        usedDigits[digit] = false;
                        charToDigit.remove(ch);
                    }
                }
                return false;
            }
        }
        return false;
    }

    public static int toNumber(String s, Map<Character, Integer> charToDigit) {
        int number = 0;
        for (char ch : s.toCharArray()) {
            number = number * 10 + charToDigit.get(ch);
        }
        return number;
    }
}


