/*2023. Дональд-почтальон
Ограничение времени: 1.0 секунды
Ограничение памяти: 64 МБ

Дональд Дак работает почтальоном в студии Диснея,
доставляя письма детей со всего мира своим друзьям — героям мультфильмов.
В студии есть три шкафа для писем, в каждом из которых девять секций.
Все секции подписаны именами адресатов. Шкафы стоят в ряд так, как показано на рисунке снизу.
Сегодня Дональд принёс n писем. Исходно он стоит у самого левого шкафа,
и для перехода к соседнему шкафу ему нужно сделать один шаг.
Сколько шагов он сделает, пока не разложит все письма,
если будет раскладывать их в том порядке, в котором они лежат в стопке?
Исходные данные
В первой строке записано целое число n — количество писем (1 ≤ n ≤ 1 000).
В следующих n строках перечислены адресаты писем в том порядке, в котором они лежат в стопке у Дональда.
Результат
Выведите количество шагов, которое нужно сделать Дональду, чтобы разложить все письма по ящикам.
Пример
исходные данные	результат
4
Aurora
Tiana
Ariel
Mulan
5
*/
package timus.task_2023;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) {

        String inputFileName = "src/timus/task_2023/input.txt"; //путь к файлу
        boolean oj = System.getProperty("ONLINE_JUDGE") != null; // true - на сайте тимус, false - запущена локально на ПК

        try {
            BufferedReader bufferedReader =
                    oj ? new BufferedReader(new InputStreamReader(System.in)) :
                            new BufferedReader(new FileReader(inputFileName)); //данные считаются из файла

            String readLine;//можно убрать ="", и в ней будет null

            int numberOfLetters = 0; // считываем колво писем

            int loker = 1; //номер шкафа, у которго стоит Дональд
            int prevLoker = 1;
            int result = 0; // чтобы посчитать результат

            while ((readLine = bufferedReader.readLine()) != null) { //перебираем в цикле каждую строку
                if (numberOfLetters == 0) {
                    numberOfLetters = Integer.parseInt(readLine); // считываем, преобразуем
                    continue;
                }
                if (readLine.contains("Alice") || readLine.contains("Ariel") || readLine.contains("Aurora")
                        || readLine.contains("Phil") || readLine.contains("Peter") || readLine.contains("Olaf")
                        || readLine.contains("Phoebus") || readLine.contains("Ralph") || readLine.contains("Robin")) { //true - если содержит +, false - если нет

                    prevLoker = loker;
                    loker = 1;
                    result = result + Math.abs(loker - prevLoker);
                }
                if (readLine.contains("Bambi") || readLine.contains("Belle") || readLine.contains("Bolt")
                        || readLine.contains("Mulan") || readLine.contains("Mowgli") || readLine.contains("Mickey")
                        || readLine.contains("Silver") || readLine.contains("Simba") || readLine.contains("Stitch")) { //true - если содержит +, false - если нет

                    prevLoker = loker;
                    loker = 2;
                    result = result + Math.abs(loker - prevLoker);
                }
                if (readLine.contains("Dumbo") || readLine.contains("Genie") || readLine.contains("Jimini")
                        || readLine.contains("Kuzko") || readLine.contains("Kida") || readLine.contains("Kenai")
                        || readLine.contains("Tanzan") || readLine.contains("Tiana") || readLine.contains("Winnie")) { //true - если содержит +, false - если нет

                    prevLoker = loker;
                    loker = 3;
                    result = result + Math.abs(loker - prevLoker);
                }
            }
            System.out.println(result);
        } catch (IOException exception) {
            exception.printStackTrace();
        }
    }
}
