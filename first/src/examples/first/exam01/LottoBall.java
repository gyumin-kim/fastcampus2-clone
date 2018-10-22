package examples.first.exam01;

// 특정 숫자로 태어나면, 이 숫자는 절대로 바꿀 수 없다.
public class LottoBall {
    private int number;

    // 생성자에거 특정 값을 가지고 태어나도록 한다.
    public LottoBall(int number){
        this.number = number;
    }

    // 자기자신의 번호를 리턴한다.
    public int getNumber(){
        return number;
    }
}
