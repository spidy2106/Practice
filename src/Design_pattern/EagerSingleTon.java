package Design_pattern;

// Basic Implementation of SingleTon Design Pattern
//Eager implementation
public class SingleTon {

    private static SingleTon instance;

    private SingleTon(){}

    public static SingleTon getInstance(){
        return instance;
    }
}
