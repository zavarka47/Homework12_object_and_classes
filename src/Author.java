public class Author {
    private String name;
     private String surname;

    public Author(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public String getAuthor () {
        return this.name;
    }

    public String getSurname() {
        return this.surname;
    }

    public String dataAuthor (Author author) {
        String a = " ";
        String b = author.name + a + author.surname;
        return b;
    }

    public String toString () {
        return name + " " + surname;
    }

    public boolean equals (Object other) {
        Author author = (Author) other;
        return this.name.equals(((Author) other).name) && this.surname.equals(((Author) other).surname);
    }

    public int hashCode() {
        return name.hashCode();
    }

}
