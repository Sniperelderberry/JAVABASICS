class SimpleRunnable implements Runnable {
    public void run() {
        System.out.println("Thread is executing a simple task.");
    }
}

public class RunnableExample {
    public static void main(String[] args) {
        SimpleRunnable task = new SimpleRunnable();
        Thread thread = new Thread(task); // Create a new thread with the Runnable
        thread.start(); // Start the thread
    }
}
