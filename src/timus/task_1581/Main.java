/*1581. Работа в команде
Ограничение времени: 1.0 секунды
Ограничение памяти: 64 МБ

Вася написал на бумажке последовательность натуральных чисел и стал диктовать её Пете.
Причём, для краткости, он диктует её так: сначала говорит количество подряд идущих одинаковых чисел,
а затем говорит, что это за числа. Например, последовательность «1 1 2 3 3 3 10 10» он продиктует
как «две единицы, одна двойка, три тройки, две десятки».
Петя же, тоже для краткости, записывает вместо слов числа, которые говорит Вася.
В указанном примере Петя запишет на бумажку: «2 1 1 2 3 3 2 10».
Отработав этот навык, друзья решили ещё потренироваться в программировании
и научить компьютер преобразовывать последовательность Васи в последовательность Пети.
Исходные данные
В первой строке находится целое число N — количество чисел, записанных Васей (1 ≤ N ≤ 1000).
Во второй строке через пробел записаны эти числа. Все числа целые, положительные и не превосходят 10.
Результат
В единственной строке выведите через пробел числа, которые должен был бы записать на бумажке Петя.
Пример
исходные данные
8
1 1 2 3 3 3 10 10

результат
2 1 1 2 3 3 2 10
*/
package timus.task_1581;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        String inputFileName = "src/timus/task_1581/input.txt"; //путь к файлу
        boolean oj = System.getProperty("ONLINE_JUDGE") != null; // true - на сайте тимус, false - запущена локально на ПК

        try {
            BufferedReader bufferedReader =
                    oj ? new BufferedReader(new InputStreamReader(System.in)) :
                            new BufferedReader(new FileReader(inputFileName)); //данные считаются из файла

            String readLine;//можно убрать ="", и в ней будет null

            int numberOfNums = 0; // считываем колво

            ArrayList<String> al = new ArrayList<String>();


            while ((readLine = bufferedReader.readLine()) != null) { //перебираем в цикле каждую строку
                if (numberOfNums == 0) {
                    numberOfNums = Integer.parseInt(readLine); // считываем, преобразуем
                    continue;
                }
                String[] strings = readLine.split(" ");
                int[] ints = new int[strings.length];
                for (String j : strings) {

                    int d = Integer.parseInt(j.toString());

                    for (int i = 0; i < strings.length; i++) {
                        ints[i] = d;
                    }
                }
                int count = 1;
                for (int i = 1; i < strings.length - 1; i++) {
                    count = 1;
                    if(i < 6){
                    if (strings[i - 1].equals(strings[i]) && strings[i].equals(strings[i + 1])) {
                        count = count + 2;
                        i++;
                    } else if (strings[i].equals(strings[i + 1]) && strings[i + 1].equals(strings[i + 2])   ) {
                        count = count + 2;
                        i = i + 2;
                    } else if (strings[i - 1].equals(strings[i])) {
                        count = count + 1;
                    } else if (strings[i].equals(strings[i + 1])) {
                        count = count + 1;
                    } else count = 1;

                    } else if (strings[i - 1].equals(strings[i])) {
                        count = count + 1;
                    } else if (strings[i].equals(strings[i + 1])) {
                        count = count + 1;
                    } else count = 1;

                    System.out.print(count);
                    System.out.print(" ");
                    System.out.print(strings[i]);
                    System.out.print(" ");
                }
            }
    } catch(
    IOException exception){
        exception.printStackTrace();
    }
}
}

