package session15.entity;

import session14.Exercise.BT3.util.InputMethods;
import session15.run.CategoryManagement;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

import static session15.business.CategoryBusiness.categories;
import static session15.business.ProductBusiness.products;

public class Product implements IManagement {
    // Attribute:
    private String productId;
    private String productName;
    private float price;
    private String description;
    private LocalDate created;
    private int catalogId;
    private static int nextCafeId = 1;
    private static int nextSmoothieId = 1;
    private static int nextFastFoodId = 1;
    private static Set<String> usedIds = new HashSet<>();

    private int productStatus;
//    Constructor:

    public Product(char type) {
        String newId;
        do {
            newId = switch (type) {
                case 'C' -> String.format("C%03d", nextCafeId++);
                case 'S' -> String.format("S%03d", nextSmoothieId++);
                case 'A' -> String.format("A%03d", nextFastFoodId++);
                default -> throw new IllegalArgumentException("Invalid product type. Must be 'C', 'S', or 'A'.");
            };
        } while (usedIds.contains(newId));
        usedIds.add(newId);
        this.productId = newId;
    }

    public Product(String productId, String productName, float price, String description, LocalDate created, int catalogId, int productStatus) {
        this.productId = productId;
        this.productName = productName;
        this.price = price;
        this.description = description;
        this.created = created;
        this.catalogId = catalogId;
        this.productStatus = productStatus;
    }

//    getter and setter:


    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LocalDate getCreated() {
        return created;
    }

    public void setCreated(LocalDate created) {
        this.created = created;
    }

    public int getCatalogId() {
        return catalogId;
    }

    public void setCatalogId(int catalogId) {
        this.catalogId = catalogId;
    }

    public int getProductStatus() {
        return productStatus;
    }

    public void setProductStatus(int productStatus) {
        this.productStatus = productStatus;
    }

    @Override
    public void inputData() {
        System.out.println("Nhập tên sản phẩm đồ uống, có từ 10-50 ký tự, không được trùng lặp: ");
        this.productName = InputMethods.getString();
        while (this.productName.length() < 10 || this.productName.length() > 50) {
            System.err.println("Tên sản phẩm không hợp lệ, vui lòng nhập lại: ");
            this.productName = InputMethods.getString();
        }

        while (products.stream().anyMatch(product -> product.getProductName().equals(this.productName))) {
            System.err.println("Tên sản phẩm đã tồn tại, vui lòng nhập lại: ");
            this.productName = InputMethods.getString();
        }

        System.out.println("Nhập giá sản phẩm - giá sản phẩm có giá trị lớn hơn 0: ");
        this.price = InputMethods.getFloat();
        while (this.price <= 0) {
            System.err.println("Giá sản phẩm không hợp lệ, vui lòng nhập lại: ");
            this.price = InputMethods.getFloat();
        }

        System.out.println("Nhập mô tả sản phẩm: ");
        this.description = InputMethods.getString();

        System.out.println("Nhập ngày tạo sản phẩm - ngày nhập sản phẩm có định dạng dd/mm/yyyy: ");
        this.created = InputMethods.getDate();

        if (categories.isEmpty()) {
            System.err.println("Danh sách danh mục sản phẩm trống, vui lòng thêm danh mục sản phẩm trước khi thêm sản phẩm mới!");
            CategoryManagement.showMenuCategory();
        }
        System.out.println("Danh sách danh mục sản phẩm: ");
        categories.forEach(category -> System.out.println("ID: " + category.getCatalogId() + " - Name:" + category.getCatalogName()));


        System.out.println("Nhập mã danh mục sản phẩm: ");
        this.catalogId = InputMethods.getInteger();

        while (categories.stream().noneMatch(category -> category.getCatalogId() == this.catalogId)) {
            System.err.println("Mã danh mục sản phẩm không hợp lệ, vui lòng nhập lại: ");
            this.catalogId = InputMethods.getInteger();
        }

        System.out.println("Nhập trạng thái sản phẩm (0: Đang bán – 1: Hết hàng – 2: Không bán )");
        this.productStatus = InputMethods.getInteger();
        while (this.productStatus < 0 || this.productStatus > 2) {
            System.err.println("Trạng thái sản phẩm không hợp lệ, vui lòng nhập lại: ");
            this.productStatus = InputMethods.getInteger();
        }
    }

    @Override
    public void displayData() {
        System.out.printf("|ID : %-4s | Name: %-6s | Price: %-6.2f | Description: %-6s | Created: %-6s | Catalog ID: %-6d | Status: %-6s |\n",
                this.productId, this.productName, this.price, this.description, this.created, this.catalogId, this.productStatus == 0 ? "Đang bán" : this.productStatus == 1 ? "Hết hàng" : "Không bán")
        ;
    }

    @Override
    public String toString() {
        return "Product{" +
                "productId='" + productId + '\'' +
                ", productName='" + productName + '\'' +
                ", price=" + price +
                '}';
    }
}
