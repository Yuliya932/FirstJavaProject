/*Пример 6. Последовательность перехвата должна соответствовать
иерархии классов исключений. Предок не должен
перехватывать исключения раньше потомков.
Указанный пример выдает ошибку компилятора. Программу запустить невозможно.

 */
package lr13.example6;

public class Main {
    public static void main(String[] args) {
        try {
            System.out.println("0");
            throw new NullPointerException("ошибка");
        } catch (ArithmeticException e) {
            System.out.println("1");
        } catch (RuntimeException e) {
            System.out.println("2");
        } catch (Exception e) {
            System.out.println("3");
        }
        System.out.println("4");
    }
}
