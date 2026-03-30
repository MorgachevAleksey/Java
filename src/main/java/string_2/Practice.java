package string_2;

import java.util.Arrays;
import java.util.StringJoiner;

public class Practice {
    public static void main(String[] args){

        //Cпособы создания строк
        //1 Литерал
        String s1 = "hello";
        //2 Новый обьект в куче
        String s2 = new String("hello");
        String s5 = new String("hello");
        //3 Конструкторы стринг
        char[] m1 = {'a', 'b'};
        byte[] m2 = {56, 72};
        String s3 = new String(m1);
        String s4 = new String(m2);

        System.out.println(s1 + "\n" + s2 + "\n" + s3 + "\n" + s4);

        //Сравнение и интернирование
        System.out.println(s1 == s2); //ссылки разные
        System.out.println(s1.equals(s2)); //содержимое одинаково
        System.out.println(s2 == s5); //разные ссылки в куче
        s2 = s2.intern();
        System.out.println(s1 == s2); //после помещения s2 в пул (интернирования)

        //Конкатенация строк
        //1 plus
        String s10 = "hello_" + "world";
        //2 concat()
        String s11 = "hello".concat("_world");
        //3 String.join()
        String[] words = {"I", "love", "Java"};
        String s12 = String.join(" ", words);
        //4 StringJoiner()
        StringJoiner joiner = new StringJoiner(", ", "[", "]");
        joiner.add("one").add("two").add("three");
        String s13 = joiner.toString();

        System.out.println(s10 + "\n" + s11 + "\n" + s13);

        //Методы класса String
        String s20 = "Learning java";

        //Длина строки length()
        System.out.println(s20.length());
        //Доступ к символу через индекс chartAt()
        System.out.println(s20.charAt(10));
        //Поиск подстроки\символа
        //Превое вхождение символа indexOf()
        System.out.println(s20.indexOf('a')); //char
        //Первое вхождение подстроки indexOf()
        System.out.println(s20.indexOf("ing")); //String
        //Последнее вхождение lastIndexOf()
        System.out.println(s20.lastIndexOf('a'));
        //Проверка на вхождение contains()
        System.out.println(s20.contains("java"));
        //Проверяет префикс startsWith()
        System.out.println(s20.startsWith("Learn"));
        //Проверяет суффикс endsWith()
        System.out.println(s20.endsWith("java"));
        //Извлечение подстроки substring()
        System.out.println(s20.substring(2));
        System.out.println(s20.substring(2, 9));
        //Изменение регистра
        //Повышение регистра toLowerCase()
        System.out.println(s20.toLowerCase());
        //Понижение регистра toUpperCase()
        System.out.println(s20.toUpperCase());
        //Удаление пробелов !Только в начале и конце строки!
        //trim()
        System.out.println(s20.trim());
        //strip()
        System.out.println(s20.strip());
        //Замена символов replace()
        System.out.println(s20.replace(" ", " HEHEHEHE "));
        //Разделение строк split()
        System.out.println(Arrays.toString(s20.split(" ")));
        //Проверка на пустую строку
        //isEmpty - по длине
        System.out.println(s20.isEmpty());
        //isBlank - по символам
        System.out.println(s20.isBlank());
    }
}