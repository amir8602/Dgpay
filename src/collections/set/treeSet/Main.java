package collections.set.treeSet;

import java.math.BigDecimal;
import java.util.Iterator;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {

        TreeSet<Car> cars = new TreeSet<Car>();
        cars.add(Car.carFactory("BMW" , "Blue" , BigDecimal.valueOf(120000)));
        cars.add(Car.carFactory("Benz" , "Red" , BigDecimal.valueOf(110000)));
        cars.add(Car.carFactory("pagani" , "Black" , BigDecimal.valueOf(180000)));
        cars.add(Car.carFactory("Ferari" , "Yellow" , BigDecimal.valueOf(210000)));
        cars.add(Car.carFactory("Rols" , "white" , BigDecimal.valueOf(250000)));

        for (Car car : cars) {
            System.out.println(car);
        }
        System.out.println();
        Car higher = cars.higher(Car.carFactory("Ferari" , "Yellow" , BigDecimal.valueOf(210000)));
        System.out.println(higher);

        //remove
        cars.remove(Car.carFactory("Ferari" , "Yellow" , BigDecimal.valueOf(210000)));

        System.out.println();

        Iterator iterator = cars.iterator();
        while (iterator.hasNext())
            System.out.println(iterator.next());


    }
}
