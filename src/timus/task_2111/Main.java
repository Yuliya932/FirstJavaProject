/*2111. Платон
Ограничение времени: 1.0 секунды
Ограничение памяти: 256 МБ
Молодой и амбициозный управляющий транспортной компании Платон
получил крупный заказ на доставку товаров из столицы сразу в n городов страны.
Между каждым городом и столицей проложена дорога. Других дорог в стране нет.
Длина дороги от столицы до города с номером i равна di километров.
По иронии судьбы, в этот же город компания должна доставить ровно di тонн груза.
Грузовик Платона загружается один раз в столице.
Затем Платон начинает процесс доставки грузов.
Конечно же, Платон способен перемещаться только по дорогам.
Он может посещать города в любом порядке, оставляя в них часть груза.
В стране действует система налогообложения, и для перевозки m тонн товара
по дороге длиной l километров требуется заплатить в казну m × l рублей.
Помогите Платону рассчитать минимальный размер налогов, который компания
должна заплатить для успешной доставки всех товаров.
Исходные данные
В первой строке дано целое число n (1 ≤ n ≤ 105)  — количество городов,
в которые нужно доставить товар. Во второй строке даны n целых чисел разделённых пробелом,
i-тое из которых di (1 ≤ di ≤ 104)  — длина дороги в город i.
Результат
В единственной строке выведите минимальный размер налога, который заплатит компания.
Пример
исходные данные	результат
3
1 2 3
36*/
package timus.task_2111;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        String inputFileName = "src/timus/task_2111/input.txt"; //путь к файлу
        boolean oj = System.getProperty("ONLINE_JUDGE") != null; // true - на сайте тимус, false - запущена локально на ПК

        try{

            BufferedReader bufferedReader =
                    oj ? new BufferedReader(new InputStreamReader(System.in)):
                            new BufferedReader(new FileReader(inputFileName)); //данные считаются из файла

            String readLine;//можно убрать ="", и в ней будет null

            int numberOfCities = 0; // считываем колво городов из первой строки
            int weight = 0; // считываем тонн
            int sum = 0;
            int i = 0;

            while ((readLine = bufferedReader.readLine()) != null) { //перебираем в цикле каждую строку
                if (numberOfCities == 0) {
                    numberOfCities = Integer.parseInt(readLine); // считываем, преобразуем
                    continue;
                }
                int[] ints = new int[numberOfCities];
                String[] strings = readLine.split(" ");
                for (String j : strings) {
                    int d = Integer.parseInt(j.toString());
                    weight = weight + d;
                    ints[i] = d;
                    i++;
                }
                Arrays.sort(ints);

                for (i = numberOfCities; i > 0; i--) {
                    sum = sum + weight * ints[i - 1];
                    weight = weight - i;
                    sum = sum + weight * i;
                }
            }
            System.out.println(sum);
        } catch(IOException exception) {
            exception.printStackTrace();
        }
    }
}

