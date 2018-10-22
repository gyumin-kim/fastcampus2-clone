package examples.first.exam01;

public class ExecutorMain {
    public static void main(String[] args){
        BaseAction action = new MyAction();
        Executor executor = new Executor();
        executor.exec(action);
    }
}
