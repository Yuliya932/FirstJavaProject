/*Пример 2. Прочитать и вывести на экран информацию из трех источников:
файла на диске, интернет-страницы и массива типа byte*/
package lr8.example2;

import java.io.*;
import java.net.URL;
import java.util.Arrays;

public class Primer1 {
    //Метод для чтения данных из потока по байтам с выводом
    public static void readAllByByte(InputStream in) throws IOException {
        while (true) {
            int oneByte = in.read(); //читает 1 байт
            if (oneByte != -1) {//признак отсутствия файла
                System.out.print((char) oneByte);
            } else {
                System.out.print("\n" + "end");
                break;
            }
        }
    }
    public static void main(String[] args) throws IOException {
        try {

            // Создание файла на диске и вывод полного пути
//            File f2 = new File ("C:/Users/DearUser3/IdeaProjects/FirstJavaProject/text.txt");
//            f2.createNewFile();
//            System.out.println("Полный путь: " + f2.getAbsolutePath());

            //С потоком связан файл
            InputStream inFile = new FileInputStream("C:/Users/DearUser3/IdeaProjects/FirstJavaProject/text.txt"); //файл предварительно создан и заполнен данными
            readAllByByte(inFile);
            System.out.print("\n\n\n");
            inFile.close();

            //С потоком связана интернет-страница
            InputStream inUrl = new URL("http://google.com").openStream();
            readAllByByte(inUrl);
            System.out.print("\n\n\n");
            inUrl.close();

            //С потоком связан массив типа byte
            InputStream inArray = new ByteArrayInputStream(new byte[] {1,2,3,7,4,5});
            readAllByByte(inArray);
            System.out.print("\n\n\n");
            inArray.close();

        } catch (IOException e) {

        }
    }
}
