package hackathon.advance.ra.service;

import hackathon.advance.ra.model.Singer;

import java.util.Scanner;

public class SingerService {
    static Singer[] singers = new Singer[0];
    Scanner scanner = new Scanner(System.in);

    public Singer inputData() {
        String singerName, nationality, genre;
        int age;
        boolean gender = false;

        System.out.println("Enter singer name:");
        singerName = scanner.nextLine();
        while (singerName.isEmpty()) {
            System.out.println("Singer name cannot be empty. Please enter again:");
            singerName = scanner.nextLine();
        }

        System.out.println("Enter age:");
        age = Integer.parseInt(scanner.nextLine());
        while (age <= 0) {
            System.out.println("Invalid input. Please enter a age:");
            age = Integer.parseInt(scanner.nextLine());
        }
        System.out.println("nhap quoc tich");
        nationality = scanner.nextLine();
        while (nationality.isEmpty()) {
            System.out.println("Nationality cannot be empty. Please enter again:");
            nationality = scanner.nextLine();
        }

        System.out.println("Enter gender:");
        String genderInput = scanner.nextLine();
        while (!genderInput.equalsIgnoreCase("true") && !genderInput.equalsIgnoreCase("false")) {
            System.out.println("Invalid input. Please enter true or false:");
            genderInput = scanner.nextLine();
        }
        switch (genderInput) {
            case "true" -> gender = true;
            case "false" -> gender = false;
            default -> System.out.println("Invalid choice. Please enter again.");
        }
        System.out.println("nhap the loai");

        genre = scanner.nextLine();
        while (genre.isEmpty()) {
            System.out.println("Genre cannot be empty. Please enter again:");
            genre = scanner.nextLine();
        }
        return new Singer(singerName, age, nationality, gender, genre);
    }

    // Add singer:
    public void addSinger() {

        System.out.println("Enter number of singers you want to add:");
        int n = Integer.parseInt(scanner.nextLine());
        singers = new Singer[singers.length + n];
        for (int i = 0; i < n; i++) {
            System.out.println("Enter singer " + (i + 1) + " information:");
            singers[singers.length - n + i] = inputData();
        }
    }

    // displaySinger
    public void displaySinger() {
        if (singers.length == 0) System.out.println("No singer to display.");
        else {
            for (Singer singer : singers) System.out.println(singer);
        }
    }

    // delete Singer
    public void deleteSinger() {
        System.out.println("Enter id singer you want to delete:");
        int idDelete = Integer.parseInt(scanner.nextLine());
        boolean isCheck = false;
        for (int i = 0; i < singers.length; i++) {
            if (singers[i].getSingerId() == idDelete) {
                singers[i] = null;
                isCheck = true;
                break;
            }
        }
        if (isCheck) System.out.println("Delete singer successfully.");
        else System.out.println("Delete singer failed.");
    }

    // update singer:
    public void updateSinger() {
        System.out.println("Enter id singer you want to update:");
        int idUpdate = Integer.parseInt(scanner.nextLine());
        boolean isCheck = false;

        for (int i = 0; i < singers.length; i++) {
            if (singers[i].getSingerId() == idUpdate) {
                singers[i] = inputData();
                isCheck = true;
                break;
            }
        }
        if (isCheck) System.out.println("Update singer successfully.");
        else System.out.println("Update singer failed.");
    }

    // Search singer: genre || singerName
    public void searchSinger() {
        System.out.println("Enter singer name or genre you want to search:");
        String search = scanner.nextLine();
        boolean isCheck = false;
        for (int i = 0; i < singers.length; i++) {
            if (singers[i].getSingerName().toLowerCase().contains(search.trim().toLowerCase()) || singers[i].getGenre().toLowerCase().contains(search.trim().toLowerCase())) {
                System.out.println(singers[i]);
                isCheck = true;
            }
        }
        if (!isCheck) System.out.println("Not found!!!");
    }

}
