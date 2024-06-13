package ra.business;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        BookManagement bookManagement = new BookManagement();
        Scanner scanner = new Scanner(System.in);
        boolean isFlag = true;
        while (isFlag) {
            System.out.println("1. Add new book");
            System.out.println("2. Display data");
            System.out.println("3. Sort books by interest");
            System.out.println("4. Delete book");
            System.out.println("5. Search book");
            System.out.println("6. Update book");
            System.out.println("7. Exit");
            System.out.println("Enter your choice:");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    bookManagement.addBook();
                    break;
                case 2:
                    bookManagement.displayData();
                    break;
                case 3:
                    bookManagement.sortBooksByInterest();
                    break;
                case 4:
                    bookManagement.deleteBook();
                    break;
                case 5:
                    bookManagement.searchBook();
                    break;
                case 6:
                    bookManagement.updateBook();
                    break;
                case 7:
                    isFlag = false;
                    break;
                default:
                    System.out.println("Invalid choice. Please enter again.");
                    break;
            }
        }

    }
}
