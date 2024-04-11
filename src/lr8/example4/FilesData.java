/*Пример 4. Создать первый файл на диске и записать в него заданное
количество вещественных чисел. Далее создать второй файл и переписать в него
все числа из первого файла.
Программу составить в соответствии со следующим алгоритмом:
1. Создать новую папку My на диске.
2. В папке создать 1-й файл numIsh.txt.
3. В файл записать через поток числа, вводимые с клавиатуры.
4. В той же папке создать 2-й файл numRez.txt.
5. Последовательно считывая числа из 1-го файла numIsh.txt,
переписать их во второй файл numRez.txt.
6. Закончить.
Более подробно распишем пункт 5 (чтение-запись):
5.1) открыть 1-й поток для чтения из 1-го файла numIsh.txt;
5.2)открыть 2-й поток для записи во 2-й файл numRez.txt;
5.3) пока не конец 1-го файла:
а) считать число из 1-го потока (файла numIsh.txt);
б) записать число во 2-й поток (файл numRez.txt);
в) вывести число на экран;
5.4) дописать остаток данных на диск;
5.5) закрыть 1-й поток;
5.6) закрыть 2-й поток.
*/
package lr8.example4;

import java.io.*;
import java.util.Scanner;

public class FilesData {
    public static void main(String[] args) {
        try{
            //Создание исходного файла numIsh.txt и запись в него чисел типа float
            File f1 = new File("C:/Users/DearUser3/IdeaProjects/FirstJavaProject/numIsh.txt");
            f1.createNewFile();
            Scanner sc = new Scanner(System.in, "cp1251");

            DataOutputStream wr =
                    new DataOutputStream(new FileOutputStream(f1.getAbsolutePath()));
            System.out.println("Сколько вещественных чисел записать в файл?");
            int count = sc.nextInt();
                    System.out.println("Введите числа:");
            for (int i = 0; i < count; i++)
                wr.writeFloat(sc.nextFloat());
            wr.flush();
            wr.close();

            // Создание файла numRez.txt и переписывание в него чисел из numIsh.txt
            File f2=new File("C:/Users/DearUser3/IdeaProjects/FirstJavaProject/numRez.txt");
            f2.createNewFile();

            // поток для чтения из исходного файла numIsh.txt
            DataInputStream rd =
                    new DataInputStream(new FileInputStream(f1.getAbsolutePath()));
            // поток для записи в результирующий файл numRez.txt
            wr = new DataOutputStream(new FileOutputStream(f2.getAbsolutePath()));
            try{
                while(true){
                    float number=rd.readFloat();
                    wr.writeFloat(number);
                    //чтение-запись из одного файла в другой
                    System.out.println(" Число "+ (float)number);
                }
            }catch(EOFException e){}
            wr.flush();
            wr.close();
            rd.close();
        }catch(IOException e){
            System.out.println("End of file");
        }
    }
}



