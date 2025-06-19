import java.util.Objects;

public class Author {
    private String name;
    private String familyName;

    public Author(String name, String familyName){
        this.name = name;
        this.familyName = familyName;
    }

    public String getName() {
        return this.name;
    }

    public String getFamilyName() {
        return this.familyName;
    }
    public String toString() {
        return name + " " + familyName;
    }

    @Override
    public boolean equals(Object authors) {
        if (authors == null || getClass() != authors.getClass()) return false;
        Author author = (Author) authors;
        return Objects.equals(name, author.name) && Objects.equals(familyName, author.familyName);
    }

    public int hashCode() {
        return Objects.hash(name, familyName);
    }
}
