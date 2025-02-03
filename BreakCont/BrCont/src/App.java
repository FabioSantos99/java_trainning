import java.util.Date;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class App {
    public static void main(String[] args) throws Exception {

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter dtf1 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy");

        Date x3 = new Date();

        LocalDate x1 = LocalDate.parse("30/10/2024", dtf);
        LocalDateTime x2 = LocalDateTime.parse("18/11/2000 17:55:56", dtf1);

        System.out.println(x1);
        System.out.println(x2);
        System.out.println(x3);



        // for (int i = 1; i<10; i++) {
        //     if(i == 5) {
        //         continue;
        //     }
        //     System.out.println(i);
        // }

        // System.out.println("-------");

        // for (int j = 1; j<10; j++) {
        //     if (j==6) {
        //         break;
        //     }
        //     System.out.println(j);
        // }

    }
}
