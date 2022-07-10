package function;

import java.util.Scanner;
import java.util.function.*;

public class Main {
    public static void main(String[] args) {
//        String s = new String("ali");
//
//        Predicate<String> predicate = (n) ->n.length()<0;
//        System.out.println(predicate.test(s));
//
//
//        System.out.println(Main.notEmpty(s));

        Scanner scanner = new Scanner(System.in);


//        Function<String,String> function=s -> s+" "+"reza";
//        System.out.println(function.apply(scanner.next()));



        Person person12=new Person(true,23);


        //upplier<Person> personSupplier = () -> new Person(scanner.nextBoolean(),scanner.nextInt());




        Consumer <String> consumer = s -> s=s+"reza";
        consumer.accept("amir");


//        BiFunction<>


//        Supplier<Person> personSupplier2 = () -> new Person();
//        Person person = personSupplier2.get();







//        person.setSex(true);
//        person.setAge(23);



//        Person person = personSupplier.get();
//        System.out.println(person);


    }

//    public Person create(){
//        Scanner scanner = new Scanner(System.in);
//        return new Person(scanner.)
//    }


    public static boolean notEmpty(String str){
       return str.length()<0;
    }

//    public void sumsum(String firstname){
//        firstname=firstname+"   "+firstname;
//        System.out.println(firstname);
//
//    }




}
