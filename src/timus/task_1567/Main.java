/*Стоимость каждой речёвки определяется как сумма стоимостей каждого символа в ней,
а стоимость символов Петя определяет по незатейливой схеме: за каждое свое нажатие на кнопку телефона он берёт по 1 рублю.
Петин телефон не поддерживает T9 и имеет только английскую раскладку:
1 abc
2 def
3 ghi
4 jkl
5 mno
6 pqr
7 stu
8 vwx
9 yz

0 .,!
# _
Символом «_» в таблице обозначен пробел.
Например, чтобы набрать букву «a», надо нажать один раз на «1», букву «k» — два раза на «4», «!» — три раза на «0» и т.д.
Чтобы узнать, какой гонорар он должен получить за рекламную речёвку,
которую в данный момент рассылает, Пете необходимо посчитать её стоимость по этому простому алгоритму.
А поскольку Петя очень занятой и вообще не умеет считать, так как учится на философском факультете, вы, как его самый лучший друг, готовы ему помочь.
Исходные данные
В единственной строке записана рекламная речёвка, состоящая из слов, пробелов, запятых, точек и восклицательных знаков. Все слова состоят из строчных английских букв. В речёвке не более 1000 символов.
Результат
Выведите единственное число — стоимость речёвки в петином понимании.
Пример
исходные данные
pokupaite gvozdi tolko v kompanii gvozdederov i tovarischi!
результат
114
*/
package timus.task_1567;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) {
        String inputFileName = "src/timus/task_1567/input.txt"; //путь к файлу
        boolean oj = System.getProperty("ONLINE_JUDGE") != null; // true - на сайте тимус, false - запущена локально на ПК

        try {
            BufferedReader bufferedReader =
                    oj ? new BufferedReader(new InputStreamReader(System.in)) :
                            new BufferedReader(new FileReader(inputFileName)); //данные считаются из файла

            String readLine;//можно убрать ="", и в ней будет null
            readLine = bufferedReader.readLine();

            int sum = 0;

            String[] strings = readLine.split("");

            for (String j : strings) {

            if (j.contains("a")||j.contains("d")||j.contains("g")
                ||j.contains("j")||j.contains("m")||j.contains("p")
                    ||j.contains("s")||j.contains("v")||j.contains("y")
                    ||j.contains(".")||j.contains(" ") ) { //true - если содержит +, false - если нет
                    sum = sum + 1;
                }
                if (j.contains("b")||j.contains("e")||j.contains("h")
                        ||j.contains("k")||j.contains("n")||j.contains("q")
                        ||j.contains("t")||j.contains("w")||j.contains("z")
                        ||j.contains(",") ) { //true - если содержит +, false - если нет
                    sum = sum + 2;
                }
                if (j.contains("c")||j.contains("f")||j.contains("i")
                        ||j.contains("l")||j.contains("o")||j.contains("r")
                        ||j.contains("u")||j.contains("x")||j.contains("!") ) { //true - если содержит +, false - если нет
                    sum = sum + 3;
                }
            }
                System.out.println(sum);

        } catch (IOException e) {
        }
    }
}
