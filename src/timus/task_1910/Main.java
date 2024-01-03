package timus.task_1910;

import java.io.*;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {

        String inputFileName = "src/timus/task_1910/input.txt"; //путь к файлу
        boolean oj = System.getProperty("ONLINE_JUDGE") != null; // true - на сайте тимус, false - запущена локально на ПК

        BufferedReader bufferedReader =
                oj ? new BufferedReader(new InputStreamReader(System.in)):
                        new BufferedReader(new FileReader(inputFileName)); //данные считаются из файла

        PrintWriter out = new PrintWriter(System.out);

        int size = Integer.parseInt(bufferedReader.readLine());

        String[] strings = bufferedReader.readLine().split( " ");

        int[] intsAfter = new int[size - 2]; //суммарная сила поля возле трёх подряд идущих секций стены

        for( int i = 0; i< intsAfter.length; i++){
            intsAfter[i] = Integer.parseInt(strings[i])+
                    Integer.parseInt(strings[i+1]) +
                    Integer.parseInt(strings[i+2]);
        }

        int[] ints = Arrays.copyOf(intsAfter, intsAfter.length);
        Arrays.sort(intsAfter);

        int firstValue = intsAfter [intsAfter.length - 1];

        for (int i = 0; i< intsAfter.length; i++){
            if (ints [i] == firstValue){
                out.println(firstValue + " " + (i+2));
                break;
            }
        }
        out.flush();
    }
}
