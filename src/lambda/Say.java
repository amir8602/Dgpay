package lambda;

public class Say {
    public static void main(String[] args) {
//        Sayable sayable = (input)-> input;
//        System.out.println(sayable.say("amirreza"));


        Sayable say = (name, name2, a, b,c,d) -> {
            System.out.println(name +" "+ name2);
            System.out.println(a + b);
            Double dodo = c.doubleValue()/d.doubleValue();
            System.out.println(dodo);
        };


        say.sayAndCal("sara","jonam",10,13,5,2);



    }
}
