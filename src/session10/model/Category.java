package session10.model;


// Implements inter face Comparable<Catogory> ể sort
public class Category {
    // Attribute:
    private static int nextID = 1;
    private int id;
    private String name;
    private boolean status; // true /false

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public Category() {
        this.id = nextID++;
    }

    public Category(String name, boolean status) {
        this.id = nextID++;
        this.name = name;
        this.status = status;
    }

    @Override
    public String toString() {
        return "Category{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", status=" + status +
                '}';
    }

}
