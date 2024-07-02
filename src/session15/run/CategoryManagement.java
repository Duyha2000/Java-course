package session15.run;

import session15.business.CategoryBusiness;
import session15.business.ICategoryDesign;
import session15.business.IProductDesign;
import session15.business.ProductBusiness;
import session15.entity.Category;
import session15.util.InputMethods;

import java.util.List;

public class CategoryManagement {
    public static final ICategoryDesign categoryBusiness = new CategoryBusiness();
    public static final IProductDesign productBusiness = new ProductBusiness();

    public static void showMenuCategory() {
        while (true) {
            System.out.println("""
                    ************************CATEGORY MENU*************************
                    1. Nhập thông tin các danh mục
                    2. Hiển thị thông tin các danh mục
                    3. Cập nhật thông tin danh mục
                    4. Xóa danh mục
                    5. Cập nhật trạng thái danh mục
                    6. Thoát""");
            System.out.println("Nhập lựa chọn của bạn");
            byte choice = InputMethods.getByte();
            switch (choice) {
                case 1:
                    // 1. Nhập thông tin các danh mục
                    addNewCategory();
                    break;
                case 2:
                    // 2. Hiển thị thông tin các danh mục
                    showCategory();
                    break;
                case 3:
                    // 3. Cập nhật thông tin danh mục
                    updateCategory();
                    break;
                case 4:
                    // 4. Xóa danh mục
                    deleteCategory();
                    break;
                case 5:
                    // 5. Cập nhật trạng thái danh mục
                    updateStatusCategory();
                    break;
                case 6:
                    // Exit
                    break;
                default:
                    System.err.println("Lựa chọn ko chính xác , vui lòng nhập lại");
            }
            if (choice == 6) break;
        }

    }

    public static void addNewCategory() {
        System.out.println("Nhập số lượng cần thêm mới:");
        int n = InputMethods.getInteger();
        for (int i = 0; i < n; i++) {
            System.out.println("Nhập thông tin cho danh mục thứ: " + (i + 1));
            Category category = new Category();
            category.inputData();
            categoryBusiness.create(category);
        }
        System.out.println("Đã thêm mới thành công!");
    }

    public static void showCategory() {
        System.out.println("Danh sách các danh mục:");

        List<Category> categories = categoryBusiness.findAll();
        if (categories.isEmpty()) System.err.println("Danh sách trống !");
        else {
            System.out.println("-------- Danh sách danh mục --------");
            for (Category cat : categories) cat.displayData();
        }
    }

    public static void updateCategory() {
        System.out.println("Nhập mã danh mục cần cập nhật:");
        int id = InputMethods.getInteger();
        Category category = categoryBusiness.findById(id);
        if (category == null) {
            System.err.println("Không tìm thấy danh mục có mã " + id);
            return;
        }

        System.out.println("Nhập thông tin mới cho danh mục:");
        Category newCategory = new Category(id, category.getCatalogName(), category.getDescriptions(), category.isCatalogStatus());
        newCategory.inputData();

        categoryBusiness.update(newCategory);
        System.out.println("Cập nhật thành công!");
    }

    public static void deleteCategory() {
        System.out.println("Nhập mã danh mục cần xóa:");
        int id = InputMethods.getInteger();
        Category category = categoryBusiness.findById(id);

        if (productBusiness.isExist(String.valueOf(id))) {
            System.err.println("Danh mục này đang chứa sản phẩm, không thể xóa!");
            return;
        }

        if (category == null) {
            System.err.println("Không tìm thấy danh mục có mã " + id);
            return;
        }
        categoryBusiness.deleteById(id);
        System.out.println("Xóa thành công!");
    }

    public static void updateStatusCategory() {
        System.out.println("Nhập mã danh mục cần cập nhật trạng thái:");
        int id = InputMethods.getInteger();

        Category category = categoryBusiness.findById(id);

        if (category == null) {
            System.err.println("Không tìm thấy danh mục có mã " + id);
            return;
        }
        System.out.println("Nhập trạng thái mới cho danh mục:");
        boolean newStatus = InputMethods.getBoolean();

        categoryBusiness.updateStatus(category, newStatus);
        System.out.println("Cập nhật trạng thái thành công!");
    }
}
