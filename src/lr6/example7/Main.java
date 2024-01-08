/*7. Напишите программу со статическим методом, аргументом которому передастся
символьный массив, а результатом возвращается ссылка на целочисленным массив,
состоящий из кодов символов из массива- аргумента.*/
package lr6.example7;

import java.util.Arrays;

import static lr6.example7.Test.charsToInts;

public class Main {
    public static void main(String[] args) {

        char[] ch1 = {'a', 'b', 'c','п', 'р', 'и', 'в', 'е', 'т', '!'};
        int[] result = charsToInts(ch1);
        System.out.println(Arrays.toString(result));
    }
}
