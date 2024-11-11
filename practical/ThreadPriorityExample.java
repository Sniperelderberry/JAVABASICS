class PriorityThread extends Thread {
    public void run() {
        System.out.println("Thread " + getName() + " is running.");
    }
}

public class ThreadPriorityExample {
    public static void main(String[] args) {
        PriorityThread thread1 = new PriorityThread();
        PriorityThread thread2 = new PriorityThread();
        PriorityThread thread3 = new PriorityThread();

        thread1.setPriority(Thread.MIN_PRIORITY); // Set minimum priority (1)
        thread2.setPriority(Thread.NORM_PRIORITY); // Set normal priority (5)
        thread3.setPriority(Thread.MAX_PRIORITY); // Set maximum priority (10)

        thread1.start(); // Start thread with low priority
        thread2.start(); // Start thread with normal priority
        thread3.start(); // Start thread with high priority
    }
}
