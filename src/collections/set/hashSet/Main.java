package collections.set.hashSet;

import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

        Set<Car> cars = new HashSet<Car>();
        cars.add(Car.carFactory("BMW", "Blue"));
        cars.add(Car.carFactory("Benz", "Red"));
        cars.add(Car.carFactory("pagani", "Yellow"));


        //print with iterator and while loop
//        Iterator <Car> iterator = cars.iterator();
//        while (iterator.hasNext())
//            System.out.println(iterator.next());

        //print with for loop
        printSet(cars);

        //remove elements
        cars.removeIf(car -> car.getName().contains("B"));

        printSet(cars);

    }

    private static void printSet(Set<Car> cars) {
        for (Car car : cars) {
            System.out.println(car);
        }
    }
}
