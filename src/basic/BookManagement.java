package ra.basic;

import java.util.Arrays;
import java.util.Scanner;

public class BookManagement {
    Book[] books;
    Scanner scanner = new Scanner(System.in);

    public Book inputData() {
        String bookName, author, descriptions;
        double importPrice, exportPrice;
        float interest;
        boolean bookStatus;

        System.out.println("Enter book name:");
        bookName = scanner.nextLine();
        while (bookName.isEmpty()) {
            System.out.println("Book name cannot be empty. Please enter again:");
            bookName = scanner.nextLine();
        }

        System.out.println("Enter author name:");
        author = scanner.nextLine();
        while (author.isEmpty()) {
            System.out.println("Author name cannot be empty. Please enter again:");
            author = scanner.nextLine();
        }

        System.out.println("Enter descriptions:");
        descriptions = scanner.nextLine();
        while (descriptions.length() < 10) {
            System.out.println("Descriptions must be at least 10 characters. Please enter again:");
            descriptions = scanner.nextLine();
        }

        System.out.println("Enter import price:");
        importPrice = Double.parseDouble(scanner.nextLine());

        while (importPrice < 0) {
            System.out.println("Invalid input. Please enter a number:");
            importPrice = Double.parseDouble(scanner.nextLine());
        }

        System.out.println("Enter export price:");
        exportPrice = Double.parseDouble(scanner.nextLine());
        while (exportPrice < importPrice * 1.2) {
            System.out.println("Invalid input. Please enter a number:");
            exportPrice = Double.parseDouble(scanner.nextLine());
        }
        interest = (float) (exportPrice - importPrice);

        System.out.println("Enter book status (true for available, false for not available):");
        String bookStatusInput = scanner.nextLine();
        while (!bookStatusInput.equalsIgnoreCase("true") && !bookStatusInput.equalsIgnoreCase("false")) {
            System.out.println("Invalid input. Please enter true or false:");
            bookStatusInput = scanner.nextLine();
        }
        bookStatus = Boolean.parseBoolean(bookStatusInput);
        return new Book(bookName, author, descriptions, importPrice, exportPrice, interest, bookStatus);
    }

    // 1. Add book:
    public void addBook() {
        System.out.println("Enter number of books you want to add:");
        int n = Integer.parseInt(scanner.nextLine());
        while (n <= 0) {
            System.out.println("Invalid input. Please enter a number:");
            n = Integer.parseInt(scanner.nextLine());
        }
        books = new Book[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Enter information for book " + (i + 1) + ":");
            books[i] = inputData();
        }
    }

    // 2. Display data
    public void displayData() {
        if (books == null) {
            System.out.println("No data to display.");
            return;
        }
        for (Book book : books) System.out.println(book);
    }

    // 3. Sử dụng thuật toán sắp xếp để sắp xếp sách đang lưu trữ theo lợi nhuận tăng.
    public void sortBooksByInterest() {
        Arrays.sort(books, (book1, book2) -> Float.compare(book1.getInterest(), book2.getInterest()));
    }

    // 4. Nhập mã sách cần xóa từ bàn phím, thực hiện xóa sách trong danh sách.
    public void deleteBook() {
        System.out.println("Enter book id you want to delete:");
        int bookId = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < books.length; i++) {
            if (books[i].getBookId() == bookId) {
                books[i] = null;
                break;
            }
        }
    }

    // 5. Nhập chuỗi tìm kiếm từ bàn phím, thực hiện tìm và in ra những sách có tên hoặc mô tả phù hợp.
    public void searchBook() {
        System.out.println("Enter search keyword:");
        String keyword = scanner.nextLine();
        for (Book book : books) {
            if (book.getBookName().contains(keyword) || book.getDescriptions().contains(keyword))
                System.out.println(book);
        }
    }

    //    6. Nhập vào mã sản phẩm, thay đổi các thông tin sách , chú ý validate dữ liệu như thêm mới.
    public void updateBook() {
        System.out.println("Enter book id you want to update:");
        int bookId = Integer.parseInt(scanner.nextLine());
        for (Book book : books) {
            if (book.getBookId() == bookId) {
                System.out.println("Enter new information for book:");
                books[bookId] = inputData();
                break;
            }
        }
    }

}
