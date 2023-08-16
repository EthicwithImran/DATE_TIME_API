import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;   

/*Given a time at 12-hour AM/PM format, convert it to military (24-hour) time.
Note: Midnight is 12:00:00 AM on a 12-hour clock and 00:00:00 on a 24-hour clock.
 Noon is 12:00:00 PM on 12-hour clock and 12:00:00 on 24-hour clock */


class Timeapi{
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        System.out.println("Enter the time in 24 hours format like HH:MM:SS:AM/PM");
        String timeString =s.next();  //"12:00:00:AM";
        SimpleDateFormat inputFormat = new SimpleDateFormat("hh:mm:ss:a");
        
        try {
            Date date = inputFormat.parse(timeString);
            
            SimpleDateFormat outputFormat = new SimpleDateFormat("HH:mm:ss");
            String militaryTime = outputFormat.format(date);
            
            System.out.println("Military Time: " + militaryTime);
        } catch (Exception e) {
            System.out.println("Wrong time provided..");
        }
    }
}