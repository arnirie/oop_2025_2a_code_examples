package library_activity;

public class LibraryDemo {
    public static void main(String[] args) {
        LibraryBook libraryBook1 = new LibraryBook("A journey to the Moon", "JK Rowling", "123");
        LibraryBook libraryBook2 = new LibraryBook("OOP for beginners", "Carl Enrique", "123");
        libraryBook1.checkOut();
        libraryBook2.checkOut();
        libraryBook1.returnBook();
        libraryBook1.displayInfo();
        libraryBook2.displayInfo();
    }
}
