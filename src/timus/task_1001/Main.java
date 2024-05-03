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

            while ((readLine = bufferedReader.readLine()) != null) { //перебираем в цикле каждую строку
                String[] strings = readLine.split("\\r?\\n");
//                String[] strings00;
                for (String j : strings) {
//                    strings00[]=strings[];

                    if (j.split("\\s+") != null) {
                        strings2 = j.split("\\P{Alnum}+");
                        for (String k : strings2) {
                                try {
//                                     System.out.println(Double.parseDouble(k.toString()));
                                    double d = Double.parseDouble(k.toString());
//                                    double a =  Math.round( Math.sqrt(d)*10000)/10000.0000f;
//                                    double a =   (Math.sqrt(d)*10000))/10000;
//                                     String b = "%f!"+ (a)f;
                            System.out.println(String.format("%.4f",Math.sqrt(d)));

                                } catch (Exception e) {
                                }

//                            int m = 0;
//                            double[] array = new double[strings2.length];
//                            array[m]=Double.parseDouble(k.toString());
//                            m++;

//
//                            double[] array;
//                            array[m] = Double.parseDouble(k.toString());
//                            m++;
//                            double d = Double.parseDouble(k.toString());
//                            long a = (long)Math.round(Math.sqrt(d*10000));
//                            System.out.println(a/10000);

//                                    System.out.println(a.format("%.4f%n",(double)a/10000));
//                            System.out.println(array);
                        }

                    }

                }


            }








//            Scanner in = new Scanner(System.in);
//            PrintWriter out = new PrintWriter(System.out);
//
//            double[] al = new double[20];
//            int i = 0;
//            while(in.hasNextDouble()){
//                al[i++] = in.nextDouble();
//            }
//
//            for(;i>0;i++){
//                long i1 = (long)Math.round(Math.sqrt(al[i-1])*10000);
//                out.format("%.4f%n",(double)i1/10000);
//            }
//            out.flush();
//            in.close();




//                String[] ints = new String[20];
//                String str;
//                 int h = 0;
////                List<Integer> list = new ArrayList<>();
////                list.add(5);
//                int words = 0;
//
//                String readLine = "";
//
//            while (bufferedReader.readLine() != null){
//
//
//                for (int i = 0; ((readLine = bufferedReader.readLine()) != null); i++) {
//                    if (bufferedReader.readLine() != null) {
//                        String[] strings = readLine.split("\\s+");
//
//
//                        if (strings[i] != null) {
//
//                            for (int j = 0; j < strings.length; j++) {
//
////                    for (String j : strings ){
////
////                        if(readLine.split("\\s+")!=null) {
//
////                            String[] strings2[j];
////                            = strings[i];
////
////                            if ((readLine.split("\\P{Alnum}+"))<>"")
////
////                            h = Integer.parseInt(strings2[j]); // считываем, преобразуем
////                            System.out.println(h);
//
//                                System.out.println(strings[j]);
//                            }
//
//
////                            System.out.println(j);
//                            //System.out.println(h);
//
//                            words++;
//                        }
//                    }
//
////                        while ((readLine = bufferedReader.readLine()) != null) { //перебираем в цикле каждую строку
////                            if(numberOfFriends == 0){
////                                numberOfFriends = Integer.parseInt(readLine); // считываем, преобразуем
////                                continue;
////
////                            }
////                            if (readLine.contains("+")){ //true - если содержит +, false - если нет
////                                numberOfPairs++;
////                            }
////                        }
////                        String[] array = strings.nextLine().split(" ");
////                        words = words + array.length;
////                        System.out.println(Arrays.toString(strings));
////                        for (int k = 0; k < 20 ; k++){
////                            ints[k] = Integer.parseInt(strings[k]);
////                            ints[k] = Long.parseLong(strings[k]);
//                }
//            }

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
