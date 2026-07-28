
class MyThread extends Thread{
    String name;

    public MyThread(String threadName) {
        this.name = threadName;
        start(); // we don't need to call the start separately, it will be called directly
    }

    @Override
    public void run() {
        for (int i = 10; i < 15; i++) {

//            try {
//                Thread.sleep(2000);
//            } catch (InterruptedException e) {
//                throw new RuntimeException(e);
//            }

            System.out.println(this.name + " >> " + i);
        }
    }
}


public class ThreadClass {
    public static void main(String[] args) throws InterruptedException {
        Thread t = Thread.currentThread(); // the main thread

        MyThread myThread = new MyThread("MyThread"); // myThread obj is created, no new thread is created
        //myThread.start();


        for (int i = 0; i < 5; i++) {
//            Thread.sleep(2000);
            System.out.println("Main Thread" + " >> " + i);
        }

    }
}
