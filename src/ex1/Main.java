package ex1;

import java.util.Scanner;

public class Main {
//    public static void main(String[] args) {
//
//        List <Book> list = new ArrayList<>();
//        list.add(new Book("black",12000));
//        list.add(new Book("blue",15000));
//        list.add(new Book("white",11000));
//        list.add(new Book("pink",19000));
//        list.add(new Book("white",11000));
//
//
//        System.out.println(new Book("white",11000).equals(new Book("white",11000)));
//
//
//        list.stream().distinct().forEach(System.out::println);
//
//
//
//    }


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        String[] str = new String[input.length()];
        for (int i = 0; i < input.length(); i++) {
            str[i] = input.substring(i, i + 1);
        }
        int countRed = 0;
        int countGreen = 0;
        int countYellow = 0;

        for (int i = 0; i < str.length; i++) {
            if (str[i].equals("G")) {
                countGreen++;
            } else if (str[i].equals("R")) {
                countRed++;
            } else {
                countYellow++;
            }
        }

        System.out.println(countGreen);
        System.out.println(countRed);
        System.out.println(countYellow);


        if (countRed >= 3 || countRed >= 2 && countYellow >= 2 || countGreen < 1) {
            System.out.println("nakhor lite");
        }else {
            System.out.println("rahat baash");
        }


//        int[] integers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
//        int[] ints = new int[10];
//
//        ints[0]=integers[0]+1;
//        ints[1]=integers[1]+1;
//        ints[2]=integers[2]+1;
//        ints[3]=integers[3]+1;
//        ints[4]=integers[4]+1;
//        ints[5]=integers[5]+1;
//        ints[6]=integers[6]+1;
//        ints[7]=integers[7]+1;
//        ints[8]=integers[8]+1;
//        ints[9]=integers[9]+1;

//        System.out.println(ints[0]);
//        System.out.println(ints[1]);
//        System.out.println(ints[2]);
//        System.out.println(ints[3]);
//        System.out.println(ints[4]);
//        System.out.println(ints[5]);
//        System.out.println(ints[6]);
//        System.out.println(ints[7]);
//        System.out.println(ints[8]);
//        System.out.println(ints[9]);

//        System.out.format("%d  %d  %d  %d  %d  %d  %d  %d  %d  %d"
//                ,ints[0],ints[1],ints[2],ints[3],ints[4],ints[5],ints[6],ints[7],ints[8],ints[9]);

//        for (int i = 0; i < 10; i++) {
//            System.out.println(integers[i]);
//        }


    }

}
