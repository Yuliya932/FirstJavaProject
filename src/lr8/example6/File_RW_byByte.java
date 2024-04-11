/*Пример 6. Чтение из одного файла и запись в другой файл данных посимвольно.*/
package lr8.example6;

import java.io.*;

public class File_RW_byByte {
    public static void main(String[] args) throws IOException { //Метод main генерирует исключение
        Reader in=null; // можно сразу записать FileReader in=null;
        Writer out=null; // можно сразу записать FileWriter out =null;
        try {
            in = new FileReader("C:/Users/DearUser3/IdeaProjects/FirstJavaProject/MyFile1.txt"); // файл для чтения
            out= new FileWriter("C:/Users/DearUser3/IdeaProjects/FirstJavaProject/MyFile2.txt", true); // файл для записи; true - разрешено добавление
            // Данные считываются и записываются побайтно, как и для
            // InputStream/OutputStream
            int oneByte; // переменная, в которую считываются данные
            while ((oneByte = in.read()) != -1) {
            // out.write((char)oneByte); // запись с уничтожением ранее существующих данных
                out.append((char)oneByte); // запись с добавлением данных в конец
                System.out.print((char)oneByte);
            }
        } catch (IOException e) {
            System.out.println("Ошибка!!!! ");
        }
        finally{
            in.close();
            out.close();
        } }}
