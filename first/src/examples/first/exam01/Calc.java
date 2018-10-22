package examples.first.exam01;

/**
 * 간단한 계산기
 */
public class Calc {
    // 필드(속성)를 선언
    private int value;

    // 기본생성자.
    public Calc(){
        this.value = 0;
    }
    // 생성자
    public Calc(int value){
        // 필드 value를 파라미터 value로 초기화한다.
        this.value = value;
    }

    /**
     * plusValue를 받아서 누적한다.
     * @param plusValue
     */
    public void plus(int plusValue){
        this.value = this.value + plusValue;
    }

    public void minus(int minusValue){
        this.value = this.value - minusValue;
    }

    public void clear(){
        this.value = 0;
    }

    /**
     * 내부적인 값을 반환한다.
     * @return
     */
    public int getValue(){
        return this.value;
    }
}
