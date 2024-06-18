package session06;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;
import java.util.regex.Pattern;

public class BT5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String productId, productName, catalogName, description, productStatusDisplay = null;
        float price;
        LocalDate createdDate;
        int productStatus;
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        // Validate Product ID
        while (true) {
            System.out.println("Nhập ID sản phẩm (dạng: C001, S123, A999):");
            productId = scanner.nextLine().trim();
            if (Pattern.matches("^[CSA][0-9]{3}$", productId)) break;
            else System.err.println("ID sản phẩm không hợp lệ. Vui lòng nhập lại.");
        }

        // Validate Product Name
        while (true) {
            System.out.println("Nhập tên sản phẩm (từ 10 đến 50 ký tự):");
            productName = scanner.nextLine().trim();
            if (Pattern.matches("^[\\p{L}\\d\\s'&-]{10,50}$", productName)) break;
            else System.err.println("Tên sản phẩm không hợp lệ. Vui lòng nhập lại.");
        }

        // Validate Product Price
        while (true) {
            System.out.println("Nhập giá sản phẩm:");
            price = Float.parseFloat(scanner.nextLine().trim());
            if (price > 0) break;
            else System.err.println("Giá sản phẩm có giá trị lớn hơn 0.");
        }

        System.out.println("Nhập mô tả của sản phẩm:");
        description = scanner.nextLine().trim();

        //  Validate created date:
        while (true) {
            System.out.println("Nhập ngày nhập sản phẩm:");
            String createdDateInput = scanner.nextLine().trim();
            try {
                createdDate = LocalDate.parse(createdDateInput, formatter);
                break;
            } catch (DateTimeParseException e) {
                System.err.println("Ngày nhập sản phẩm có định dạng không hợp lệ. Vui lòng nhập lại.");
            }
        }

        System.out.println("Nhập tên catalog của sản phẩm:");
        catalogName = scanner.nextLine().trim();

        // Validate productStatus:
        while (true) {
            System.out.println("Nhập trạng thái sản phẩm  (0: Đang bán – 1: Hết hàng – 2: Không bán):");
            String productStatusInput = scanner.nextLine();
            if (Pattern.matches("[012]", productStatusInput)) {
                productStatus = Integer.parseInt(productStatusInput);
                break;
            } else
                System.err.println("trạng thái sản phẩm, chỉ nhận 1 trong các trạng thái sau (0: Đang bán – 1: Hết hàng – 2: Không bán)");
        }

        // Trạng thái sản phẩm chỉ nhận 1 trong 3 giá trị Đang bán, hết hàng, không bán
        switch (productStatus) {
            case 0 -> productStatusDisplay = "Đang bán";
            case 1 -> productStatusDisplay = "Hết hàng";
            case 2 -> productStatusDisplay = "Không bán";
            default -> System.err.println("Invalid choice");
        }
        System.out.println(createdDate);
        System.out.printf("%s %s %s %.2f %s %d %s%n",
                productId, productName, description, price, catalogName, productStatus, productStatusDisplay);
    }
}
