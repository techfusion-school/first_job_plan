import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicBoolean;

public class Concurrency_5 {

    public static void main(String[] args) throws InterruptedException {
        // Потоки. Отличие от Процесса. Порядок запуска и вывода
        new Thread(() -> {
            System.out.println("Hello");
        }).start();

        new Thread(() -> {
            System.out.println("World");
        }).start();

        // Примитивы синхронизации. volatile, synchronized
        VolatileUpdate volatileUpdate = new VolatileUpdate();
        new Thread(() -> {
            //noinspection StatementWithEmptyBody
            while (!volatileUpdate.isSet()) {
            }
            System.out.println("Thread exited");
        }, "SetWaiter").start();
        Thread.sleep(10000);

        new Thread(volatileUpdate::set).start();

        // wait/notify
        Object obj = new Object();
        AtomicBoolean waitEnded = new AtomicBoolean(false);
        new Thread(() -> {
            try {
                while (!waitEnded.get()) {
                    synchronized (obj) {
                        obj.wait();
                    }
                }
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("Wait ended");
        }).start();
        sleepNoInterrupt(1000);
        new Thread(() -> {
            System.out.println("Notify Thread started");
            synchronized (obj) {
                obj.notify();
                waitEnded.set(true);
            }
        }).start();

        // Thread executors
        try (ExecutorService executorService = Executors.newFixedThreadPool(2)) {
            executorService.execute(() -> {
                sleepNoInterrupt(1000);
                System.out.println("Hello");
            });
            executorService.execute(() -> {
                sleepNoInterrupt(1000);
                System.out.println("World");
            });
        }

        // lock, semaphore, CountDownLatch, дедлоки
    }

    private static void sleepNoInterrupt(int millis) {
        try {
            Thread.sleep(millis);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            throw new RuntimeException(e);
        }
    }
}

class VolatileUpdate {

    volatile boolean set = false; // почему если мы уберем volatile, то поток SetWaiter не завершится?

    public boolean isSet() {
        return set;
    }

    public void set() {
        set = true;
    }
}

