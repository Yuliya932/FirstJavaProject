/*Пример 3. Код вывода параметра перед вхождением в рекурсивный вызов и после него*/
package lr9.example3;

public class Recursion {
    private static int step = 0;
    public static void m (int x){
        space();
        System.out.println(" " +x + "=> ");
        step++;
        if((2 * x + 1) < 20){
            m(2 * x + 1);
        }
        step--;
        space();
        System.out.println("" + x + " <-");
    }

    public static void space() {
        for (int i = 0 ; i < step; i++){
            System.out.println(" ");
        }
    }

    public static void main(String[] args) {
        m(1);
    }
}
