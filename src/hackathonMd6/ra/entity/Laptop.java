package hackathonMd6.ra.entity;

import session15.util.InputMethods;

import java.time.LocalDate;

public class Laptop {
    private static int autoId = 0;
    //    Attribute:
    private String laptopId;
    private String laptopName;
    private String description;
    private int ram;
    private double weight;
    private double laptopPrice;
    private LocalDate createdAt;
    private int typeId;
    private boolean isDeleted;

    public Laptop() {
        this.laptopId = String.format("L%4d", ++autoId);
        this.createdAt = LocalDate.now();
    }

    public Laptop(String laptopId, String laptopName, String description, int ram, double weight, double laptopPrice, LocalDate createdAt, int typeId, boolean isDeleted) {
        this.laptopId = laptopId;
        this.laptopName = laptopName;
        this.description = description;
        this.ram = ram;
        this.weight = weight;
        this.laptopPrice = laptopPrice;
        this.createdAt = createdAt;
        this.typeId = typeId;
        this.isDeleted = isDeleted;
    }

    public void inputData() {
        System.out.println("Nhâp tên laptop - không để trống, không trùng lặp: ");
        this.laptopName = InputMethods.getString();
        while (this.laptopName.isEmpty()) {
            System.err.println("tên loại laptop - không để trống, không trùng lặp");
            this.laptopName = InputMethods.getString();
        }

        System.out.println("Nhâp mô tả - không để trống: ");
        this.description = InputMethods.getString();
        while (this.description.isEmpty()) {
            System.err.println("Mô tả - không để trống");
            this.description = InputMethods.getString();
        }

        System.out.println("Nhâp bộ nhớ - phải >0: ");
        this.ram = InputMethods.getInteger();
        while (this.ram <= 0) {
            System.out.println("bộ nhớ - phải >0: ");
            this.ram = InputMethods.getInteger();
        }

        System.out.println("Nhâp cân nặng - phải >0: ");
        this.weight = InputMethods.getDouble();
        while (this.weight <= 0) {
            System.out.println("cân nặng - phải >0: ");
            this.weight = InputMethods.getDouble();
        }

        System.out.println("Nhâp giá tiên - phải >0: ");
        this.laptopPrice = InputMethods.getDouble();
        while (this.laptopPrice <= 0) {
            System.out.println("giá tiên - phải >0: ");
            this.laptopPrice = InputMethods.getDouble();
        }

    }

    //    Display:
    public void displayData() {
        System.out.printf("|ID : %-4s | Name: %-6s | Description: %-6s | RAM: %-4d | Weight: %-4.2f | Price: %-4.2f | Created At: %-10s | Type ID: %-4d | Is Deleted: %-5b |\n",
                this.laptopId, this.laptopName, this.description, this.ram, this.weight, this.laptopPrice, this.createdAt, this.typeId, this.isDeleted);
    }
}
