/*2. Напишите программу с классом, в котором есть закрытое статическое
целочисленное ноле с начальным нулевым значением. В классе должен быть описан
статический метод, при вызове которого отображается текущее значение статического
поля, после чего значение поля увеличивается на единицу.
* */
package lr6.example2;

public class Test {

    private static int num = 0;

    static void meth (){
        System.out.println(num);
        num++;
        }
}
