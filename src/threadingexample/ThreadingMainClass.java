package threadingexample;

class Hi implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Hi");
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class Hello implements Runnable{
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Hello");
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class ThreadingMainClass {

    public static void main(String args[]) throws InterruptedException {

        Hi hi = new Hi();
        Hello hello = new Hello();

        Thread t1 = new Thread(hi);
        t1.start();
        try {
            Thread.sleep(10);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        Thread t2 = new Thread(hello);
        t2.start();

        t1.join();
        t2.join();
        
        System.out.println("Bye");
    }
}
