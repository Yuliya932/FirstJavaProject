/*7. Напишите программу со статическим методом, аргументом которому передастся
символьный массив, а результатом возвращается ссылка на целочисленным массив,
состоящий из кодов символов из массива- аргумента.*/
package lr6.example7;

public class Test {
    static int[] charsToInts (char[] ch) {
        int[] result = new int[ch.length];
        for (int i = 0; i < ch.length; i++) {
            result[i] = (int) ch[i];
        }

        return result;
    }

}
