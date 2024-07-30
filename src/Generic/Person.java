package Generic;

public class Person<T, E> {
    private T id;
    private E autoId;
    private int age;

    public Person(T id, int age) {
        this.id = id;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", age=" + age +
                '}';
    }
}
