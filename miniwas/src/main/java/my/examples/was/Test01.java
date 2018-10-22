package my.examples.was;

public class Test01 {
    public static void main(String[] args){
        Bus b = new Bus();
        b.a();
        b.run();

        Car c = new Bus();
        c.run();

        Object obj = new Bus();
    }
}

abstract class Car{
    public void run(){
        System.out.println("run");
    }
}

class Bus extends Car{
    public void a(){
        System.out.println("a");
    }
}