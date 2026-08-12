//package l11_functional;
//
////Создать Race condition на двух потоках инкрементов и пофиксить
//public class Exercises {
//    public static void main(String[] args) throws InterruptedException {
//        //без synchronyzed
//        Thread1 thread1 = new Thread1();
//        Thread thread1r1 = new Thread(thread1);
//        Thread thread1r2 = new Thread(thread1);
//        thread1r1.start();
//        thread1r2.start();
//        thread1r1.join();
//        thread1r2.join();
//        System.out.println("втрой счетчик " + thread1.getCount());
//
//        Thread2 thread2 = new Thread2();
//        Thread thread2r1 = new Thread(thread2);
//        Thread thread2r2 = new Thread(thread2);
//        thread2r1.start();
//        thread2r2.start();
//        thread2r1.join();
//        thread2r2.join();
//        System.out.println("втрой счетчик" + thread2.getCount());
//    }
//
//    //без synchronyzed
//    public static class Thread1 implements Runnable{
//        private int count = 0;
//
//        public int getCount(){
//            return count;
//        }
//
//        @Override
//        public void run(){
//            while (count < 1001){
//                count++;
//                count--;
//                count++;
//            }
//        }
//    }
//
//    //c synchronyzed
//    public static class Thread2 implements Runnable{
//        private int count = 0;
//        private Object lock = new Object();
//
//        public int getCount(){
//            return count;
//        }
//
//        @Override
//        public void run(){
//                while (true) {
//                    synchronized (lock) {
//                        if (count >= 1001) break;
//                        count++;
//
//                    }
//                    try {
//                        Thread.sleep(1);
//                    } catch (InterruptedException e) {
//                        throw new RuntimeException(e);
//                    }
//                }
//
//        }
//    }
//}
package l11_functional;

public class Exercises {
    public static void main(String[] args) throws InterruptedException {
        Counter counter = new Counter();

        Thread t1 = new Thread(counter);
        Thread t2 = new Thread(counter);

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println("Ожидалось: 200000");
        System.out.println("Фактически (Race Condition): " + counter.getCount());
    }

    public static class Counter implements Runnable {
        private int count = 0;

        public int getCount() {
            return count;
        }

        @Override
        public void run() {
            for (int i = 0; i < 100_000; i++) {
                count++; // Неатомарная операция
                Thread.yield();
            }
        }
    }
}