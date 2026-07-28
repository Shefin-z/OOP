
class MyThread2 implements Runnable{

    Thread t;
    public MyThread2(String threadName) {
        System.out.println("Calling the thread constructor!");
        t = new Thread(this, threadName);
        t.start(); // calling start method from here
    }

    @Override
    public void run() {
        for (int i = 10; i < 15; i++) {
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

            System.out.println(Thread.currentThread() + " >> " + i);
        }
    }
}


public class RunnableInt {
    public static void main(String[] args) throws InterruptedException {
        Thread t = Thread.currentThread(); // the main thread

//        Thread t2 = new Thread(new MyThread2("Cool"));
//        t2.start();
        MyThread2 t2 = new MyThread2("New Runnable");

        for (int i = 0; i < 5; i++) {
            Thread.sleep(2000);
            System.out.println(Thread.currentThread());
        }
    }
}
