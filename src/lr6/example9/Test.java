/*9. Напишите программу со статическим методом, аргументом которому передается
одномерный символьный массив.
В результате вызова метода элементы массива попарно
меняются местами: первый — с последним, второй — с предпоследним и так далее*/
package lr6.example9;

public class Test {

    static char[] charsSort (char[] ch) {
        char[] result = new char[ch.length];
        for (int i = 0,j =ch.length-1 ; i < ch.length; i++, j--) {
            result[i] = ch[j];
        }

        return result;
    }
}
