package lambda;

import java.util.ArrayList;
import java.util.List;

public class StringClass {
    public static void main(String[] args) {

        List<String> list = new ArrayList<String>();
        list.add("amir");
        list.add("sara");
        list.add("taghi");
        list.add("naghi");


//        List<Integer> list1 = new ArrayList<Integer>();
//        list1.add(1);
//        list1.add(2);
//        list1.add(3);
//        list1.add(4);
//
//        Integer sum1 = 0;
//
//        list1.forEach(
//                (l) -> sum1=sum1+(l)
//        );






//        final Integer[] sum = {0};
//        list1.forEach(
//                (m) -> sum[0] = sum[0] + m
//        );
//        System.out.println(sum[0]);
//    }

        list.forEach(
                (m)-> System.out.println(m)
        );


        for (int i = 0; i <list.size() ; i++) {

            System.out.println(list.get(i));

       }


    }}

