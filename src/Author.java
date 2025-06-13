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
}
