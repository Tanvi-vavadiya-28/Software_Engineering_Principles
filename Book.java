public class Book {
    private String title;
    private String author;
    private String ISBN;
    private boolean isCheckedOut;

    public Book(String title, String author, String ISBN) {
        this.title = title;
        this.author = author;
        this.ISBN = ISBN;
        this.isCheckedOut = false;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getISBN() {
        return ISBN;
    }

    public boolean isCheckedOut() {
        return isCheckedOut;
    }

    public void checkOut() {
        isCheckedOut = true;
    }

    public void returnBook() {
        isCheckedOut = false;
    }

    @Override
    public String toString() {
        return "Title: " + title + ", Author: " + author + ", ISBN: " + ISBN + ", Checked Out: " + isCheckedOut;
    }
}
