/*10. Напишите программу со статическим методом, аргументом которому передается
произвольное количество целочисленных аргументов. Результатом метод возвращает
массив из двух элементов: это значения наибольшего и наименьшего значений среди
аргументов, переданных методу.
*/
package lr6.example10;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int[] arrayInt = getMaxAndMinValue (10012, 2345, 526035, 18000, 25, 56);
        System.out.println(Arrays.toString(arrayInt));
    }

    public static int[] getMaxAndMinValue( int ... v){
        Arrays.sort(v);

        int[] arrayInt = new int[2];

        arrayInt[0]= v[v.length-1];
        arrayInt[1]= v[0];

        return arrayInt;
    }
}
