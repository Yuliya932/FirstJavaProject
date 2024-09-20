package lr4;

public class Main {

    public static void main(String[] args) {

        int [] x1 = {0,1,2};
        int [] x2 = {2,3,4};
        int [] left = new int[9];
        int []  right = new int[9];
        int k = 0;
        for (int i = 0 ; i < x1.length ; i++){
            for (int j = 0 ; j < x2.length ; j++){

                left [k] = (x1[i] ^ x2[j]) ^ (x1[i] ^ x2[j]) & x1[i];
                right [k] = x1[i] &  x2[j] ^ x2[j] ;
                System.out.println( "Сравниваем " + x1[i] + " с " + x2[j] + "; Результат исходного выражения: " + left[k] + "; Результат упрощенного выражения:  " + right[k]);
                k++;
            }
        }
    }
}
