/*1493. В одном шаге от счастья
Ограничение времени: 1.0 секунды
Ограничение памяти: 64 МБ
Вова купил билет в трамвае 13-го маршрута и сразу посчитал суммы первых трёх цифр
и последних трёх цифр номера билета (номер у билета шестизначный).
Оказалось, что суммы отличаются ровно на единицу.
«Я в одном шаге от счастья», — подумал Вова, — «или предыдущий или следующий билет точно счастливый». Прав ли он?
Исходные данные
В единственной строке записан номер билета.
Номер состоит ровно из шести цифр, среди которых могут быть и нули.
Гарантируется, что Вова умеет считать, то есть суммы первых трёх цифр и последних трёх цифр отличаются ровно на единицу.
Результат
Выведите «Yes», если Вова прав, и «No», если нет.
Примеры
исходные данные	результат
715068
Yes
445219
No
012200
Yes
Замечания
Все трамвайные билеты состоят ровно из шести цифр. Трамвайный билет называется счастливым, если сумма его первых трёх цифр равна сумме его последних трёх цифр.*/
package timus.task_1493;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String inputFileName = "src/timus/task_1493/input.txt"; //путь к файлу
        boolean oj = System.getProperty("ONLINE_JUDGE") != null; // true - на сайте тимус, false - запущена локально на ПК

        try {
            BufferedReader bufferedReader =
                    oj ? new BufferedReader(new InputStreamReader(System.in)) :
                            new BufferedReader(new FileReader(inputFileName)); //данные считаются из файла

            String readLine;//можно убрать ="", и в ней будет null
            String[] strings2;
            int numberOfTiket = 0;

            ArrayList<String> al = new ArrayList<String>();

            while ((readLine = bufferedReader.readLine()) != null) { //перебираем в цикле каждую строку
//                if(numberOfTiket == 0){
                    numberOfTiket = Integer.parseInt(readLine); // считываем, преобразуем
//                    continue;
                System.out.println(numberOfTiket - 1);
//                                    System.out.println(numberOfTiket);
                System.out.println(numberOfTiket + 1);
                int a = numberOfTiket - 1;
//               al.add((String) a);


//                al.add(String)

//                }

//                String[] strings = readLine;
//                String[] strings = readLine.split("");
//                System.out.println(Arrays.toString(strings));

//                for (String j : strings) {
//
//                    if (j.split("\\s+") != null) {
//                        strings2 = j.split("\\P{Alnum}+");
//                        for (String k : strings2) {
//                            try {

//                                double d = Double.parseDouble(strings.toString());
//                                al.add(String.format("%.4f",d));

//                            } catch (Exception e) {
//                            }
                        }
//                    }
//                }
//            }

//            int num = al.size();
//            int pass = 0;
//            for (int i = al.size() - 1; i >= 0; i--) {
//                System.out.println(al.get(i));
//            }

        } catch (IOException e)

        {
            e.printStackTrace();
        }
    }
}
