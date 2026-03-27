package string;

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

        //TODO Методы класса String
    }
}