/*1585. Пингвины
Ограничение времени: 1.0 секунды
Ограничение памяти: 64 МБ
Программист Денис c детства мечтал побывать в Антарктиде,
но почему-то регулярных рейсов туда нет.
Поэтому Денис все лето изучал Антарктиду с помощью соседнего кинотеатра.
Теперь он знает, что в Антарктиде водится несколько видов пингвинов:
Императорские пингвины (Emperor Penguins) — любители петь;
Малые пингвины (Little Penguins) — любители потанцевать;
Пингвины Макарони (Macaroni Penguins) — любители сёрфинга.
К сожалению, в мультфильмах не было сказано, какой вид пингвинов самый многочисленный.
Денис решил выяснить это: он посмотрел эти мультфильмы еще раз, и каждый раз,
когда видел пингвина, записывал в блокнот название его вида.
Сейчас Денис дал вам блокнот с просьбой выяснить, какой вид пингвинов самый многочисленный.
Исходные данные
В первой строке записано целое число n — количество записей в блокноте (1 ≤ n ≤ 1000).
В каждой из следующих n строк записано по одному виду пингвинов.
Среди видов встречаются только «Emperor Penguin», «Little Penguin» и «Macaroni Penguin».
Результат
Выведите самый популярный вид пингвинов. Гарантируется, что такой вид только один.
Пример
исходные данные
7
Emperor Penguin
Macaroni Penguin
Little Penguin
Emperor Penguin
Macaroni Penguin
Macaroni Penguin
Little Penguin

результат
Macaroni Penguin*/
package timus.task_1585;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) {
        String inputFileName = "src/timus/task_1585/input.txt"; //путь к файлу
        boolean oj = System.getProperty("ONLINE_JUDGE") != null; // true - на сайте тимус, false - запущена локально на ПК

        try {
            BufferedReader bufferedReader =
                    oj ? new BufferedReader(new InputStreamReader(System.in)) :
                            new BufferedReader(new FileReader(inputFileName)); //данные считаются из файла

            String readLine;//можно убрать ="", и в ней будет null

            int numberOfLines = 0; // считываем колво записей

            int emperor = 0;
            int macaroni = 0;
            int little = 0;

            while ((readLine = bufferedReader.readLine()) != null) { //перебираем в цикле каждую строку
                if (numberOfLines == 0) {
                    numberOfLines = Integer.parseInt(readLine); // считываем, преобразуем
                    continue;
                }
                if (readLine.contains("Emperor Penguin") ) { //true - если содержит +, false - если нет
                    emperor ++;
                }
                if (readLine.contains("Macaroni Penguin") ) { //true - если содержит +, false - если нет
                    macaroni++;
                }
                if (readLine.contains("Little Penguin") ) { //true - если содержит +, false - если нет
                    little++;
                }
            }

            if (emperor>macaroni && emperor>little){
                System.out.println("Emperor Penguin");
            } else if (macaroni>emperor && macaroni> little) {
                System.out.println("Macaroni Penguin");
            } else {
                System.out.println("Little Penguin");
            }

        } catch (IOException exception) {
            exception.printStackTrace();
        }
    }
}
