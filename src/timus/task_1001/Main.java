/*1001. Обратный корень
Ограничение времени: 2.0 секунды
Ограничение памяти: 64 МБ
Эта задача настолько проста, что авторы даже поленились сочинить для нее условие!
Исходные данные
Входной поток содержит набор целых чисел Ai (0 ≤ Ai ≤ 1018), отделённых друг от друга произвольным количеством пробелов и переводов строк. Размер входного потока не превышает 256 КБ.
Результат
Для каждого числа Ai, начиная с последнего и заканчивая первым, в отдельной строке вывести его квадратный корень не менее чем с четырьмя знаками после десятичной точки.*/
package timus.task_1001;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String inputFileName = "src/timus/task_1001/input.txt"; //путь к файлу
        boolean oj = System.getProperty("ONLINE_JUDGE") != null; // true - на сайте тимус, false - запущена локально на ПК

        try {
            BufferedReader bufferedReader =
                    oj ? new BufferedReader(new InputStreamReader(System.in)) :
                            new BufferedReader(new FileReader(inputFileName)); //данные считаются из файла

                String[] ints = new String[20];
                String str;
                 int h = 0;
//                List<Integer> list = new ArrayList<>();
//                list.add(5);
                int words = 0;

                String readLine = "";
                for (int i = 0; ((readLine = bufferedReader.readLine()) != null||(readLine = bufferedReader.readLine()) != ""); i++){
                    if(bufferedReader.readLine()  != null){
                        String[] strings = readLine.split("\\P{Alnum}+");


                        if (strings[i] != null) {

                            for (int j = 0; j < strings.length; j++) {

//                    for (String j : strings ){
//
//                        if(readLine.split("\\s+")!=null) {

//                            String[] strings2[j];
//                            = strings[i];
//
//                            if ((readLine.split("\\P{Alnum}+"))<>"")
//
//                            h = Integer.parseInt(strings2[j]); // считываем, преобразуем
//                            System.out.println(h);

                                System.out.println(strings[j]);
                            }


//                            System.out.println(j);
                            //System.out.println(h);

                            words++;
                        }
                    }

//                        while ((readLine = bufferedReader.readLine()) != null) { //перебираем в цикле каждую строку
//                            if(numberOfFriends == 0){
//                                numberOfFriends = Integer.parseInt(readLine); // считываем, преобразуем
//                                continue;
//
//                            }
//                            if (readLine.contains("+")){ //true - если содержит +, false - если нет
//                                numberOfPairs++;
//                            }
//                        }
//                        String[] array = strings.nextLine().split(" ");
//                        words = words + array.length;
//                        System.out.println(Arrays.toString(strings));
//                        for (int k = 0; k < 20 ; k++){
//                            ints[k] = Integer.parseInt(strings[k]);
//                            ints[k] = Long.parseLong(strings[k]);
                        }

//                    }

//            System.out.println(words);
//            System.out.println(Arrays.toString(ints));

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
