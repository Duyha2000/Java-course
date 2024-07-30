package hackathonMd6.ra.entity;

import session15.util.InputMethods;

public class LaptopType {
    //    Attribute:
    private int typeId;
    private static int autoId = 0;
    private String typeName, description;
    private boolean isDeleted;
//

    public LaptopType() {
        this.typeId = ++autoId;
    }

    public LaptopType(int typeId, String typeName, String description, boolean isDeleted) {
        this.typeId = typeId;
        this.typeName = typeName;
        this.description = description;
        this.isDeleted = isDeleted;
    }

    public int getTypeId() {
        return typeId;
    }

    public void setTypeId(int typeId) {
        this.typeId = typeId;
    }

    public static int getAutoId() {
        return autoId;
    }

    public static void setAutoId(int autoId) {
        LaptopType.autoId = autoId;
    }

    public String getTypeName() {
        return typeName;
    }

    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean isDeleted() {
        return isDeleted;
    }

    public void setDeleted(boolean deleted) {
        isDeleted = deleted;
    }

    public void inputData() {
        System.out.println("Nhâp tên loại laptop - không để trống, không trùng lặp: ");
        this.typeName = InputMethods.getString();
        while (this.typeName.isEmpty()) {
            System.err.println("tên loại laptop - không để trống, không trùng lặp");
            this.typeName = InputMethods.getString();
        }

        System.out.println("Nhâp mô tả - không để trống: ");
        this.description = InputMethods.getString();
        while (this.description.isEmpty()) {
            System.err.println("Mô tả - không để trống");
            this.description = InputMethods.getString();
        }
    }

    //    Display:
    public void displayData() {
        System.out.printf("|ID : %-4d | Name: %-6s | Deleted: %-6b | Description: %-6s |\n",
                this.typeId, this.typeName, this.isDeleted, this.description);
    }
}
