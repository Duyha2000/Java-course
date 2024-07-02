package session15.run;

import session14.Exercise.BT3.util.InputMethods;
import session15.business.IProductDesign;
import session15.business.ProductBusiness;
import session15.entity.Product;

import java.util.List;

public class ProductManagement {
    public static final IProductDesign productBusiness = new ProductBusiness();


    public static void showMenuProduct() {
        while (true) {
            System.out.println("""
                    ************************PRODUCT MENU*************************
                    1. Nhập thông tin các sản phẩm
                    2. Hiển thị thông tin các sản phẩm
                    3. Sắp xếp các sản phẩm theo giá
                    4. Cập nhật thông tin sản phẩm theo mã sản phẩm
                    5. Xóa sản phẩm theo mã sản phẩm
                    6. Tìm kiếm các sản phẩm theo tên sản phẩm
                    7. Tìm kiếm sản phẩm trong khoảng giá a – b (a,b nhập từ bàn phím)
                    8. Thoát""");
            System.out.println("Nhập lựa chọn của bạn");
            byte choice = InputMethods.getByte();
            switch (choice) {
                case 1:
                    // 1. Nhập thông tin các sản phẩm
                    addNewProduct();
                    break;
                case 2:
                    // 2. Hiển thị thông tin các sản phẩm
                    showProduct();
                    break;
                case 3:
                    // 3. Sắp xếp các sản phẩm theo giá
                    sortProductByPrice();
                    break;
                case 4:
                    // 4. Cập nhật thông tin sản phẩm theo mã sản phẩm
                    updateProduct();
                    break;
                case 5:
                    // 5. Xóa sản phẩm theo mã sản phẩm
                    deleteProduct();
                    break;
                case 6:
                    // 6. Tìm kiếm các sản phẩm theo tên sản phẩm
                    searchProductByName();
                    break;
                case 7:
                    // 7. Tìm kiếm sản phẩm trong khoảng giá a – b (a,b nhập từ bàn phím)
                    searchProductByPrice();
                    break;
                case 8:
                    // Exit
                    break;
                default:
                    System.err.println("Lựa chọn ko chính xác , vui lòng nhập lại");
                    break;
            }
            if (choice == 8) break;
        }
    }

    public static void addNewProduct() {
        System.out.println("Nhập số lượng cần thêm mới:");
        byte n = session15.util.InputMethods.getByte();
        for (int i = 0; i < n; i++) {
            System.out.println("Nhập thông tin cho danh mục thứ: " + (i + 1));
            System.out.println("Nhập ký tự (C: các đồ uống là café, S: các đồ uống là sinh tố, A: các đồ ăn nhanh)");
            Product product = new Product(InputMethods.getChar());
            product.inputData();
            productBusiness.create(product);
        }
        System.out.println("Đã thêm mới thành công!");
    }

    public static void showProduct() {
        System.out.println("Danh sách các sản phẩm:");

        List<Product> products = productBusiness.findAll();
        if (products.isEmpty()) System.err.println("Danh sách trống !");
        else {
            for (Product pro : products) pro.displayData();
        }
    }

    public static void sortProductByPrice() {
        System.out.println("Danh sách các sản phẩm sau khi sắp xếp theo giá:");
        productBusiness.sortByPrice();
        showProduct();
    }

    public static void updateProduct() {
        System.out.println("Nhập mã sản phẩm cần cập nhật thông tin:");
        String id = InputMethods.getString();
        Product product = productBusiness.findById(id);
        if (product == null) {
            System.err.println("Không tìm thấy sản phẩm có mã: " + id);
            return;
        }

        System.out.println("Nhập thông tin cho sản phẩm:");
        Product newProduct = new Product(id, product.getProductName(), product.getPrice(), product.getDescription(), product.getCreated(), product.getCatalogId(), product.getProductStatus());
        productBusiness.update(newProduct);
        System.out.println("Đã cập nhật thành công!");
    }

    public static void deleteProduct() {
        System.out.println("Nhập mã sản phẩm cần xóa:");
        String id = InputMethods.getString();
        Product product = productBusiness.findById(id);
        if (product == null) {
            System.err.println("Không tìm thấy sản phẩm có mã: " + id);
            return;
        }
        productBusiness.deleteById(id);
        System.out.println("Đã xóa thành công!");
    }

    public static void searchProductByName() {
        System.out.println("Nhập tên sản phẩm cần tìm kiếm:");
        String name = InputMethods.getString();
        productBusiness.searchByName(name);
    }

    public static void searchProductByPrice() {
        System.out.println("Nhập giá a:");
        double a = InputMethods.getDouble();
        System.out.println("Nhập giá b:");
        double b = InputMethods.getDouble();
        productBusiness.searchByPrice(a, b);
    }
}
