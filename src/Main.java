public class Main {
    public static void main(String[] args) {

        // в наименовании переменных:
        // первый символ - принадлежность к объекту
        // пятизначный числовой код - инвентарный номер

        Author a00001 = new Author("George", "Martin");
        Author a00002 = new Author("Joanne", "Rowling");

        Book b00001 = new Book("Fire and blood", a00001, 2017);
        Book b00002 = new Book("Harry Potter and Half-Blood Prince", a00002, 2005 );
        Book b00003 = new Book("Harry Potter and the Goblet of Fire", a00002, 2000);
        Book b00004 = new Book("Harry Potter and the Deathly Hallows", a00002, 2000);

        System.out.println("b00001 = " + b00001);
        System.out.println("b00002 = " + b00002);
        System.out.println(b00002.equals(b00003));
        System.out.println(b00004.equals(b00001));
        System.out.println("b00002.hashCode() = " + b00002.hashCode());
        System.out.println("b00003.hashCode() = " + b00003.hashCode());

        System.out.println(b00002.hashCode() == b00003.hashCode());
        System.out.println();
        System.out.println("a00001.hashCode() = " + a00001.hashCode());
        System.out.println("a00002.hashCode() = " + a00002.hashCode());
        System.out.println(a00001.equals(a00002));
        System.out.println(a00001.hashCode() == a00002.hashCode());




    }


}