/*Пример 1. Создание файлов и папок*/
package lr8.example1;

import java.io.File;

public class KlassFile1 {
    public static void main(String[] args) {
        try{
            // Создание файла в текущей папке (где расположен файл KlassFile1.java
            File fl = new File("MyFile.txt"); // это имя нового файла
            fl.createNewFile();
            if(fl.exists()){
                System.out.println("Создан!!!");
                System.out.println("Полный путь 1: " + fl.getAbsolutePath());
            }
            // Создание файла на диске Е и вывод полного пути
            File f2 = new File ("E:\\MyFile2.txt");
            f2.createNewFile();
            System.out.println("Полный путь 2: " + f2.getAbsolutePath());

            // Создание нескольких вложенных папок
            File f3 = new File ("E:\\Papka2\\Papka3");
            f3.mkdirs();
            System.out.println("Полный путь 3: " + f3.getAbsolutePath());

        } catch (Exception e) {
            System.out.println("Ошибка!!!" + e);
        }
    }
}
