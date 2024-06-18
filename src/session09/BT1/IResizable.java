package session09.BT1;

@FunctionalInterface
//Functional interface là interface có duy nhất 1 abstract method,
// có thể không có hoặc có nhiều default/static method.

//Annotation không bắt buộc, tuy nhiên nên có để tránh sai sót
// (ví dụ có nhiều hơn 1 abstract method chẳng hạn).

// Khái niệm: Annotation được hiểu là một dạng chú thích
// Các chú thích không có ảnh hưởng trực tiếp đến hoạt động của mã mà chúng chú thích
public interface IResizable {
    void resize(double percent);
//    default boolean alive() {
//        return true;
//    }
}
