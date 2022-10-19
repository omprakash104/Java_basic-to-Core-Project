package company2;

public class SingletonExample {

    private static SingletonExample singleton = null;
    public String s1;
    private SingletonExample() {
        s1 = "this is a private constructor";
    }

    public static SingletonExample createSingleTonObject() {
        if (singleton == null) {
            singleton = new SingletonExample();
        }
        return singleton;
    }
}
