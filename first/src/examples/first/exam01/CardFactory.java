package examples.first.exam01;

import java.util.ArrayList;
import java.util.List;

// abstract클래스는 인스턴스를 생성할 수 없다.
public abstract class CardFactory {
    public static List<Card> create(){
        List<Card> list = new ArrayList<>();
        // 배열 선언하는 방법에 대하여 공부한다.
        String[] types = new String[]{"클로바", "하트", "다이아", "스페이스"};
        for(String type : types){
            for(int i = 1; i <= 13; i++){
                Card card = new Card(type, i);
                list.add(card);
            } // for
        } // for types
        return list;
    } // create()
}
