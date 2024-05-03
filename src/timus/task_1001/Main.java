/*1001. Обратный корень
Ограничение времени: 2.0 секунды
Ограничение памяти: 64 МБ
Эта задача настолько проста, что авторы даже поленились сочинить для нее условие!
Исходные данные
Входной поток содержит набор целых чисел Ai (0 ≤ Ai ≤ 1018),
отделённых друг от друга произвольным количеством пробелов и переводов строк.
Размер входного потока не превышает 256 КБ.
Результат
Для каждого числа Ai, начиная с последнего и заканчивая первым,
в отдельной строке вывести его квадратный корень не менее чем с четырьмя знаками после десятичной точки.
2297.0716
936297014.1164
0.0000
37.7757*/
package timus.task_1001;

import java.io.*;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        String inputFileName = "src/timus/task_1001/input.txt"; //путь к файлу
        boolean oj = System.getProperty("ONLINE_JUDGE") != null; // true - на сайте тимус, false - запущена локально на ПК

        try {
            BufferedReader bufferedReader =
                    oj ? new BufferedReader(new InputStreamReader(System.in)) :
                            new BufferedReader(new FileReader(inputFileName)); //данные считаются из файла

            String readLine;//можно убрать ="", и в ней будет null
            String[] strings2;

            ArrayList<String> al = new ArrayList<String>();

            while ((readLine = bufferedReader.readLine()) != null) { //перебираем в цикле каждую строку
                String[] strings = readLine.split("\\r?\\n");

                for (String j : strings) {

                    if (j.split("\\s+") != null) {
                        strings2 = j.split("\\P{Alnum}+");
                        for (String k : strings2) {
                                try {

                                    double d = Double.parseDouble(k.toString());
                                    al.add(String.format("%.4f",Math.sqrt(d)));

                                } catch (Exception e) {
                                }
                        }
                    }
                }
            }

            int num = al.size();
            int pass = 0;
                for (int i = al.size() - 1; i >= 0; i--) {
                    System.out.println(al.get(i));
            }

        } catch (IOException e)

        {
            e.printStackTrace();
        }
    }
}

/*Во-вторых, для исключения нескольких пробельных символов, идущих подряд, следует использовать регулярное выражение .split("\\s+"),
однако оно не исключает знаки пунктуации, которые будут включаться в слова. Можно применять разбиение по другим POSIX-классам символов:

.split("\\P{L}+") - разбить по всем символам, не являющимся буквами (\\P - отрицание)
.split("\\P{Alnum}+") - разбить по всем символам, не являющимися буквами или цифрами
.split("[\\p{Space}\\p{Punct}]+") - разбить по всем символам, являющимися пробельными символами или знаками пунктуации*/
