/*2. Напишите программу, в которой есть суперкласс с приватным текстовым полем. В
базовом классе должен быть метод для присваивания значения полю: без параметров и с
одним текстовым параметром. Объект суперкласса создается передачей одного текстового
аргумента конструктору. Доступное только для чтения свойство результата возвращает
длину текстовой строки.
На основе суперкласса создается подкласс. В подклассе появляется
дополнительное открытое целочисленное поле. В классе должны быть такие версии метода
для присваивания значений полям (используется переопределение и перегрузка метода из
суперкласса): без параметров, с текстовым параметром, с целочисленным параметром, с
текстовым и целочисленным параметром. У конструктора подкласса два параметра
(целочисленный и текстовый).
* */
package lr7.example2;

public class Main {
    public static void main(String[] args) {

        SuperClassTest superClassObject =
                new SuperClassTest("Hello");
        System.out.println(superClassObject.getStringLength());

        SuperClassTest superClassObject2 =
                new SuperClassTest();
        System.out.println(superClassObject2.getStringLength());

        SubClassTest subClassObject =
                new SubClassTest(2, "Здравствуйте");
        System.out.println(subClassObject.getStringLength());

        SubClassTest subClassObject2 =
                new SubClassTest();
        System.out.println(subClassObject2.getStringLength());

        SubClassTest subClassObject3 =
                new SubClassTest(5);
        System.out.println(subClassObject3.getStringLength());

    }

}
