package Design_pattern;

//Lazy implementation
public class LazySingleTon {
    private static LazySingleTon instance;

    private LazySingleTon(){};

    public static LazySingleTon getInstance(){
        if(instance==null)
            instance=new LazySingleTon();
        return instance;
    }
}
