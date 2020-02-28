package threadingexample.producerconsumer;

public class Data {

    int num;

    boolean isValueSet;

    public synchronized int getNum() {


        while (!isValueSet) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println("Get: " + num);
        isValueSet = false;
        notify();
        return num;
    }

    public synchronized void setNum(int num) {

        while (isValueSet) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        this.num = num;
        System.out.println("Set: " + num);
        isValueSet = true;
        notify();
    }
}
