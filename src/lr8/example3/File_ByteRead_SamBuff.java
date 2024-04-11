/*Пример 3. Прочитать и вывести на экран информацию из предварительно
созданного файла с использованием буфера в 5 байт.
*/
package lr8.example3;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;

public class File_ByteRead_SamBuff {
    //Считывание по 5 символов (буфер)
    public static void readAllByArray(InputStream in) throws IOException {
        byte[] buff = new byte[5];
        while (true) {
            int count = in.read(buff);
            if (count != -1) { //если не конец файла
                System.out.println("количество = " + count + ", buff =  "
                        + Arrays.toString(buff) + ", str = "
                        + new String(buff, 0, count, "cp1251")); //UTF8, данные буфера преобразовываются в строку
            } else {
                break;
            }
        }
    }

    public static void main(String[] args) throws IOException {
        String fileName = "C:/Users/DearUser3/IdeaProjects/FirstJavaProject/text.txt";
        InputStream inFile = null; //переменная объявляется до секции try, чтобы не ограничивать область видимости

        try {
            inFile = new FileInputStream(fileName);
            readAllByArray(inFile);

        } catch (IOException e) {
            System.out.println("Ошибка открытия-закрытия файла" + fileName + e);

        } finally { //корректное закрытие потока
            if (inFile != null) {
                try {
                    inFile.close();
                } catch (IOException ignore) {
                    /*NOP*/  //No OPeration - ничего не делать
                }
            }
        }
    }
}

/*Следует отметить, что при работе с байтовыми потоками существует
возможность читать и записывать данные точно определенного типа. Для этой
цели необходимо использовать классы DataInputStream и DataOutputStream с
их методами для чтения ReadInt(), ReadDouble() и др. и для записи – WriteInt(),
WriteDouble() и др. Для строк в формате UTF-8, где символы кодируются одним
байтом, используются методы readUTF() и writeUTF()*/

