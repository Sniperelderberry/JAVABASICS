class SimpleTask extends Thread {
    public void run() {
        System.out.println("Thread is executing a simple task.");
    }
}

public class ThreadExample {
    public static void main(String[] args) {
        SimpleTask task = new SimpleTask();
        task.start(); // Start the thread
    }
}
