/*1607. Такси
Ограничение времени: 0.5 секунды
Ограничение памяти: 64 МБ
Петя любит ездить на такси. Для него это не только удовольствие
от быстрой и комфортной поездки, но и возможность всласть поторговаться
с таксистом о цене проезда. Торг между Петей и таксистами всегда происходит по одному и тому же сценарию:
— Мне в аэропорт, заплачу 150 рублей.
— Нет, за 150 не повезу, поехали за 1000.
— Да ты что?! У меня и нет столько! Согласен за 200.
— Ты смеешься? Давай хотя бы за 900.
— Ну хорошо, дам 250.
— Да ты хоть знаешь, сколько бензин стоит? 800 и поехали!
…
Этот диалог продолжается до тех пор, пока они не сойдутся в цене.
Петя всегда увеличивает свою цену на одну и ту же сумму, а таксист таким же образом снижает ее.
Таксист не станет называть цену ниже той, которую предложит Петя. В этом случае он согласится с его ценой.
Аналогичным образом поступит и Петя.
Исходные данные
В единственной строке даны 4 целых числа:
a — стартовая цена Пети,
b — надбавка Пети к своей цене,
c — стартовая цена таксиста,
d — скидка таксиста к своей цене (1 ≤ a, b, c, d ≤ 10000).
Результат
Выведите сумму, которую Петя заплатит за проезд.
Пример
исходные данные
150 50 1000 100
результат
450
*/
package timus.task_1607;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Main {

    public static void main(String[] args) {

        String inputFileName = "src/timus/task_1607/input.txt"; //путь к файлу
        boolean oj = System.getProperty("ONLINE_JUDGE") != null; // true - на сайте тимус, false - запущена локально на ПК

        try {
            BufferedReader bufferedReader =
                    oj ? new BufferedReader(new InputStreamReader(System.in)) :
                            new BufferedReader(new FileReader(inputFileName)); //данные считаются из файла

            String readLine;//можно убрать ="", и в ней будет null
            int n = 1;
            int d;
            int p,t;
            String[] data;
            readLine = bufferedReader.readLine();
            data = readLine.split(" ");
            int l = data.length;
            int dat[]= new int[l];
            for (int i=0;i<l;i++){
                d = Integer.parseInt(data[i].toString()); // считываем, преобразуем
                   dat[i] = d;
               }
            p=dat[0];
            t=dat[2];
            while (p<t){
                p=p+dat[1];
                if(p<t) {
                    t = t - dat[3];
                } else t=p;
            }
            System.out.println(p);

        } catch(
                IOException exception){
            exception.printStackTrace();
        }
    }
}


