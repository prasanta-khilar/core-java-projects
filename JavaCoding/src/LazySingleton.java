public class LazySingleton extends MyClone{

    private static LazySingleton instance;
    LazySingleton() {}
    public static LazySingleton getInstance() {
        if(instance == null) {
            return instance = new LazySingleton();
        }else {
            return instance;
        }
    }


}
