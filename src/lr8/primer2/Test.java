/*Задание 2. Создать проект, позволяющий из одного, предварительно
созданного программными средствами файла, переписать данные,
соответствующие условию - в исходном файле содержится две строки в
формате UTF-8 и 5 чисел типа double. В результирующий файл переписать
вторую строку и положительные числа.*/
package lr8.primer2;
import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Stream;

public class Test {
    public static void main(String[] args) throws IOException {

//        Scanner sc = new Scanner(System.in);
//        System.out.print("Введите имя файла => ");
//        String
//                fname = sc.nextLine();
        try {
// Создается файл
            File f1 = new File("primer2.txt");
            f1.createNewFile(); // файл создан
            System.out.println("Полный путь файла: " + f1.getAbsolutePath());
//            System.out.print("Введите количество строк для записи в файл => ");
//            int n = sc.nextInt();
//            int n = 2; //количество строк для записи в файл
            //ввести заданное с клавиатуры количество строк текста и записать их в файл в формате UTF-8
// Создается поток для записи с учетом типа данных – DataOutputStream,
// и ему в качестве параметра передается поток FileOutputStream
            DataOutputStream dOut =
                    new DataOutputStream(new FileOutputStream(f1));
//            sc.nextLine(); //очистка буфера
//            for (int i = 0; i < n; i++) {
//                System.out.print("Введите строку для записи в файл => ");
//                String s = sc.nextLine();
//                dOut.writeUTF(s);
                dOut.writeUTF("Hello world\n" + "My friend\n");
//или dOut.writeUTF(s +"\n" ); – запись отдельных строк
//                sc.nextLine(); //очистка буфера



//                dOut.append((double)"1.3");



//            }


//            f1.append((double) '1.3');

//            String unit = "1.3;2.0;8.5;4.8;9.0";
//            Scanner scanner = new Scanner(unit).useDelimiter(";\\s*");
//            while (scanner.hasNext()){
////                System.out.print(scanner.next() + " ");
//                dOut.writeDouble(Double.parseDouble( scanner.next()));
////                f1.append((double) scanner.next());
//            }
//            scanner.close();
            dOut.writeDouble(Double.parseDouble( "1.3\n"));
            dOut.writeDouble(Double.parseDouble( "-2.0\n"));
            dOut.writeDouble(Double.parseDouble( "8.5\n"));
            dOut.writeDouble(Double.parseDouble( "-4.8\n"));
            dOut.writeDouble(Double.parseDouble( "9.0\n"));


            dOut.flush(); // дописываем несохраненные данные на диск

            dOut.close(); // закрываем поток

// Чтение и вывод данных из созданного файла
//            DataInputStream dIn = new DataInputStream(new FileInputStream(f1));
//            while (true) {
//                System.out.println(dIn.readUTF());
//                System.out.println(dIn.readDouble());

//            }

            // Создание файла primer22.txt и переписывание в него чисел из primer2.txt
            File f2=new File("C:/Users/DearUser3/IdeaProjects/FirstJavaProject/primer22.txt");
            f2.createNewFile();
            System.out.println("Полный путь файла2: " + f2.getAbsolutePath());

            // поток для чтения из исходного файла primer2.txt
            DataInputStream rd =
                    new DataInputStream(new FileInputStream(f1.getAbsolutePath()));

            // поток для записи в результирующий файл primer22.txt
            DataOutputStream wr = new DataOutputStream(new FileOutputStream(f2.getAbsolutePath()));
            try{
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

//                f1.append((double) scanner.next());
            }
            scanner.close();


//                    wr.writeDouble(rd.readDouble());
//                    //wr.writeDouble((double) s);
//                    System.out.println( rd.readDouble());

                }

            }

//
//                List <String> lines = Files.readAllLines(Paths.get("primer2.txt"));
//                List <String> result = new ArrayList<>();
//
//                Stream <Double> stream = Stream.of(rd.readDouble());
//                boolean result1 = stream.filter(x -> x > 0).allMatch(x -> x > 0);

//                for (String s: lines) {
//                    if( lines =2){
//                        String upper = s.toUpperCase();
//                        result.add(upper);
//                    }
//                }
//                for (String s : result){
//                    System.out.println(s);
//                }
//                while(true){
//                    if(rd.readUTF() != null) {
//                        String unit = rd.readUTF();
//                        wr.writeUTF(unit);
//                        //чтение-запись из одного файла в другой
//                        System.out.println(" Строка " + unit);
//                    } else if (rd.readDouble() >0 ) {
//                        Double unit = rd.readDouble();
//                        wr.writeDouble(unit);
//                        //чтение-запись из одного файла в другой
//                        System.out.println(" Double " + unit);
//                    }
//
//                    }
//                while(true){
//                    if(rd.readUTF() != null) {
//                        String unit = rd.readUTF();
//                        wr.writeUTF(unit);
//                        //чтение-запись из одного файла в другой
//                        System.out.println(" Строка " + unit);
//                    } else if (rd.readDouble() >0 ) {
//                        Double unit = rd.readDouble();
//                        wr.writeDouble(unit);
//                        //чтение-запись из одного файла в другой
//                        System.out.println(" Double " + unit);
//                    }
//
//                }
                }catch(EOFException e){}
            wr.flush();
            wr.close();
            rd.close();





        } catch (Exception e) {
            System.out.println("" + e);
        }
    }
}
//        try {
//
//            // Создание файла на диске
//            File f2 = new File("C:/Users/DearUser3/IdeaProjects/FirstJavaProject/primer2.txt");
//            f2.createNewFile();
//
//        } catch (IOException e) {
//
//        }

//        BufferedReader br = null;
//        BufferedWriter out = null;
//
//        Scanner scanner = new Scanner("Hello world, \n" +
//                "My String"); //, StandardCharsets.UTF_8
//
//        System.out.println(scanner.nextLine());
//
//
//        try {
//            //Создание файловых символьных потоков для  чтения и записи
//            br = new BufferedReader(new FileReader("C:/Users/DearUser3/IdeaProjects/FirstJavaProject/primer2.txt"), 1024);//1024 - размер буфера
//            out = new BufferedWriter(new FileWriter("C:/Users/DearUser3/IdeaProjects/FirstJavaProject/primer22.txt"));
//
//            int lineCount = 0; //счетчик строк
//            String s;
//            //Переписывание информации из одного файла в другой
//            while ((s = br.readLine()) != null) {
//                lineCount++;
//                System.out.println(lineCount + ": " + s);
//                out.write(s);
//                out.newLine(); //переход на новую строку
//            }
//        } catch (IOException e) {
//            System.out.println("Ошибка!!!");
//        } finally {
//            br.close();
//            out.flush();
//            out.close();
//        }
//
//
//        }
//    }