/*4. Напишите программу, в которой использована цепочка наследования из трех
классов. В первом классе есть открытое символьное поле. Во втором классе появляется
открытое текстовое поле. В третьем классе появляется открытое целочисленное поле. В
каждом из классов должен быть конструктор, позволяющий создавать объект на основе
значений полей, переданных аргументами конструктору, а также конструктор создания
копии.
*/
package lr7.example4;

public class C extends B {

    public int num1;

    public C (char ch1, String str1, int num1) { // конструктор
        super(ch1, str1);
        this.num1 = num1;
    }

    public int getNum1() {
        return num1;
    }

    public C clone (char ch1, String str1, int num1){ //создает клон
        C clone = new C(ch1,str1, num1);
        clone.ch1 = this.ch1;
        clone.str1 = this.str1;
        clone.num1 = this.num1;
        return clone;
    }

    @Override
    public String toString() {
        return "C{" +
                "ch1='" + super.getCh1() + '\'' +
                "str1='" + super.getStr1() + '\'' +
                "num1=" + num1 +
                '}';
    }
}
