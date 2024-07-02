package session15.business;

import session15.entity.Product;

public interface IProductDesign extends IGenericDesign<Product, String> {
    //    Sắp xếp các sản phẩm theo giá:
    void sortByPrice();

    //    Tìm kiếm các sản phẩm theo tên sản phẩm:
    void searchByName(String name);

    //   Tìm kiếm sản phẩm trong khoảng giá a – b (a,b nhập từ bàn phím):
    void searchByPrice(double a, double b);

    //    Kiểm tra sản phẩm có tồn tại trong danh sách hay không:
    boolean isExist(String id);
}
