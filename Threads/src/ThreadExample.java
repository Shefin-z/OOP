// Task 1: Printing numbers
class PrintNumbers extends Thread {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Number: " + i);
//            try {
//                Thread.sleep(500); // Pause for 500 milliseconds
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
        }
    }
}

// Task 2: Printing letters
class PrintLetters extends Thread {
    public void run() {
        for (char ch = 'A'; ch <= 'E'; ch++) {
            System.out.println("Letter: " + ch);
//            try {
//                Thread.sleep(500); // Pause for 500 milliseconds
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
        }
    }
}

public class ThreadExample {
    public static void main(String[] args) { // Thread 3
        // Creating two threads
        PrintNumbers numbersThread = new PrintNumbers();
        PrintLetters lettersThread = new PrintLetters();

        // Starting both threads
        numbersThread.start(); // Thread 1
        lettersThread.start(); // Thread 2

        for (int i = 15; i<=20; i++)
        {
            System.out.println("in main :" + i);
        }
    }
}
