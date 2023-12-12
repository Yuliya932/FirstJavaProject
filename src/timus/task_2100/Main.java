package timus.task_2100;

//копируем начиная с импорта
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) {

        String inputFileName = "src/timus/task_2100/input.txt"; //путь к файлу
        boolean oj = System.getProperty("ONLINE_JUDGE") != null; // true - на сайте тимус, false - запущена локально на ПК

        int marshallAndLilly = 2; //переменная Маршалл и Лилли

        try{

            BufferedReader bufferedReader =
                    oj ? new BufferedReader(new InputStreamReader(System.in)):
                            new BufferedReader(new FileReader(inputFileName)); //данные считаются из файла

            String readLine;//можно убрать ="", и в ней будет null

            int numberOfFriends = 0; // считываем колво друзей из первой строки
            int numberOfPairs = 0; // считываем колво плюсов из списка друзей

            while ((readLine = bufferedReader.readLine()) != null) { //перебираем в цикле каждую строку
                if(numberOfFriends == 0){
                    numberOfFriends = Integer.parseInt(readLine); // считываем, преобразуем
                    continue;

                }
                if (readLine.contains("+")){ //true - если сожержит +, false - если нет
                    numberOfPairs++;
                }
            }

            int result; // чтобы посчитать результат

            int guests = (marshallAndLilly + numberOfFriends + numberOfPairs); // считаем колво людей

            if (guests == 13){ // если 13, то добавим манекен
                result = (guests * 100 + 100);

            } else {
                result = guests * 100;
            }

            System.out.println(result);
        } catch(IOException exception) {
            exception.printStackTrace();
        }
    }
}