package function;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main3 {
    public static void main(String[] args) {
//        List<Integer> integers = new ArrayList<Integer>();
//        integers.add(15);
//        integers.add(19);
//        integers.add(12);
//        integers.add(8);
//        integers.add(5);
//        integers.add(21);
//        integers.add(26);
//        integers.add(14);
//        integers.add(24);
//        integers.add(32);
//        integers.add(28);


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


//        Map<String, Integer> map = new HashMap<String, Integer>();
//
//        List <String> strings = new ArrayList<>();
//        strings.add("d");
//        strings.add("c");
//        strings.add("a");
//        strings.add("b");
//        strings.add("a");
//        strings.add("z");
//        strings.add("b");
//        strings.add("d");
//        strings.add("a");
//        strings.add("a");
//
//
//
//
//
//        Map<String, Long> collect = strings.stream()
//                .collect(Collectors.groupingBy(Function.identity(), ))
//                .entry()
//                .sorted(Map.Entry.comparingByValue());











        //System.out.println(collect);



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

//        integers.stream()
//                .filter(integer -> integer % 2 == 0)
//                .filter(integer -> integer > 13)
//                .sorted(Integer::compareTo)
//                .limit(5)
//                .collect(Collectors.toList())
//                .forEach(integer -> System.out.println(integer));


        //System.out.println(collect);

//        stream.forEach(integer -> System.out.println(integer));


//        System.out.println(stream.collect();
//
//        List <Integer> =  Collectors.toList();



//        char[] charss = {'a','b','c','d','e'};
//
//        Stream<Character> ali = new String(charss).chars().mapTo(value -> (char) value);
//
//        ali.forEach(character -> System.out.println(character));

//        charss.chars().ma
//
//        List<char[]> collect = Stream.of(charss).collect(Collectors.toList());
//        collect.forEach(chars1 -> System.out.println(chars1));




        //  16  17   6   2   5   3    source



        //  17
        //  17   6
        //  17   6   5
        //  17   6   5   5
        //  17   6   5   5   3
        //  17   6   5   5   3   -1



        //  17   6   5   5   3   -1    target


//        List<Integer> integers = new ArrayList<Integer>();
//        integers.add(16);
//        integers.add(17);
//        integers.add(6);
//        integers.add(2);
//        integers.add(5);
//        integers.add(3);

//        int[] replace = replace(ints);
//        for (int i : replace) {
//            System.out.println(i);
//        }
        //int [] ints = new int[]{12,189,564,11,25,64};



//        int [] ints = new int[]{16,17,6,2,5,3};
//        int [] ints1 = new int[6];
//        int max = 0;
//        for (int i = 0; i <ints.length-1; i++) {
//            max = ints[i+1];
//            for (int j =i+1; j <ints.length ; j++) {
//                if (max<ints[j]){
//                    max=ints[j];
//                }
//            }
//            ints1[i]=max;
//        }
//        ints1[ints1.length-1]=-1;
//        for (int i : ints1) {
//            System.out.println(i);
       // }
    }

//    public static Map<String, Long> topFrequent(List<String> input){
//
//
//        Map<String, Long> collect = input.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
//
//
//    }

    public static int [] replace(int [] input){
        int [] inputReplaced = new int[input.length];
        int counter1 = 0,counter2=0,maximum=0;
            while (counter1<input.length-1){
                maximum=input[counter1+1];
                counter2=counter1+1;
                while (counter2<input.length){
                    maximum=Math.max(maximum,input[counter2]);
                    counter2++;
                }
                inputReplaced[counter1]=maximum;
                counter1++;
            }
            inputReplaced[input.length-1]=-1;
        return inputReplaced;
    }


}
