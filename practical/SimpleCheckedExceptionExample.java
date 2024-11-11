import java.text.SimpleDateFormat;
import java.text.ParseException;

public class SimpleCheckedExceptionExample {

    public static void main(String[] args) {
        try {
            // Try to parse an invalid date string
            String dateStr = "2024-13-45"; // Invalid date
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            sdf.parse(dateStr); // This will throw ParseException
        } catch (ParseException e) {
            // Handle the checked exception
            System.out.println("Invalid date format: " + e.getMessage());
        }
    }
}
