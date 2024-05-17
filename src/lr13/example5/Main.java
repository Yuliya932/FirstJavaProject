/*Пример 5. Исключение не перехвачено.*/
package lr13.example5;

public class Main {
    public static void main(String[] args) {
        try {
            System.out.println("0");
            throw new RuntimeException("ошибка");
//        } catch (NullPointerException e) {
        } catch (RuntimeException e) {
            System.out.println("1");
        }
        System.out.println("2");
    }
}
