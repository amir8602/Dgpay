package sara;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Person> list = new ArrayList<>();
        list.add(Person.personFactory("sara", 164, 24));
        list.add(Person.personFactory("amir", 180, 34));
        list.add(Person.personFactory("asal", 156, 15));
        list.add(Person.personFactory("zahra", 123, 42));


//        Collections.sort(list,new PersonComparatorImpl());
//        System.out.println(list);
//        Collections.sort(list, new Comparator<Person>() {
//            @Override
//            public int compare(Person left, Person right) {
//                if (left.getHeight() > right.getHeight()) {
//                    return 1;
//                } else if (left.getHeight() < right.getHeight()) {
//                    return -1;
//                } else {
//                    return 0;
//                }
//            }
     //   });
//        Collections.sort(list, new Comparator<Person>() {
//
//            public int compare(Person left, Person right) {
//                if (left.getHeight() > right.getHeight()) {
//                    return 1;
//                } else if (left.getHeight() < right.getHeight()) {
//                    return -1;
//                } else {
//                    return 0;
//                }
//            }
//        System.out.println(list);
//
//    }

        Collections.sort(list,(left, right) -> {
            if (left.getHeight() > right.getHeight()) {
                return 1;
            } else if (left.getHeight() < right.getHeight()) {
                return -1;
            } else {
                return 0;
            }

        });

        System.out.println(list);
}}
