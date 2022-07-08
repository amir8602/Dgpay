package lambda;

import java.time.Period;
import java.util.LinkedList;
import java.util.List;

public class ForEach {
    public static void main(String[] args) {
        List<Integer> integers = new LinkedList<Integer>();
        integers.add(5);
        integers.add(4);
        integers.add(9);
        integers.add(8);

        integers.forEach(
                m -> System.out.println(m+1)
                        );

        System.out.println(integers);


    }

}
