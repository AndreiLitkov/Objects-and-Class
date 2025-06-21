import java.util.Objects;

public class Book {
    private String name;
    private Author author;
    private int year;

    public Book (String name, Author author, int year){
        this.name = name;
        this.author = author;
        this.year = year;
    }

    public String getName() {
        return this.name;
    }

    public Author getAuthor() {
        return  this.author;
    }

    public int getYear() {
        return this.year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String toString() {
        return "Название книги - " + name +". Автор - " + author + " Год издания - " + year ;
    }

    @Override
    public boolean equals(Object books) {
        if (books == null || getClass() != books.getClass()) return false;
        Book book = (Book) books;
        return Objects.equals(name, book.name) && Objects.equals(author, book.author);
    }

    public int hashCode() {
        return Objects.hash(name , author , year);
    }
}
