package Generic;

public interface IGenericDeisn<T, E> {
    void add(T t);

    void save(E id);

    void delete(E id);
}
