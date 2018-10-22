package my.examples.was;

public class Test02 {
    public static void main(String[] args){
        Parent p = new Child();
        System.out.println(p.i);
        p.print();
    }
}

class Parent{
    int i = 5;
    public void print(){
        System.out.println(i);
    }
}

class Child extends Parent{
    int i = 10;
    public void print(){
        System.out.println("value = : " + i);
    }
}