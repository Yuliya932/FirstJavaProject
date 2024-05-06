/*1563. Баяны
Ограничение времени: 1.0 секунды
Ограничение памяти: 64 МБ
Problem illustration
Как известно, в небоскрёбах часто располагаются магазины,
в которые ходят гламурные модницы. Любимое занятие блондинки Анжелы — шоппинг.
И сегодня у нее праздник — поход за покупками в новый небоскрёб Призма.
Для начала она решила обойти там все магазины. Но, как оказалось,
Призма настолько большая, что в ней встречаются магазины разных фирм по нескольку раз.
Каждый раз, когда Анжела видела магазин той же фирмы, что она уже посетила, то произносила: «БАЯН», — и шла дальше.
Сколько раз Анжела сказала «БАЯН», пока обходила все магазины?
Исходные данные
В первой строке записано целое число N — количество магазинов в Призме (1 ≤ N ≤ 1000).
В каждой из следующих N строк записано название магазина — строка из латинских букв и пробелов длиной от 1 до 30.
Известно, что в Призме нет магазинов, названия которых отличаются только регистром.
Результат
Выведите количество магазинов, которые не посетила Анжела.
Пример
исходные данные	результат
12
ESPRIT
Nice Connection
Camelot
Adilisik
Lady and Gentleman City
MEXX
Camelot
Sultanna Frantsuzova
Camaieu
MEXX
Axara
Camelot
3*/
package timus.task_1563;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {

        String inputFileName = "src/timus/task_1563/input.txt"; //путь к файлу
        boolean oj = System.getProperty("ONLINE_JUDGE") != null; // true - на сайте тимус, false - запущена локально на ПК

        ArrayList<String> al = new ArrayList<String>();
        TreeSet<String> ts = new TreeSet<String>();

        try{

            BufferedReader bufferedReader =
                    oj ? new BufferedReader(new InputStreamReader(System.in)):
                            new BufferedReader(new FileReader(inputFileName)); //данные считаются из файла

            String readLine;//можно убрать ="", и в ней будет null

            int numberOfShops = 0; // считываем колво из первой строки

            while ((readLine = bufferedReader.readLine()) != null) { //перебираем в цикле каждую строку
                if (numberOfShops == 0) {
                    numberOfShops = Integer.parseInt(readLine); // считываем, преобразуем
                    continue;
                }
                al.add(readLine);
                ts.add(readLine);
            }

            System.out.println(al.size() - ts.size());

        } catch(IOException exception) {
            exception.printStackTrace();
        }
    }
}
