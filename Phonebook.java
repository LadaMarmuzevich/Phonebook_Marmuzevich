import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Phonebook {
    public static void addNumber(String key, int value, Map<String, ArrayList<Integer>> map) {
        if (map.containsKey(key)) {
            map.get(key).add(value);
        } else {
            ArrayList<Integer> list = new ArrayList<>();
            list.add(value);
            map.put(key, list);
        }
    }

    // Метод, который печатает список контактов
    public static void printBook(Map<String, ArrayList<Integer>> map) {
        List<Map.Entry<String, ArrayList<Integer>>> sortedEntries = new ArrayList<>(map.entrySet());
        sortedEntries.sort((a, b) -> Integer.compare(b.getValue().size(), a.getValue().size()));

        for (Map.Entry<String, ArrayList<Integer>> entry : sortedEntries) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }

    public static void main(String[] args) {
        Map<String, ArrayList<Integer>> bookPhone = new HashMap<>();
        addNumber("Maksim", 123, bookPhone);
        addNumber("Maksim", 1234, bookPhone);
        addNumber("Olivia", 546585, bookPhone);
        addNumber("Olivia", 943, bookPhone);
        addNumber("Alexsandr", 96855, bookPhone);
        addNumber("Anna", 8956477, bookPhone);
        addNumber("Maksim", 12356233, bookPhone);
        addNumber("Olivia", 787897, bookPhone);
        addNumber("Alexsandr", 768, bookPhone);
        addNumber("Maksim", 456327, bookPhone);
        printBook(bookPhone);
    }
}
