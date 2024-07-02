package session15.entity;

import session14.Exercise.BT3.util.InputMethods;

import static session15.business.CategoryBusiness.categories;

public class Category implements IManagement {
    //    Attribute:
    private int catalogId;
    private static int nextId = 1;
    private String catalogName;
    private String descriptions;
    private boolean catalogStatus;

    //    Constructor:
    public Category() {
        this.catalogId = nextId++;
    }

    public Category(int catalogId, String catalogName, String descriptions, boolean catalogStatus) {
        this.catalogId = catalogId;
        this.catalogName = catalogName;
        this.descriptions = descriptions;
        this.catalogStatus = catalogStatus;
    }
    // getter and setter:

    public int getCatalogId() {
        return catalogId;
    }

    public void setCatalogId(int catalogId) {
        this.catalogId = catalogId;
    }


    public String getCatalogName() {
        return catalogName;
    }

    public void setCatalogName(String catalogName) {
        this.catalogName = catalogName;
    }

    public String getDescriptions() {
        return descriptions;
    }

    public void setDescriptions(String descriptions) {
        this.descriptions = descriptions;
    }

    public boolean isCatalogStatus() {
        return catalogStatus;
    }

    public void setCatalogStatus(boolean catalogStatus) {
        this.catalogStatus = catalogStatus;
    }

    @Override
    public void inputData() {
        if (!categories.isEmpty()) {
            System.out.println("Danh sách các danh mục đã có: ");
            categories.forEach(category -> System.out.println(category.getCatalogName()));
        }

        System.out.println("Nhập tên danh mục (có độ dài tối đa 50 ký tự, không trùng lặp): ");
        this.catalogName = InputMethods.getString();
        //  không trùng lặp (duyet qua danh sách các danh mục đã có)

        while (categories.stream().anyMatch(category -> category.getCatalogName().equals(this.catalogName))) {
            System.err.println("Tên danh mục đã tồn tại, vui lòng nhập lại: ");
            this.catalogName = InputMethods.getString();
        }

        while (this.catalogName.length() > 50) {
            System.err.println("Tên danh mục không được vượt quá 50 ký tự, vui lòng nhập lại: ");
            this.catalogName = InputMethods.getString();
        }

        System.out.println("Nhập mô tả: ");
        this.descriptions = InputMethods.getString();

        System.out.println("Nhập trạng thái (chỉ nhận giá trị true/false): ");

        while (true) {
            String input = InputMethods.getString();
            if (input.equalsIgnoreCase("true") || input.equalsIgnoreCase("false")) {
                this.catalogStatus = Boolean.parseBoolean(input);
                break;
            } else System.err.println("Giá trị không hợp lệ. Vui lòng nhập true hoặc false: ");
        }
    }

    @Override
    public void displayData() {
        System.out.printf("|ID : %-4s | Name: %-6s | Description: %-6s | Status: %-6s |\n",
                this.catalogId, this.catalogName, this.descriptions, this.catalogStatus ? "Hoạt động" : "Không hoạt động");
    }
}
