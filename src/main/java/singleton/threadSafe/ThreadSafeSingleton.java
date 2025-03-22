package singleton.threadSafe;

public class ThreadSafeSingleton {
    private static ThreadSafeSingleton instance;

    private ThreadSafeSingleton() {}

    public static ThreadSafeSingleton getInstanceUsingDoubleLocking() {
        if (instance == null) { // Kiểm tra lần 1
            synchronized (ThreadSafeSingleton.class) { // Khóa đồng bộ
                if (instance == null) { // Kiểm tra lần 2
                    instance = new ThreadSafeSingleton();
                }
            }
        }
        return instance;
    }
}
