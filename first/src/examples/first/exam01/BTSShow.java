package examples.first.exam01;

public class BTSShow implements Gate {
    @Override
    public void check(Ticket ticket) {
        if(!ticket.getTicketName().equals("BTS LA SHOW")){
            System.out.println("-_-;;;");
        }else{
            System.out.println("OK!");
        }
    }
}
