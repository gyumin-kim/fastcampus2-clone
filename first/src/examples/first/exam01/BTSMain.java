package examples.first.exam01;

public class BTSMain {
    public static void main(String[] args){
        Gate show = new BTSShow();

        Ticket a1 = new Army();

        show.check(a1);
    }
}
