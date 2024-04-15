/*Пример 5. Вывести число Фибоначчи, заданное его номером в последовательности.
Последовательность Фибоначчи формируется так: нулевой член последовательности равен нулю, первый – единице, а каждый следующий – сумме двух предыдущих.
*/
package lr9.example5;

public class Recursion {
    public static void main(String[] args) {
        System.out.println(fact(5));
        System.out.println(fact(8));
    }

    public static int fact (int n){
        if (n == 0){
            return 0;
        } else if (n ==1) {
            return 1;
        }else {
            return fact(n - 2) + fact(n - 1);
        }
    }
}
