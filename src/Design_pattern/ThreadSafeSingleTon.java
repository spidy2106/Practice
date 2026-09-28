package Design_pattern;

public class ThreadSafeSingleTon {

    private static ThreadSafeSingleTon INSTANCE;

    private ThreadSafeSingleTon(){};

    public static synchronized ThreadSafeSingleTon getInstance(){
        if(INSTANCE == null)
            INSTANCE = new ThreadSafeSingleTon();
        return INSTANCE;
    }
}
