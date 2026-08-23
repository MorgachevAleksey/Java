package java.l07_multithreading;

import java.util.concurrent.atomic.AtomicInteger;

//Отработка многопоточки
public class Practice {
    public static void main(String[] args){
        //1ый способ создать обьект
        Thread1 thread1 = new Thread1();
        Thread thread1r = new Thread(thread1);
        thread1r.start();
        //2ой способ создать обьект(краткий)
        new Thread(new Thread1()).start();


        //Способ создать поток через лямбда-выражение(просто переопределяю run() не в отдельном классе а напрямую через лямбду)
        AtomicInteger count = new AtomicInteger(0); //
        Thread thread2r = new Thread(() -> {
            int newValue = count.get();
            while (newValue < 100) {
                newValue = count.incrementAndGet();
                System.out.println(newValue);
            }
        });
        thread2r.start();
    }

    //Реализация инетерфейса Runnable
    static class Thread1 implements Runnable{
        int count = 0;
        //Обязательно переопределить метод
        @Override
        public void run() {
            while(count < 101){
                count++;
                System.out.println(count);
            }
        }
    }
}
