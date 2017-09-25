package bcccp.tickets.season;

/**
 *
 * 
 */
public class TestSeasonTicket {
    
     public static void main(String[] args){
        /** printing the main**/        
        System.out.println("This is Testing TestSeasonTicket main before testing....");
        /** Creating the instance of SeasonTicket**/
       SeasonTicket ticket1 = new SeasonTicket("S0011","CP3",12022017,120320170 );
       System.out.println("Unique Season Ticket Id is: Season Ticket Id: "+ ticket1.getId()+" Season ticket carpark name:"+ticket1.getCarparkId()+" Valid start date "+ticket1.getStartValidPeriod()+" valid end date: "+ticket1.getEndValidPeriod());

       System.out.println("Throwing an exception when season ticket id is null ");
       SeasonTicket ticket2 = new SeasonTicket("","CP3",12022017,120320170);
       System.out.println("Unique Season Ticket Id is: "+ ticket2.getId()+" Season ticket carpark name:"+ticket2.getCarparkId()+" Valid start date "+ticket2.getStartValidPeriod()+" valid end date: "+ticket2.getEndValidPeriod());
        

    }
}