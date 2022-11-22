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
}
