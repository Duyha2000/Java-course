package Generic;

public class Person1 {
    //    int id, int age:
    private int id;
    private int age;

    public Person1(int id, int age) {
        this.id = id;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person1{" +
                "id=" + id +
                ", age=" + age +
                '}';
    }
}
