package lr12;

public class MaxThread extends Thread{
    private int from;
    private int to;


    public MaxThread(int from, int to) {

        this.from = from;
        this.to = to;

    }

    @Override
    public void run() {
        Example5.max = Example5.array[this.from];
        for (int i = this.from; i <= this.to; i++) {
            if (i < Example5.array.length)
                if (Example5.max < Example5.array[i]) {
                    Example5.max = Example5.array[i];
                }
        }
    }
}
