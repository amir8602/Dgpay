package lambda;

public class ThreadClass {
    public static void main(String[] args) {
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 1000000; i++) {
                    System.out.println("hiiii");
                }
            }
        };

        Runnable runnable1 = () -> {
            for (int i = 0; i < 1000000; i++) {
                System.out.println("bye");
            }
        };
        RunnableImpl runnable2=new RunnableImpl();


        Thread th=new Thread(runnable2);
        Thread thread = new Thread(runnable);
        Thread thread1 = new Thread(runnable1);
        thread1.start();
        thread.start();
        th.start();
    }
}
