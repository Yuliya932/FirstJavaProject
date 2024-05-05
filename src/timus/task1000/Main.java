/*1000. A+B Problem
Ограничение времени: 1.0 секунды
Ограничение памяти: 64 МБ
Вычислите a+b
Исходные данные
a и b
Результат
a+b
Пример
исходные данные	результат
1 5
6
Замечания
Используйте +*/
package timus.task1000;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        String inputFileName = "src/timus/task1000/input.txt"; //путь к файлу
        boolean oj = System.getProperty("ONLINE_JUDGE") != null; // true - на сайте тимус, false - запущена локально на ПК

        try {
            BufferedReader bufferedReader =
                    oj ? new BufferedReader(new InputStreamReader(System.in)) :
                            new BufferedReader(new FileReader(inputFileName)); //данные считаются из файла

            String readLine;//можно убрать ="", и в ней будет null
            String[] strings2;
            int sum = 0;

            ArrayList<String> al = new ArrayList<String>();

            while ((readLine = bufferedReader.readLine()) != null) { //перебираем в цикле каждую строку
                String[] strings =  readLine.split(" ");
                for (String j : strings) {

                    if (j.split(" ") != null) {
                        strings2 = j.split(" ");
                        for (String k : strings2) {

                                int d = Integer.parseInt(k.toString());
                                sum = sum + d;


                        }
                    }
                }
            }
            System.out.println(sum);

        } catch (IOException e) {
        }
    }
}