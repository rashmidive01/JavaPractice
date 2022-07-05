package LambdaDemo1;



import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;


public class SortHashMapByValue {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        LinkedHashMap<String, Integer> sortedMap = new LinkedHashMap<>();
        ArrayList<Integer> list = new ArrayList<>();
        map.put("Ayodhyanagar", 5);
        map.put("Futala", 7);
        map.put("Chandannagar", 3);
        map.put("Pratapnagar", 1);
        map.put("Abhyankarnagar", 2);
        map.put("Beltarodi", 8);
        map.put("Jaripatka", 4);
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            list.add(entry.getValue());
        }
        Collections.sort(list);
        for (int num : list) {
            for (Entry<String, Integer> entry : map.entrySet()) {
                if (entry.getValue().equals(num)) {
                    sortedMap.put(entry.getKey(), num);
                }
            }
        }
        System.out.println(sortedMap);
    }
}