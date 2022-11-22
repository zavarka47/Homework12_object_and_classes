public class Main {
    public static void main(String[] args) {

        // в наименовании переменных:
        // первый символ - принадлежность к объекту
        // пятизначный числовой код - инвентарный номер

        Author a00001 = new Author("George", "Martin");
        Author a00002 = new Author("Joanne", "Rowling");

        Book b00001 = new Book("Fire and blood", a00001, 2017);
        Book b00002 = new Book("Harry Potter and Half-Blood Prince", a00002, 2005 );

        b00001.dataBook(b00001);
        b00002.dataBook(b00002);

        b00001.setRelease(2022);
        b00001.dataBook(b00001);

    }


}