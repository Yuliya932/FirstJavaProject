/*Пример 5. Вывести число Фибоначчи, заданное его номером в последовательности.
Последовательность Фибоначчи формируется так: нулевой член последовательности равен нулю, первый – единице, а каждый следующий – сумме двух предыдущих.
Для примера 5 дополнительно вывести в консоль последовательность обхода дерева рекурсивных вызовов.
*/
package lr9.example5;

public class Recursion {
    public static void main(String[] args) {
        System.out.println(fact(5));
//        System.out.println(fact(8));
    }

    private static int step = 0;

    public static int fact (int n){
        if (n == 2 || n == 1){
            System.out.println(" " +n + " возвращает => 1" );
        } else if (n == 0) {
            System.out.println(" " +n + " возвращает => 0" );
        }else
        System.out.println(" " +n + " вызывает=> " + (n - 1) + " и " + (n - 2));
//        space();
        step++;
        if (n == 0){
            return 0;
        } else if (n ==1) {
            return 1;
        }else {
            return fact(n - 2) + fact(n - 1);

        }
//        step--;
//        space();
//        System.out.println("" + n + " <-");
    }


    public static void space() {
        for (int i = 0 ; i < step; i++){
            System.out.println(" ");
        }
    }
}
