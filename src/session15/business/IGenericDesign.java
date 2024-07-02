package session15.business;

import java.util.List;

public interface IGenericDesign<T, E> {
    //    Thêm mới:
    boolean create(T t); // Tự do truyền kiêu dữ liệu

    //    Chỉnh sửa:
    boolean update(T t);

    //    Xóa:
    boolean deleteById(E id); // String - interger

    //    Tìm theo id:
    T findById(E id);

    //    Tìm tất cả:
    List<T> findAll();

}
