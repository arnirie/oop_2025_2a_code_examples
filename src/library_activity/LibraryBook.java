package library_activity;

public class LibraryBook {
    private String title;
    private String author;
    private String isbn;
    private boolean isAvailable;
    private static int totalBooksCreated;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    LibraryBook(String title, String author, String isbn){
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        this.isAvailable = true;
        totalBooksCreated++;
    }

    public static int getTotalBooks(){
        return totalBooksCreated;
    }

    public void checkOut(){
        this.isAvailable = false;
    }

    public void returnBook(){
        this.isAvailable = true;
    }

    public void displayInfo(){
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("ISBN: " + isbn);
        System.out.println("Available Books: " + isAvailable);
    }

    public boolean getIsAvailable(){
        return this.isAvailable;
    }
}
