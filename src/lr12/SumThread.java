package lr12;

public class SumThread extends Thread {
    private int from;
    private int to;


    public SumThread(int from, int to) {

        this.from = from;
        this.to = to;

    }

    @Override
    public void run() {
        Example6.sum = 0;
        for (int i = this.from; i <= this.to; i++) {
            if (i < Example6.array.length)
                Example6.sum += Example6.array[i];
        }
    }
}