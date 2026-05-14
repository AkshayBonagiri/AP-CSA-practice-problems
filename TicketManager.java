public class TicketManager
{
    private int processedCount;
    private int urgentCount;

    /**
     * Simulates the processing of a chain of tickets starting with startTicket,
     * as described in part (a)
     * Precondition: startTicket is not null.
     */
    public void processTickets(String startTicket)
    { /* to be implemented in part (a) */ 
        processedCount = 0;
        urgentCount = 0;

        while(startTicket != null){
            processedCount++;
            if(isUrgent(startTicket)){
                urgentCount++;
            }
            startTicket = getNextTicket(startTicket);
        }
    }

    /**
     * Returns the ID of the ticket that follows the parameter ticketID,
     * or null if there are no more tickets in the chain.
     * Precondition: ticketID is not null.
     */
    public String getNextTicket(String ticketID)
    { /* implementation not shown */ }

    /**
     * Returns true if the ticket specified by ticketID is marked as urgent,
     * false otherwise.
     * Precondition: ticketID is not null.
     */
    public boolean isUrgent(String ticketID)
    { /* implementation not shown */ }

    /**
     * Generates and returns a short code based on the ticketID,
     * as described in part (b)
     * Precondition: ticketID contains a hyphen "-" and has at least
     *               two characters after the hyphen.
     */
    public String generateCode(String ticketID)
    { /* to be implemented in part (b) */ 
        String[] arr = ticketID.split("-");
        String result = "";
        if(arr[0].length() <= 3){
            result += arr[0].toUpperCase();
        }
        else{
            result += arr[0].substring(0,3).toUpperCase();
        }
        result += arr[1].substring(arr[1].length() - 2);

        return result;
    }

    /* There may be instance variables, constructors, and methods
       that are not shown. */
}