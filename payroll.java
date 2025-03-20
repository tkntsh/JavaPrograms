import java.text.DecimalFormat;

public class payroll 
{
    public static void main(String[] args) 
    {
        //salaries in ZAR
        double[] salaries = {25000.00, 30000.00, 45000.00}; 
        double totalPayroll = calculatePayroll(salaries);
        //no commas, matching "R123456.78" format
        DecimalFormat df = new DecimalFormat("R0.00");
        System.out.println("Total payroll: " + df.format(totalPayroll));
    }

    public static double calculatePayroll(double[] salaries) 
    {
        double total = 0;
        for(double salary : salaries) 
        {
            //2% bonus
            total += salary * 1.02;
        }
        return total;
    }
}
