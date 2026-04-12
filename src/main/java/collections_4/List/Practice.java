package collections_4.List;

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
    }
}
