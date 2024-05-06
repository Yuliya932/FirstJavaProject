/*1545. Иероглифы
Ограничение времени: 1.0 секунды
Ограничение памяти: 64 МБ
Исходные данные
В первой строке находится количество иероглифов в справочнике Сергея N (1 ≤ N ≤ 1000).
В следующих N строках содержатся последовательности латинских символов из справочника,
соответствующие японским иероглифам, по одной последовательности в строке.
Каждая такая последовательность состоит из двух строчных букв латинского алфавита.
В следующей строке содержится введенная Вовой буква.
Результат
Выведите список иероглифов из справочника, которые начинаются на введенный Вовой символ,
по одному в строке в любом порядке. Если таких иероглифов нет, то ничего выводить не надо.
Пример
исходные данные	результат
6
na
no
ni
ki
ka
ku
k
результат
ka
ki
ku
*/
package timus.task_1545;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        String inputFileName = "src/timus/task_1545/input.txt"; //путь к файлу
        boolean oj = System.getProperty("ONLINE_JUDGE") != null; // true - на сайте тимус, false - запущена локально на ПК

        int n = 0;
        int a = 0;
        ArrayList<String> al = new ArrayList<String>();

        try{

            BufferedReader bufferedReader =
                    oj ? new BufferedReader(new InputStreamReader(System.in)):
                            new BufferedReader(new FileReader(inputFileName)); //данные считаются из файла

            String readLine;//можно убрать ="", и в ней будет null

            int numberOfHieroglyphs = 0; // считываем колво из первой строки


            while ((readLine = bufferedReader.readLine()) != null) { //перебираем в цикле каждую строку
                if (numberOfHieroglyphs == 0) {
                    numberOfHieroglyphs = Integer.parseInt(readLine); // считываем, преобразуем
                    n = numberOfHieroglyphs;
                    continue;
                }
                    al.add(readLine);
            }

            for (int i = 0; i<n; i++) {

                if (al.get(i).contains(al.get(numberOfHieroglyphs))) { //true - если содержит +, false - если нет
                    a = a + 1;
                    System.out.println(al.get(i));
                }
            }

            } catch(IOException exception) {
            exception.printStackTrace();
        }
    }
}
