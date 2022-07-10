package function;

public interface SayAble {
    default void say(){
        System.out.println("say hello");
    };



    void getage();

}
