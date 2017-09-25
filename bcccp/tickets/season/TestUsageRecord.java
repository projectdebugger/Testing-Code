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

        
         }
}