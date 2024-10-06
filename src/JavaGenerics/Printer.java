package JavaGenerics;

public class Printer <T>{

    T PrintThing;

    public Printer(T printThing) {
        this.PrintThing = printThing;
    }

    public void print(){
        System.out.println(PrintThing);
    }

    public static void main(String[] args) {
        Printer<Integer> pr = new Printer<>(23);
        pr.print();
    }

}
