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

public class SuperClassTest {
    private String str1;

    public SuperClassTest (){ //конструктор без параметров
        this.str1 = "Присвоили константу";
    }

    public SuperClassTest (String str1){ //конструктор
        this.str1 = str1;
    }

    public String getStr1(){ //метод без параметров
        return str1;
    }

    public void setStr1 (String str1){ // метод с одним текстовым параметром
        this.str1 = str1;
    }

    public void setConstValue (){
        this.str1 = "Присвоили константу";
    }

    @Override
    public String toString (){
        return "SuperClass{"+
                "str1='" + str1 + '\'' +
                '}';
    }

    public int getStringLength (){
        if(null == this.str1){
            return 0;
        }
        return this.str1.length();
    }
}
