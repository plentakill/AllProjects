import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        System.out.printf("Hello %s!%n", "world!");
        Date d = new Date();
        System.out.println(d);
        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy hh:mm:ss a");
        String format = dateFormat.format(d);
        System.out.printf("Two-digit month: %tm ",d);
    }
}