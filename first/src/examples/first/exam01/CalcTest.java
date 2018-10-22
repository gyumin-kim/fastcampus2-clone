package examples.first.exam01;

public class CalcTest {
    public static void main(String[] args){
        Calc cal1 = new Calc(500);

        System.out.println(cal1.getValue());

        cal1.plus(50);

        System.out.println(cal1.getValue());

        cal1.plus(100);

        System.out.println(cal1.getValue());

    }
}
