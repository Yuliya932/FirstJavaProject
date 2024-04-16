/*Задание 2. Создать проект, позволяющий из одного, предварительно
созданного программными средствами файла, переписать данные,
соответствующие условию - в исходном файле содержится две строки в
формате UTF-8 и 5 чисел типа double. В результирующий файл переписать
вторую строку и положительные числа.*/
package lr8.primer2;
import java.io.*;
import java.util.Scanner;


public class Test {
    public static void main(String[] args) throws IOException {

        try {
// Создается файл
            File f1 = new File("primer2.txt");
            f1.createNewFile(); // файл создан
            System.out.println("Полный путь файла: " + f1.getAbsolutePath());

            DataOutputStream dOut =
                    new DataOutputStream(new FileOutputStream(f1));

                dOut.writeUTF("Hello world\n" + "My friend\n");

            dOut.writeDouble(Double.parseDouble( "1.3\n"+"\n"));
            dOut.writeDouble(Double.parseDouble( "-2.0\n"+"\n"));
            dOut.writeDouble(Double.parseDouble( "8.5\n"+"\n"));
            dOut.writeDouble(Double.parseDouble( "-4.8\n"+"\n"));
            dOut.writeDouble(Double.parseDouble( "9.0\n"+"\n"));

            dOut.flush(); // дописываем несохраненные данные на диск

            dOut.close(); // закрываем поток

            // Создание файла primer22.txt и переписывание в него чисел из primer2.txt
            File f2=new File("C:/Users/DearUser3/IdeaProjects/FirstJavaProject/primer22.txt");
            f2.createNewFile();
            System.out.println("Полный путь файла2: " + f2.getAbsolutePath());

            // поток для чтения из исходного файла primer2.txt
            DataInputStream rd =
                    new DataInputStream(new FileInputStream(f1.getAbsolutePath()));
//
//            // поток для записи в результирующий файл primer22.txt
            DataOutputStream wr = new DataOutputStream(new FileOutputStream(f2.getAbsolutePath()));


            try{

                // Создание потоков

                int lineCount = 0;
            String s;
            while ((s = rd.readLine()) != null ) {
                lineCount++;
                if (lineCount==2) {
                    wr.writeUTF(lineCount + ": " + s);
                    System.out.println(s);
                } else if (lineCount==3) {
                    String unit = s;
                    Scanner scanner = new Scanner(unit).useDelimiter(";\\s*");
                    while (scanner.hasNext()){
                        System.out.print(scanner.next() + " ");
                        wr.writeDouble(Double.parseDouble( scanner.next()));
            }
            scanner.close();
                }
            }

                }catch(EOFException e){}
            wr.flush();
            wr.close();
            rd.close();

        } catch (Exception e) {
            System.out.println("" + e);
        }
    }
}
