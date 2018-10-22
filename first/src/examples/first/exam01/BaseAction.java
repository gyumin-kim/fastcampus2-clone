package examples.first.exam01;

// 선배
public abstract class BaseAction {
    public final void a(){
        System.out.println("aaaaaa");
    }
    public final void logic(){ // 오버라이딩 금지
        a();
        run();
        b();
    }
    public abstract void run(); // 미완성 메소드

    public final void b(){
        System.out.println("bbbbb");
    }
}
