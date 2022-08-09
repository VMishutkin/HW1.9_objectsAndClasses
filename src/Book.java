public class Book {
    Author author;
    String name;
    int yearOfPublishing;

    public Book(Author author, String name, int yearOfPublishing) {
        this.author = author;
        this.name = name;
        this.yearOfPublishing = yearOfPublishing;
    }

    public void setYearOfPublishing(int yearOfPublishing) {
        this.yearOfPublishing = yearOfPublishing;
    }

    public Author getAuthor() {
        return author;
    }

    public String getName() {
        return name;
    }

    public int getYearOfPublishing() {
        return yearOfPublishing;
    }
}
