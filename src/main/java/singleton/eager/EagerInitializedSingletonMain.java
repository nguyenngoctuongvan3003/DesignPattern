package singleton.eager;

public class EagerInitializedSingletonMain {
    public static void main(String[] args) {
        EagerInitializedSingleton instance1 = EagerInitializedSingleton.getInstance();
        EagerInitializedSingleton instance2 = EagerInitializedSingleton.getInstance();

        if(instance1 == instance2) {
            System.out.println("Cả hai thể hiện giống nhau");
        }else {
            System.out.println("Singleton hoạt động không đúng");
        }
    }
}
