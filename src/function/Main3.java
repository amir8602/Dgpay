package function;

import java.util.*;
import java.util.stream.Collectors;

public class Main3 {
    public static void main(String[] args) {
        List<Integer> integers = new ArrayList<Integer>();
        integers.add(15);
        integers.add(19);
        integers.add(12);
        integers.add(8);
        integers.add(5);
        integers.add(21);
        integers.add(26);
        integers.add(14);
        integers.add(24);
        integers.add(32);
        integers.add(28);


//

        //Stream<Integer> stream = integers.stream();


//        Map<String,Integer> map = new HashMap<String,Integer>();
//        map.put("a",4);
//        map.put("d",3);
//        map.put("f",7);
//        map.put("c",5);
//        map.put("x",2);
//
//        map.entrySet().stream().forEach(stringIntegerEntry -> System.out.println(stringIntegerEntry));



//        Map <String , Integer> map = new HashMap<String,Integer>();

        String [] strings = new String[12];
        strings[0] = "d";
        strings[1] = "c";
        strings[2] = "c";
        strings[3] = "a";
        strings[4] = "b";
        strings[5] = "a";
        strings[6] = "Z";
        strings[7] = "b";
        strings[8] = "d";
        strings[9] = "d";
        strings[10] = "a";
        strings[11] = "a";

        System.out.println(Arrays.stream(strings).noneMatch(a -> a.equalsIgnoreCase("z")));


//        List<String> collect = Arrays.stream(strings).filter((s) -> {
//                    if (map.containsKey(s)) {
//                        Integer integer = map.get(s);
//                        integer++;
//                        map.put(s, integer);
//                    } else {
//                        map.put(s, 1);
//                    }
//                    return false;
//                })
//                .collect(Collectors.toList());




//        Arrays.stream(strings).map(s -> )

//
//        System.out.println(map);
//        System.out.println(collect);

        integers.stream()
                .filter(integer -> integer % 2 == 0)
                .filter(integer -> integer > 13)
                .sorted(Integer::compareTo)
                .limit(5)
                .collect(Collectors.toList())
                .forEach(integer -> System.out.println(integer));


        //System.out.println(collect);

//        stream.forEach(integer -> System.out.println(integer));


//        System.out.println(stream.collect();
//
//        List <Integer> =  Collectors.toList();
    }
}
