package l05_collections.list;

//Импорт коллекций
import java.util.List;
import java.util.ArrayList;
import java.util.Set;

public class Practice {
    public static void main(String[] args){

        //Инициализация ArrayList
        //1
        List<String> list1 = new ArrayList<>(); //Пустой
        //2
        List<Integer> list2 = new ArrayList<>(1000); //Емкостью 1000
        //3
        Set<String> set = Set.of("A", "B");
        List<String> list3 = new ArrayList<>(set);

        System.out.println(list1 + " " + list2 + " " + list3);

        //Методы
        //Добавление элемента add()
        // list2.add(1, 15); т.к конструктор лишь резервирует память, то будет ошибка - текущий размер массива 0, а поптыка вставить элемнт на 1
        list2.add(15);
        list2.add(1, 16);
        //Получить элемент
        System.out.println(list2.get(0));
        //Заменить элемент
        list2.set(1, 17);
        System.out.println(list2);
        //Удалить элемент
        list2.remove(0);
        System.out.println(list2);
        list2.remove(Integer.valueOf(17)); //Засада перегрузки - нужно явно привести
        System.out.println(list2);

        System.out.println(list1 + " " + list2 + " " + list3);
    }
}
