
class SumThread extends Thread{
    int start, end, sum;

    public SumThread(int start, int end) {
        this.start = start;
        this.end = end;
    }

    public void run() {
        for (int i = start; i <= end; i++) {
            sum = sum + i;
        }
    }
}


public class Summation {

    public static void main(String[] args) {

        SumThread t1 = new SumThread(0, 5);//add numbers from 0 to 5
        SumThread t2 = new SumThread(6, 10);//add numbers from 6 to 10

        t1.start();
        t2.start();

        try {
            t1.join(); //main thread is stuck here until t1 thread finishes its works
            System.out.println("T1 done in main");
            t2.join(); //main thread is stuck here until t2 thread finishes its works
            System.out.println("T2 done in main");
        }catch (InterruptedException e) {
            System.out.println("Interrupt Exception occurred");
            System.out.println(e.getMessage());
        }


//        try {
//            Thread.sleep(30);
//        }catch (InterruptedException e) {
//            System.out.println("Interrupt Exception occurred");
//            System.out.println(e.getMessage());
//        }

        // what's the problem with this line of code
        int finalSum = t1.sum + t2.sum;
        System.out.println("Final Sum: " + finalSum);

//        Thread.sleep(30);
//        int sum = t1.sum;
//        System.out.println("Final Sum: " + sum);
    }
}
