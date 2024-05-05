/*2056. Стипендия
Ограничение времени: 1.0 секунды
Ограничение памяти: 64 МБ
Вот и подошел к концу первый семестр в университете.
Андроид Вася успешно сдал все экзамены и теперь хочет узнать, будет ли у него стипендия.
В университете следующая политика предоставления стипендии.
Если у студента есть тройки, то стипендия ему не выплачивается.
Если студент сдал сессию на одни пятерки, то он получает именную стипендию.
Если студент не получил именную стипендию, и его средний балл не менее 4.5, то он получает повышенную стипендию.
Если студент не получил ни именную, ни повышенную стипендии, и при этом у него нет троек, то он получает обычную стипендию.
Помогите Васе определить, будет ли у него стипендия, и если да, то какая.
Исходные данные
В первой строке записано целое число n — количество экзаменов (1 ≤ n ≤ 10).
В i-й из следующих n строк записано целое число mi — оценка, полученная Васей на i-м экзамене (3 ≤ mi ≤ 5).
Результат
Если у Васи не будет стипендии, выведите «None». Если у него будет обычная стипендия,
выведите «Common», если повышенная — «High», если именнная — «Named».
Примеры
исходные данные	результат
3
5
5
4
High
3
3
3
3
None*/
package timus.task_2056;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) {

        String inputFileName = "src/timus/task_2056/input.txt"; //путь к файлу
        boolean oj = System.getProperty("ONLINE_JUDGE") != null; // true - на сайте тимус, false - запущена локально на ПК

        try {
            BufferedReader bufferedReader =
                    oj ? new BufferedReader(new InputStreamReader(System.in)) :
                            new BufferedReader(new FileReader(inputFileName)); //данные считаются из файла

            String readLine;//можно убрать ="", и в ней будет null
            int numberOfNums = 0; // считываем колво
            String grants="";
            int sum = 0;
            int d;
            while ((readLine = bufferedReader.readLine()) != null) { //перебираем в цикле каждую строку
                if (numberOfNums == 0) {
                    numberOfNums = Integer.parseInt(readLine); // считываем, преобразуем
                    continue;
                }
                String[] strings = readLine.split(" ");
                int[] ints = new int[strings.length];
                for (String j : strings) {
                    d = Integer.parseInt(j.toString());

                    for (int i = 0; i < strings.length; i++) {
                        ints[i] = d;
                        sum = sum + d;
                        if (d==3){
                            grants = "None";
                        }
                    }
                }
            }
            double avg = (double) sum/numberOfNums;

            if("None".equals(grants)){
                System.out.println("None");

            } else if (avg==5){
                System.out.println("Named");
            } else if (avg>=4.5) {
                System.out.println("High");
            } else System.out.println("Common");
            } catch(
                    IOException exception){
                exception.printStackTrace();
            }
        }
    }
