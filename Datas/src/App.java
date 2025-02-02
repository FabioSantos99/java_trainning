import java.util.Date;
import java.text.SimpleDateFormat;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class App {
    public static void main(String[] args) throws Exception {

        DateTimeFormatter sdf = DateTimeFormatter.ofPattern("dd/MM/yyy");
        DateTimeFormatter sdf1 = DateTimeFormatter.ISO_DATE_TIME;
        //SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM/yyyy HH:mm");

        Date x1 = new Date();
        // Date x2 = sdf.parse("29/10/2022");
        // Date x3 = sdf2.parse("29/10/2022 19:10:56");

        // System.out.println(x1);
        // System.out.println(x2);
        // System.out.println(x3);

        LocalDate x4 = LocalDate.now();
        LocalDateTime x5 = LocalDateTime.now();
        LocalDate x6 = LocalDate.of(2022, 4, 23);
        LocalDate x7 = LocalDate.parse("23/12/2023", sdf);
        LocalDateTime x8 = LocalDateTime.parse("2023-12-12T08:45:43");


        System.out.println(x4.toString());
        System.out.println(x5.toString());
        System.out.println(x6.toString());
        System.out.println(x7.toString());
        System.out.println(x8.format(sdf1));






    }
}
