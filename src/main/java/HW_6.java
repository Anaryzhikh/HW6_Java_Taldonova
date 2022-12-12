import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

// Реализовать множество (set) с помощью TreeMap.
// Создать метод add, добавляющий элемент в ваше множество.
// Объявить и инициализировать компаратор с обратной (от большего к меньшеиу) логикой сортировки чисел.
// Объявить и инициализировать TreeSet использующий ваш компаратор.
// Добавить несколько эллементов в сет и вывести в консоль.
public class HW_6 {
    Map<Integer, Object> map = new TreeMap<>();
    private static final Object OBJECT = new Object();

    public void methodAdd (int a) {
        map.put(a, OBJECT);
    }






}
