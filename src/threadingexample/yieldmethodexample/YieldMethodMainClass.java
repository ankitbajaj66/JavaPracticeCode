package threadingexample.yieldmethodexample;

class ChildThread extends Thread
{
    @Override
    public void run() {

        for (int i = 0; i < 5; i++) {
            System.out.println("ChildThread");
//            Thread.yield();
            /*try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }*/
        }
    }
}
public class YieldMethodMainClass {

    public static void main(String args[]) {

        ChildThread childThread = new ChildThread();
        childThread.start();

        for (int i = 0; i < 5; i++) {
            System.out.println("MainThread");

           /* try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }*/
        }
    }
}
