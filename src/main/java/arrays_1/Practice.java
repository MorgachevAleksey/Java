package arrays_1;

//Имопрт класса-утилиты с методами для работы с массивами сс фиксированным размером
import java.util.Arrays;
import java.util.Collections;

public class Practice {
    public static void main(String[] args) {
        Demonstration.dem();
    }

    static class Demonstration {
        public static void dem() {
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
            for (int element : arr6) { //цикл for-each
                element = 6; //Исходный массив не изменится
            }

            //Основные методы (и поля) работы с массивом:
            //0) length - встроенное поле маасива, в котором его длина
            int[] arr10 = new int[11];
            System.out.println(arr10.length);

            //1) fill - заполнение
            int[] arr11 = new int[11];
            Arrays.fill(arr11, 10); //Всего массива
            System.out.println(Arrays.toString(arr11));
            int[] arr12 = new int[11];
            Arrays.fill(arr12, 4, 8, 200); //Части массива
            System.out.println(Arrays.toString(arr12));
            String[] arr13 = new String[11];
            Arrays.fill(arr13, "Hello"); //Массива обьектов
            System.out.println(Arrays.toString(arr13));

            //2) Копирование массива
            int[] arr14 = new int[11];
            Arrays.fill(arr14, 4);
            //метод copyOf создает копию массива, с возможностью изменить размер
            int[] arr15 = Arrays.copyOf(arr14, arr14.length);
            System.out.println(Arrays.toString(arr15));

            //3) Сравнение массивов
            System.out.println(Arrays.equals(arr14, arr15));
            System.out.println(Arrays.equals(arr14, arr11));

            //4) Сортировка
            int[] arr16 = {2, 5, 234, 23, 32, 1, 0, 23423, 4};
            Arrays.sort(arr16);
            System.out.println(Arrays.toString(arr16));
            //Т. к. компаратор только для обьектов
            Integer[] arr17 = {2, 5, 234, 23, 32, 1, 0, 23423, 4};
            Arrays.sort(arr17, Collections.reverseOrder());
            System.out.println(Arrays.toString(arr17));

            //5) Бинарный поиск
            System.out.println(Arrays.binarySearch(arr16, 23));

            //Перебор
            for (int i = 0; i < arr16.length; i++) {
                System.out.println(arr16[i]);
            }
            System.out.println("------------------");
            for (int element : arr16) { //Возвращает копию элемента, поэтому не может изменить исходный массив
                System.out.println(element);
            }

            //Глубокое копирование многомерных массивов
            int[][] jug =
                    {
                            {1, 2},
                            {1, 2, 3}
                    };
            int[][] copy_jug = new int[jug.length][];
            for (int i = 0; i < copy_jug.length; i++) {
                copy_jug[i] = Arrays.copyOf(jug[i], jug[i].length);
            }

            //Сравнение и вывод
            System.out.println(Arrays.deepEquals(jug, copy_jug));
            System.out.println(Arrays.deepToString(jug));

            //Вызов метода с параметром типа varargs
            printAll("Hello", "Bye");
        }

        //Метод с параметро типа varargs - фактически массивом динамического размера
        public static void printAll(String... elements){
            System.out.println(Arrays.deepToString(elements));
        }
    }
}