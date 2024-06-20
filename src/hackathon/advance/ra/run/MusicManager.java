package hackathon.advance.ra.run;


import hackathon.advance.ra.service.SingerService;
import hackathon.advance.ra.service.SongService;

import java.util.Scanner;

public class MusicManager {
    private final static Scanner scanner = new Scanner((System.in));
    private final static SingerService singerService = new SingerService();
    private final static SongService songService = new SongService();

    public static void main(String[] args) {
        while (true) {
            System.out.println("************************MUSIC-MANAGEMENT*************************\n" +
                    "1. Quản lý ca sĩ\n" +
                    "2. Quản lý bài hát\n" +
                    "3. Tìm kiếm bài hát\n" +
                    "4. Thoát\n" +
                    "[20 điểm] [20 điểm] [25 điểm]\n" +
                    "[5 điểm]");
            System.out.println("Nhap lua chon cua ban ");
            byte choice = Byte.parseByte(scanner.nextLine());
            switch (choice) {
                case 1:
                    // qwsn li cas dsi
                    showMenuSinger();
                    break;
                case 2:
                    // quanr lis baif hats
                    showMenuSong();
                    break;

            }
        }
    }

    public static void showMenuSinger() {
        while (true) {
            System.out.println("**********************SINGER-MANAGEMENT*************************\n " +
                    "1.Nhập vào số lượng ca sĩ cần thêm và nhập thông tin cần thêm mới (có validate dữ\n" +
                    "liệu nhập vào)\n" +
                    "2.Hiển thị danh sách tất cả ca sĩ đã lưu trữ\n" +
                    "3.Thay đổi thông tin ca sĩ theo mã id\n" +
                    "4.Xóa ca sĩ theo mã id (kiểm tra xem nếu ca sĩ có bài hát thì không xóa được)[5 điểm]" +
                    " 5.Thoát");
            System.out.println("Nhap lua chon cua ban ");
            byte choice = Byte.parseByte(scanner.nextLine());
            switch (choice) {
                case 1:
                    // theem mowis
                    singerService.addSinger();
                    break;
                case 2:
                    singerService.displaySinger();
                    ;
                    break;
                case 3:
                    singerService.updateSinger();
                    break;
                case 4:
                    singerService.deleteSinger();
                case 5:
                    // thoát
                    return;

            }
        }
    }

    public static void showMenuSong() {
        while (true) {
            System.out.println("**********************SONG-MANAGEMENT*************************\n" +
                    " 1.Nhập vào số lượng bài hát cần thêm và nhập thông tin cần thêm mới (có validate dữ\n" +
                    "liệu nhập vào)\n" +
                    "2.Hiển thị danh sách tất cả bài hát đã lưu trữ " +
                    "3.Thay đổi thông tin bài hát theo mã id " +
                    "4.Xóa bài hát theo mã id\n" +
                    "5.Thoát\n");
            System.out.println("Nhap lua chon cua ban ");
            byte choice = Byte.parseByte(scanner.nextLine());
            switch (choice) {
                case 1:
                    // theem mowis
                    songService.addNewSong();
                    break;
                case 2:
                    songService.displaySong();
                    break;
                case 5:
                    return;

            }
        }
    }
}
