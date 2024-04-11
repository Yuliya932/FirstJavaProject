/*Задание 2. Создать проект, позволяющий из одного, предварительно
созданного программными средствами файла, переписать данные,
соответствующие условию - в исходном файле содержится две строки в
формате UTF-8 и 5 чисел типа double. В результирующий файл переписать
вторую строку и положительные числа.*/
package lr8.primer2;
import java.io.File;
import java.io.IOException;

public class Test {
    public static void main(String[] args) throws IOException {
        try {

            // Создание файла на диске
            File f2 = new File("C:/Users/DearUser3/IdeaProjects/FirstJavaProject/primer2.txt");
            f2.createNewFile();

        } catch (IOException e) {

        }


        }
    }