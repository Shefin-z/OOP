public class Main {

    public static void main(String[] args) {

        Thread t = Thread.currentThread();
        System.out.println("Current Thread: " + t);
        t.setName("My Thread");
        System.out.println("After the name change");
        System.out.println("Current Thread: " + t);

        for (int i = 0; i < 5; i++) {
            System.out.println(i);
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
