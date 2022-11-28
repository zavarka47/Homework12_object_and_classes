public class Book {
    private String bookTitle;
    private Author authorName;
    private int release;


    public Book (String bookTitle, Author authorName, int release) {
        this.bookTitle = bookTitle;
        this.authorName = authorName;
        this.release = release;
    }

    public String getBookTitle() {
        return this.bookTitle;
    }

    public Author getAuthorName () {

        return this.authorName;
    }

    public int getRelease() {

        return this.release;
    }

    public void setRelease (int release) {
        this.release = release;
    }

    public String toString () {
        return "book title: " + bookTitle + "; author: " + authorName + "; release: " + release + ";";
    }

    public boolean equals (Object other) {
        Book book = (Book) other;
        return this.authorName.equals(((Book) other).authorName);

    }

    public int hashCode () {
        return authorName.hashCode();
    }


}
