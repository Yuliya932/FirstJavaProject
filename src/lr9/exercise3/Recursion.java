/*3. Создать приложение, позволяющее ввести и вывести одномерный массив целых чисел.
Для ввода и вывода массива разработать рекурсивные методы вместо циклов for.*/
package lr9.exercise3;
public class Recursion {

    int values[];

    public Recursion(int i) {
        values = new int[i];
    }

    //вывести рекурсивно элементы массива
    public void printArray(int i) {
        if (i == 0) return;
        else printArray(i - 1);
        System.out.println(" [" + (i - 1) + "] " + values[i - 1]);
    }
}
