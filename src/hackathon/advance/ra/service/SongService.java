package hackathon.advance.ra.service;

import hackathon.advance.ra.model.Song;

import java.util.Scanner;

public class SongService {
    static Song[] songs = new Song[0];
    Scanner scanner = new Scanner(System.in);

    public Song inputData() {
        Song song = new Song();
        System.out.println("Nhap id baif hats");
        song.setSongId(scanner.nextLine());
        System.out.println("Nhap ten bai hat");
        song.setSongName(scanner.nextLine());
        System.out.println("Nhap ten tac gia");
        song.setSongWriter(scanner.nextLine());
        System.out.println("Nhap mo ta");
        song.setDescriptions(scanner.nextLine());
        System.out.println("danh sách ca sĩ");
        for (int i = 0; i < SingerService.singers.length; i++) {
            ;
            System.out.printf("| STT : %d  -  Name : %s |\n", i, SingerService.singers[i].getSingerName());
        }
        ;
        // yêu cầu nhập lựa chọn
        System.out.println("hay chon ca si cho bai hat");
        int indexSinger = Integer.parseInt(scanner.nextLine());
        song.setSinger(SingerService.singers[indexSinger]);
        return song;

    }

    ;

    public void addNewSong() {
        Song newSong = inputData();
        Song[] newSongs = new Song[songs.length + 1];
        // copy mảng cũ sang mảng mới
        System.arraycopy(songs, 0, newSongs, 0, songs.length);
        /*
        for (int i = 0; i < songs.length; i++) {
            newSongs[i] = songs[i];
        }
        * */
        // gan phan tư cuoi cung = newsong
        newSongs[newSongs.length - 1] = newSong;
        songs = newSongs;
    }

    public void displaySong() {
//        Arrays.stream(songs).forEach(System.out::println);  -  java 8
        for (Song s : songs) {
            System.out.println(s);
        }
    }

}
