package multithreading_2;

public class Practice {

    //Создание потока через Runnable
    static class myTask implements Runnable{ //Создал свой класс и подключил интерфейс
        @Override //Аннотация переопределния метода run() класса mmeTask
        public void run() {
            System.out.println("from 2nd thread");
        }
    }
}
