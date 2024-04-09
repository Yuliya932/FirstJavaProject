/*4. Напишите программу, в которой использована цепочка наследования из трех
классов. В первом классе есть открытое символьное поле. Во втором классе появляется
открытое текстовое поле. В третьем классе появляется открытое целочисленное поле. В
каждом из классов должен быть конструктор, позволяющий создавать объект на основе
значений полей, переданных аргументами конструктору, а также конструктор создания
копии.
*/
package lr7.example4;

public class Main {
    public static void main(String[] args) {

        A a = new A ('g');
        System.out.println(a);

        B b = new B ('m', "Hi");
        System.out.println(b);
        b.str1 = "Hello";
        System.out.println(b);

        B b1 = new B('m', "Hi").clone('D',"Go");
        System.out.println(b1);
        System.out.println(b1==b);

        C c = new C ('a', "Up", 5);
        System.out.println(c);
        c.str1 = "Down";
        System.out.println(c);

        C c1 = new C('m', "Hi", 6).clone('D',"Go", 7);
        System.out.println(c1);
        System.out.println(c1==c);
    }
}
