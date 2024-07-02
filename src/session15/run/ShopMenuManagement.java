package session15.run;

import session14.Exercise.BT3.util.InputMethods;

public class ShopMenuManagement {
    public static void main(String[] args) {
        while (true) {
            System.out.println("************************SHOP MENU*************************\n" +
                    "1. Quản lý danh mục sản phẩm\n" +
                    "2. Quản lý sản phẩm\n" +
                    "3. Thoát");
            System.out.println("Nhập lựa chọn của bạn:");
            byte choice = InputMethods.getByte();
            switch (choice) {
                case 1:
                    // Quản lý danh mục sản phẩm
                    CategoryManagement.showMenuCategory();
                    break;
                case 2:
                    // Quản lý sản phẩm
                    ProductManagement.showMenuProduct();
                    break;
                case 3:
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ");
            }
            if (choice == 3) break;
        }
    }
}
