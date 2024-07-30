package Generic;

public class Person3 {
    private double id;
    private int age;

    public Person3(double id, int age) {
        this.id = id;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person3{" +
                "id=" + id +
                ", age=" + age +
                '}';
    }
}
