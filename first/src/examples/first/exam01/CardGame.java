package examples.first.exam01;

import java.util.ArrayList;
import java.util.List;

public class CardGame {
    public static void main(String[] args){
        List<Card> cards = CardFactory.create();
//        for(Card card: cards){
//            System.out.println(card);
//        }

        Dealer dealer = new Dealer("고니");
        dealer.setCards(cards);

        List<Player> playerList = new ArrayList<Player>();
        playerList.add(new Player("홍길동"));
        playerList.add(new Player("고길동"));
        playerList.add(new Player("강길동"));

        dealer.setPlayetList(playerList);

        dealer.newGame();

        dealer.mix();


        for(int i = 0; i < 5; i++){
            for(Player player : playerList){
                player.addCard(dealer.getCard());
            }
        }

        dealer.result();
    }
}
