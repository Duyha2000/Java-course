package session15.business;


import session15.entity.Category;

public interface ICategoryDesign extends IGenericDesign<Category, Integer> {
    //    Cập nhật trạng thái danh mục:
    boolean updateStatus(Category category, boolean status);
}
