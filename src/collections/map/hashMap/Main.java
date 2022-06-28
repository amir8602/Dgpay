package collections.map.hashMap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        Map<Long, Car> map = new HashMap<Long, Car>();
        map.put(1L, Car.carFactory("BMW", "Blue"));
        map.put(4L, Car.carFactory("Benz", "Red"));
        map.put(3L, Car.carFactory("pagani", "Yellow"));
        map.put(2L, Car.carFactory("ferari", "Black"));

        printMap(map);
        System.out.println();

        map.put(2L, Car.carFactory("Audi", "Brown"));

        printMap(map);
        System.out.println();

        map.remove(4L);
        printMap(map);

    }

    private static void printMap(Map<Long, Car> map) {
        Iterator<Car> iterator = map.values().iterator();
        while (iterator.hasNext())
            System.out.println(iterator.next());
    }
}
