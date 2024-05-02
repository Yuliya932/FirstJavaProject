/*3)	Добавьте функционал для добавления нового фильма в массив*/
package lr10.example2;

import java.util.Scanner;

public class AddJsonMovie {

    try {
        Scanner in = new Scanner(System.in);
        System.out.println("Хотите добавить фильмы в список? (y/n)");
        String c = in.nextLine();

        if ("y".equals(c)) {



            System.out.println("Введите название фильма: ");
            System.out.println("Введите режиссера фильма: ");
            System.out.println("Введите год выхода фильма: ");



        }



}
}

//Подсказки
//        2.	Для добавления новой книги в массив необходимо использовать метод JSONArray.add() для добавления нового объекта JSONObject в массив JSONArray.
//        Пример:
//
//        JSONArray jsonArray = (JSONArray) jsonObject.get("books");
//        JSONObject newBook = new JSONObject();
//        newBook.put("title", "Новая книга");
//        newBook.put("author", "Новый автор");
//        newBook.put("year", 2023);
//        jsonArray.add(newBook);




//Берегись автомобиля
//<director>Эльдар Рязанов</director>
//<year>1966</year>
//</movie>
//<movie>
//<title>Невероятные приключения итальянцев в России</title>
//<director>Эльдар Рязанов</director>
//<year>1973</year>