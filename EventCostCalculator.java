public class EventCostCalculator 
{
    public static double calculateEventCost(int[] attendees, double ratePerPerson, int largeEventThreshold, double fixedFee) 
    {
        int totalAttendees = 0;
        for(int i = 0; i < attendees.length; i++) 
        {
            totalAttendees += attendees[i];
        }
        
        double totalCost = totalAttendees * ratePerPerson;
        if(totalAttendees > largeEventThreshold) 
        {
            totalCost += fixedFee;
        }
        
        return totalCost;
    }
}
