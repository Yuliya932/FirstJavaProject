/*На листинге 3 показан пример программы с использование условного оператора if.*/

package lr1;

public class Example3 {

    public static void main(String[] args) {
        int s, d;
        s = 10;
        d = 20;
        if (s < d) {
            System.out.println("S < D");
        }
        s = s * 2;
        if (s == d) {
            System.out.println("S = D");
        }
        s = s * d;
        if (s > d) {
            System.out.println("S > D");
        }
    }
}