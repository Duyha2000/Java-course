package session10.model;


public class Book {
    // Attribute
    private String id, title, author, description;
    private static int nextID = 1;
    private int year;
    public Category category;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public Book() {
        int a = nextID++;
        this.id = String.format("B%03d", a);
    }


    public Book(String title, String author, String description, int year, Category category) {
        // (bắt đầu bằng “B”, độ dài 4 kí tự, duy nhất)
        int a = nextID++;
// Cách 1:
//        String idValidate;
//        if (a < 10) idValidate = "B00" + a;
//        else if (a < 100) {
//            idValidate = "B0" + a;
//        } else idValidate = "B" + a;
//        this.id = idValidate;

//        Cách 2: Dùng String.format
        this.id = String.format("B%03d", a);
        this.title = title;
        this.author = author;
        this.description = description;
        this.year = year;
        this.category = category;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id='" + id + '\'' +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", description='" + description + '\'' +
                ", year=" + year +
                ", category=" + category +
                '}';
    }
}
