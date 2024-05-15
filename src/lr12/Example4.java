/*4. Напишите программу, которая создает 10 потоков
и каждый поток выводит на экран свой номер.*/
package lr12;

import java.time.LocalTime;

public class Example4 {
    public static void main(String[] args) {
        var counter = new AtomicInteger();
        while (true) {
            new Thread(() -> {
                int count = counter.incrementAndGet();
                System.out.println("thread count = " + count);
                LockSupport.park();
            }).start();
        }


    }


//        Thread t1 = new Thread(() -> {
////        for (int i = 0; i < 10; i++){
//            System.out.println(Thread.currentThread().getName() + ": "
//                    + LocalTime.now());
//
//            try {
//                Thread.sleep(1000);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//        });
//        t1.start();
////        t1.join();
//    }
}
