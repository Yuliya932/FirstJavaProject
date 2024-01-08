package lr6.example5;

public class Test {

    static int sqr (int n) {

        if (n <= 0)
            return 0;
        if (n == 1)
            return 1;

        return n * n + sqr(n - 1);
    }
}
