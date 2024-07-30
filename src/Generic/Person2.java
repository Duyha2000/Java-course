package Generic;

public class Person2 {
    private String id;
    private int age;

    public Person2(String id, int age) {
        this.id = id;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person2{" +
                "id='" + id + '\'' +
                ", age=" + age +
                '}';
    }
}
