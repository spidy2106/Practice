package Design_pattern;

// Basic Implementation of SingleTon Design Pattern
//Eager implementation
public class EagerSingleTon {

    private static EagerSingleTon instance;

    private EagerSingleTon(){}

    public static EagerSingleTon getInstance(){
        return instance;
    }
}
