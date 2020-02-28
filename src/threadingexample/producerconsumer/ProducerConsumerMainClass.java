package threadingexample.producerconsumer;

// Producer
class Producer implements Runnable {

    Data data;

    public Producer(Data data) {
        this.data = data;
        new Thread(this).start();
    }

    @Override
    public void run() {
        int i = 0;

        while (true) {
            data.setNum(i++);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }
}

// Consumer
class Consumer implements Runnable {

    Data data;

    public Consumer(Data data) {
        this.data = data;
        new Thread(this).start();
    }

    @Override
    public void run() {
        int i = 0;

        while (true) {
            data.getNum();
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }
}


public class ProducerConsumerMainClass {

    public static void main(String args[]) {

        Data data = new Data();
        new Producer(data);
        new Consumer(data);
    }
}
