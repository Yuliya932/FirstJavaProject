package lr4;

public class Main {

    public static void main(String[] args) {

        boolean [] x1 = {true, false};
        boolean [] x2 = {true, false};
        boolean [] left = new boolean[4];
        boolean []  right = new boolean[4];
        int k = 0;
        for (int i = 0 ; i < x1.length ; i++){
            for (int j = 0 ; j < x2.length ; j++){

                left [k] = (x1[i] ^ x2[j]) ^ (x1[i] ^ x2[j]) & x1[i];
                right [k] = x1[i] &  x2[j] ^ x2[j] ;
                boolean x3;
                if(left [k]==right [k]){
                    x3 = true;
                } else x3 = false;
                System.out.println( "Сравниваем " + x1[i] + " с " + x2[j] + "; Результат сравнения: "+ x3 + " (Результат исходного выражения: "
                        + left[k] + "; Результат упрощенного выражения:  " + right [k] + ")");
                k++;
            }
        }
    }
}
