package examples.first.exam01;

import java.util.Collections;
import java.util.List;

public class Dealer {
    private String name;
    private List<Player> playetList;
    private List<Card> cardList;
    private int index;

    public Dealer(String name){
        this.name = name;
        this.index = 0;
    }

    public void setPlayetList(List<Player> playetList){
        this.playetList = playetList;
    }

    public void setCards(List<Card> cardList){
        this.cardList = cardList;
    }

    public void newGame(){
        index = 0;
        for(Player player: playetList){
            player.clear();
        }
    }

    public void mix(){
        Collections.shuffle(cardList);
    }

    public Card getCard(){
        // index++가 파라미터나 어떤 식에서 사용된다면
        // index값이 사용되고 1이 증가한다.
        // return cardList.get(index++);
        Card card = cardList.get(index);
        index++;
        return card;
    }

    public void result(){
        // 플레이어들로부터 카드들을 구해서 가장 높은 사람을 출력.
        for(Player player:playetList){
            System.out.println(player.getCards());
        }
    }

}
