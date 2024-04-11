/*Пример 10. Выполнить чтение из одного файла и запись в дру- гой
файл с использованием класса PrintWriter.
PrintWriter позволяет в качестве параметра принимать выходной
поток System.out и осуществлять вывод на консоль. При этом он работает намного быстрее, чем System.out.println().

*/
package lr8.example10;

import java.io.*;

public class Buf_RW_2 {
    public static void main(String[] args) {
        BufferedReader br = null;
        PrintWriter out = null;
        try {
// Создание потоков
            br = new BufferedReader(
                    new InputStreamReader(
                            new FileInputStream("C:/Users/DearUser3/IdeaProjects/FirstJavaProject/MyFile1.txt"),"cp1251"));
            //PrintWriter
                    out = new PrintWriter("C:/Users/DearUser3/IdeaProjects/FirstJavaProject/MyFile2.txt","cp1251");
// Переписывание информации из одного файла в другой
            int lineCount = 0;
            String s;
            while ((s = br.readLine()) != null) {
                lineCount++;
                out.println(lineCount + ": " + s);
            }
        } catch (IOException e) {
            System.out.println("Ошибка !!!!!!!!"); }
        finally{
            //br.close();
            out.flush();
            out.close();
        }}
}

/*Представленный ниже фрагмент кода демонстрирует работу
PrintWriter с системным выходным потоком:
…
PrintWriter out = new PrintWriter(System.out);
int lineCount = 0;
String s;
// Вывод информации из файла на монитор
while ((s = br.readLine()) != null)
{
lineCount++;
out.println(lineCount + ": " + s);
}
*/
