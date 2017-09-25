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

       

    }
}