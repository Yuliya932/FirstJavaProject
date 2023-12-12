/*7. Напишите программу, в которой создается одномерный
символьный массив из 10 элементов. Массив заполняется буквами «через
одну», начиная с буквы ' а ': то есть массив заполняется буквами ' а ' , ' с ' , ' е ' ,
' д ' и так далее. Отобразите массив в консольном окне в прямом и обратном
порядке. Размер массива задается переменной*/
package lr3.Example7;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int size = 10;
        char x = 'a';


        char array [];
        array = new char [size];


        for (int i = 0 ; i <= size - 1; i++) {

            array [i] = x++;
            x++;


            System.out.print(array [i] );
        }
        System.out.println("");
        Arrays.sort(array); // Сортировка массива по возрастанию его элементов
        for (int i = size - 1 ; i >= 0; i--) {

            System.out.print(array[i]);
        }



    }
}