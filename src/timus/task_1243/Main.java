/*1243. Развод семи гномов
Ограничение времени: 1.0 секунды
Ограничение памяти: 64 МБ
Все мы знаем, чем закончилась история про Белоснежку и семь гномов — Белоснежка уехала с женихом, бросив всех тех, кто бескорыстно помог ей в трудную пору. После её отъезда гномы стали ссориться — каждый считал, что другие чем-то обидели Белоснежку.
Чтобы не доводить вечные ссоры до кровопролития, некогда дружные гномы решили расстаться, поделив все свое добро, от кружек до алмазов, согласно старинным гномьим законам о разводе. По этим законам, все имущество должно быть самым справедливым образом поделено между гномами, а то, что поделить поровну нельзя, не должно достаться никому из них. Бережливые гномы решили, что неразделённые вещи выкидывать не будут, а отдадут Белоснежке в качестве приданого.
Например, у каждого из гномов с рождения имелось по две пары ботинок, к моменту появления этой задачи самый старый гном одну свою пару износил, значит, после справедливого раздела оставшихся 26 ботинок, каждый гном получит по 3 ботинка, а Белоснежку осчастливят 5 ботинками.
Отметим, что некоторых вещей у гномов очень много — одних только маковых зёрнышек накопилось 123456123456 штук. Гномы потратили немало времени, пока сосчитали, что Белоснежка получит всего одно маковое зёрнышко. Ваша задача — помочь гномам рассчитать долю Белоснежки.
Исходные данные
Единственная строка содержит число N одинаковых вещей, которые хотят поделить гномы (1 ≤ N ≤ 1050).
Результат
Единственное число — количество вещей, которые в результате справедливого раздела, перейдут к Белоснежке.
Пример
исходные данные	результат
123456123456
1*/
package timus.task_1243;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long a = in.nextLong();

        int b = (int)(a%7.0);
        System.out.println(b);
    }
}
