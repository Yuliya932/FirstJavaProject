/*1263. Выборы
Ограничение времени: 1.0 секунды
Ограничение памяти: 64 МБ
Грядут очередные выборы. Снова все заборы оклеены листовками, почтовые ящики забиты макулатурой, с экранов телевизоров на нас взирают мордатые дядьки, обещающие сделать нашу жизнь лучше… А программист Васечкин снова завален работой. Необходимо написать программу, которая облегчит подсчет голосов избирателей.
Исходные данные
Первая строка содержит целые числа N — число кандидатов (1 ≤ N ≤ 10000) и M — число избирателей, принявших участие в выборах (1 ≤ M ≤ 10000). Далее следуют M строк, в каждой из которых находится номер кандидата, за которого проголосовал избиратель. Кандидаты пронумерованы целыми числами от 1 до N.
Результат
Выведите N строк, в i-й строке должен быть указан процент избирателей, проголосовавших за i-го кандидата (с точностью до двух знаков после десятичной точки).
Пример
исходные данные
3 6
1
2
3
2
1
1
результат
50.00%
33.33%
16.67%*/
package timus.task_1263;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        String inputFileName = "src/timus/task_1263/input.txt"; //путь к файлу
        boolean oj = System.getProperty("ONLINE_JUDGE") != null; // true - на сайте тимус, false - запущена локально на ПК

        try {
            BufferedReader bufferedReader =
                    oj ? new BufferedReader(new InputStreamReader(System.in)) :
                            new BufferedReader(new FileReader(inputFileName)); //данные считаются из файла

            String readLine;//можно убрать ="", и в ней будет null
            int numberOfNums = 0; // считываем колво
            String grants="";
            int sum = 0;
            int n = 1;
            int d=0;
            int s;
            int cand1=0;
            int cand2=0;
            int cand3 = 0;
            String[] data;
            String[] data2;
            int[] dat = new int[2];
            int[] cands = new int [n]; //массив по количесву кандидатов
            ArrayList<String> al = new ArrayList<String>();

            while ((readLine = bufferedReader.readLine()) != null) { //перебираем в цикле каждую строку
                if (d == 0) {
                    data = readLine.split(" ");
//                    numberOfNums= readLine.split(" ");
//                    for (String h : data) {
                        for (int i =0; i<2; i++){
//                        numberOfNums=Integer.parseInt(h.toString());
                        d = Integer.parseInt(data.toString()); // считываем, преобразуем
                        System.out.println("d " +d);
//                        for (int i = 0; i < dat.length; i++) {
//                        n=Integer.parseInt(data[0]); //число кандидатов
//                        m=Integer.parseInt(data[1]); //число избирателей
                            dat[i] = d;
//                        }
                    }
                    continue;

                }
                String[] strings = readLine.split(" ");
                int[] ints = new int[strings.length];
                for (String j : strings) {
                   s = Integer.parseInt(j.toString());

//                    for (int i = 0; i < strings.length; i++) {
//                        cands[s-1] = cands[s-1] +1;
//                    }
                    System.out.println(Arrays.toString(strings));
                }
            }
            System.out.println(Arrays.toString(dat));


//            System.out.println(Arrays.toString(cands));

//            double avg = (double) sum/numberOfNums;
//
//            if("None".equals(grants)){
//                System.out.println("None");
//
//            } else if (avg==5){
//                System.out.println("Named");
//            } else if (avg>=4.5) {
//                System.out.println("High");
//            } else System.out.println("Common");
        } catch(
                IOException exception){
            exception.printStackTrace();
        }
    }
}
