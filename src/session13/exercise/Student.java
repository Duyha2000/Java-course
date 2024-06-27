package session13.exercise;

public class Student {
    private String id;
    private String name;
    private int age;
    private double weight;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public Student(String id, String name, int age, double weight) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.weight = weight;
    }

    public Student() {
    }

    @Override
    public String toString() {
        return "Student{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", weight=" + weight +
                '}';
    }

}
