public class SingletonApp {

    public static void main(String[] args) throws CloneNotSupportedException {

        LazySingleton lazySingleton = LazySingleton.getInstance();
        System.out.println(lazySingleton);
        LazySingleton lazySingleton2 = (LazySingleton)lazySingleton.clone();
        System.out.println(lazySingleton2);
    }
}
