package chapter13;

public class Main {
    public static void main(String[] args) {
        Runnable r = new ThreadEx1_2();
        ThreadEx1_1 t1 = new ThreadEx1_1();
        ThreadEx1_3 t2 = new ThreadEx1_3();

        t1.setPriority(7);
        t2.setPriority(10);

        System.out.println("t1(-).getPriority() : " + t1.getPriority());
        System.out.println("t2(|).getPriority() : " + t2.getPriority());

        t1.start();
        t2.start();

        for (int i = 0; i < 300; i++) {
            System.out.print("/");
        }
//        t1.run();
//        t1.start();
//
//        try {
//            Thread.sleep(1, 500000); // 0.0015 초
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }
//
//        // 매번 try-catch 문 사용하기 번거롭기 때문에
//        delay(1, 500000);

    }

    private static void delay(long millis, int nanos) {
        try {
            Thread.sleep(millis, nanos); // 0.0015 초
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
