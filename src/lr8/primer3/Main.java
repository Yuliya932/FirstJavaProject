/*Задание 3. Создать проект, позволяющий из одного текстового файла,
содержащего несколько строк (тип String) заранее подготовленного текста на русском языке
(Пушкин, Лермонтов или другой российский классик на Ваш вкус),
построчно переписать в другой текстовый файл
слова начинающиеся с согласных букв.*/
package lr8.primer3;

import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        String inputFileName = "src/lr8/primer3/input.txt"; //путь к файлу
        BufferedReader bufferedReader =
                        new BufferedReader(new FileReader(inputFileName)); //данные считаются из файла
        PrintWriter out = null;
        try {
// Создание потоков
            out = new PrintWriter("C:/Users/DearUser3/IdeaProjects/FirstJavaProject/src/lr8/primer3/output.txt","cp1251");
// Переписывание информации из одного файла в другой
            int lineCount = 0;
            String s;

            while ((s = bufferedReader.readLine()) != null) {
                lineCount++;
                System.out.println("Исходная строка: " + s);

                out.println();
                out.print(lineCount + ": " ); // передали в поток в файл

                String[] strings1 = s.split(" ");

                for (int i = 0; i < strings1.length; i++) {
                    String[] words = new String[strings1.length];
                    words[i] = strings1[i];
                    //аАеЕёЁиИоОуУыЫэЭюЮяЯ
                    if (words[i].startsWith("а")||words[i].startsWith("А")
                            ||words[i].startsWith("е")||words[i].startsWith("Е")
                            ||words[i].startsWith("ё")||words[i].startsWith("Ё")
                            ||words[i].startsWith("и")||words[i].startsWith("И")
                            ||words[i].startsWith("о")||words[i].startsWith("О")
                            ||words[i].startsWith("у")||words[i].startsWith("У")
                            ||words[i].startsWith("ы")||words[i].startsWith("Ы")
                            ||words[i].startsWith("э")||words[i].startsWith("Э")
                            ||words[i].startsWith("ю")||words[i].startsWith("Ю")
                            ||words[i].startsWith("я")||words[i].startsWith("Я")

                    ) {
                        //System.out.println("Слово начинается на гласную"); // ничего не делаем
                    } else
                        out.print(words[i] + " "); // передали в поток в файл
//                    System.out.print(words[i]+ " "); // почему-то не правильно работает

                }

            }
        } catch (IOException e) {
            System.out.println("Ошибка !!!!!!!!"); }
        finally{
            bufferedReader.close();
            out.flush();
            out.close();
        }

        }

    }

