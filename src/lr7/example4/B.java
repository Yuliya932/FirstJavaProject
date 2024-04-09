/*4. Напишите программу, в которой использована цепочка наследования из трех
классов. В первом классе есть открытое символьное поле. Во втором классе появляется
открытое текстовое поле. В третьем классе появляется открытое целочисленное поле. В
каждом из классов должен быть конструктор, позволяющий создавать объект на основе
значений полей, переданных аргументами конструктору, а также конструктор создания
копии.
*/
package lr7.example4;

public class B extends A {

    public String str1;

    public B (char ch1, String str1) { // конструктор
        super(ch1);
        this.str1 = str1;
    }

    public String getStr1() {
        return str1;
    }

    public B clone (char ch1, String str1){ //создает клон
        B clone = new B(ch1,str1);
        clone.ch1 = this.ch1;
        clone.str1 = this.str1;
        return clone;
    }

    @Override
    public String toString() {
        return "B{" +
                "ch1='" + super.getCh1() + '\'' +
                "str1='" + str1 + '\'' +
                '}';
    }
}
