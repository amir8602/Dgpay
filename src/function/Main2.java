package function;

import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.UnaryOperator;

public class Main2 {
    public static void main(String[] args) {
//        BiFunction<Address,Sex,Person2> biFunction =
//                (address, sex) -> new Person2(sex,address);
//        biFunction.apply(new Address(),new Sex());

//        BiFunction <Integer , Integer ,String > biFunction1 =
//                (integer, integer2) -> (integer+integer2)+"*";
//        System.out.println(biFunction1.apply(21, 1));

//        UnaryOperator<Person2> unaryOperator =
//                person2 -> person2;
//        Person2 apply = unaryOperator.apply(new Person2(new Sex(), new Address()));
//        System.out.println(apply);




        BinaryOperator<Integer> person2BinaryOperator  =
                (person2, person22) ->person2+person22;
        System.out.println(person2BinaryOperator.apply(2, 22));



    }
}
