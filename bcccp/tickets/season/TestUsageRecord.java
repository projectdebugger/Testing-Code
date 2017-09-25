package bcccp.tickets.season;

/**
 *
 * 
 */
public class TestUsageRecord {
         public static void main(String[] args){
          System.out.println("This is Testing TestUsageRecord main before testing....");
        /** Creating the instance of Usage Record**/
           UsageRecord ticket1 = new UsageRecord("S0011", 1203201703 );
           System.out.println("Unique Season Usage Record is: :  Ticket number "+ ticket1.getSeasonTicketId()+" Season ticket Valid start date and time "+ticket1.getStartTime());
	   System.out.println("Throwing an exception when season ticket id is null ");
           UsageRecord ticket2 = new UsageRecord("", 120320170);
           System.out.println("Unique Season Ticket Id is: "+ ticket2.getSeasonTicketId()+" Valid start date "+ticket2.getStartTime());
           
        
         }
}