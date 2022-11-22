public class Book {
    private String bookTitle;
    private Author authorName;
    private int release;
    private Book Book;

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

    public void dataBook(Book book) {

        Author author = this.authorName;
        System.out.println("book title: " + book.bookTitle + "; author: " + author.dataAuthor(author) +  "; release: " + book.release + ";" );

    }

}
