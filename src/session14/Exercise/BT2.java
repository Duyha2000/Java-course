package session14.Exercise;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.time.temporal.ChronoUnit;

public class BT2 {
    public static void main(String[] args) {
//  Viết chương trình để lấy ngày hiện tại của hệ thống và các nơi bao gồm : Asia/Tokyo, Australia/Sydney ,America/Sao_Paulo
        ZoneId TIMEZONE_ET = ZoneId.of("America/New_York"); //  Asia/Tokyo, Australia/Sydney ,America/Sao_Paulo

        LocalDate systemDay = LocalDate.now(TIMEZONE_ET);
        System.out.println(systemDay); // 2024-06-26
//        Viết chương trình để lấy thời gian hiện tại (giờ phút giây).
        LocalTime systemTime = LocalTime.now();
        System.out.println(systemTime);
//      Viết chương trình để tính toán số ngày trong tháng hiện tại.
        int dayofMonth = YearMonth.of(systemDay.getYear(), systemDay.getMonth()).lengthOfMonth();
        System.out.println("Day of month " + dayofMonth);
//      Viết chương trình để chuyển đổi một chuỗi ngày sang một đối tượng LocalDate.
        String text = "13/09/2024";
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy"); // format ngày tháng năm
        try {
            String text2 = systemDay.format(formatter);
            System.out.println(text2 + " text2");

            String s1 = LocalDate.parse(text, formatter).format(formatter);
            System.out.println(s1 + " text"); // 13/09/2024
        } catch (DateTimeParseException e) {
            System.err.println(e);
        }

//    Viết chương trình để chuyển đổi một đối tượng LocalDateTime sang một chuỗi ngày(dd/MM/yyyy HH:mm:ss).
        DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern("HH:mm:ss dd/MM/yyyy ");
        LocalDateTime s1 = LocalDateTime.now(); // dd/MM/yyyy HH:mm:ss
        String textDateTime = s1.format(formatter2);
        System.out.println(textDateTime);
//      Viết chương trình để so sánh hai ngày LocalDate ( trả về int ).
        LocalDate date1 = LocalDate.of(2023, 12, 9);
        LocalDate date2 = LocalDate.of(2022, 11, 5);

        long elapsedDays = Math.abs(ChronoUnit.DAYS.between(date1, date2));

        System.out.println(elapsedDays);

    }
}
