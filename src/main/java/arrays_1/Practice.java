package arrays_1;

//Имопрт класса-утилиты с методами для работы с массивами сс фиксированным размером
import java.util.Arrays;

public class Practice {
    public static void main(String[] args) {
        Demonstration.dem();
        Exercise.ex();
    }

    static class Demonstration{
        public static void dem(){
            //Обьявление массива
            int[] arr1;
            //Создание массива
            arr1 = new int[10]; //создали массив из 10 целых чисел
            //Обьявление + создание массива - можно обьеденить
            int[] arr3 = new int[10];
            //Инициализация массива
            //1 способ, литерал
            int[] arr4 = {2, 4, 6};
            //2 способ, анонимный массив
            int[] arr5 = new int[]{1, 3, 5};
            System.out.println(Arrays.toString(new int[]{1, 2, 3, 4, 5, 6})); //Приемущество метода - возможность использовать массив на лету, не присваивая переменной
            //3 способ, по элементам
            int[] arr6 = new int[7];
            for (int element : arr6){ //цикл for-each
                element = 6; //всем елементам массива по очереди присвоится значение - 6
            }

            //Основные методы (и поля) работы с массивом
            //length - встроенное поле маасива, в котором его длина
            int[] arr10 = new int[11];
            System.out.println(arr10.length);
        }
    }

    static class Exercise{
        public static void ex(){
            //Создать массив целых чисел, размером 10, заполнить 0-9, вывести на экран
            int[] e1 = new int[10];
            for (int i = 0; i <= 9; i++){
                e1[i] = i;
            }
            System.out.println(Arrays.toString(e1)); //Метод для строкового представления массива

            //Создать массив строк с именами, изменить второй элемент и вывести все элементы
            String[] e2 = {"Alexey", "Alexander"};
            e2[1] = "Alex";
            System.out.println(Arrays.toString(e2));

            //Массив символов размером 5 с символами от A до E
            char[]e3 = new char[5];
            e3[0] = 'A';
            e3[1] = 'B';
            e3[2] = 'C';
            e3[3] = 'D';
            e3[4] = 'E';
            System.out.println(Arrays.toString(e3));
        }
    }
}
