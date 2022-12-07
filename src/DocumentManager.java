public class DocumentManager {
    private static DocumentManager instance = null;
    private Book book;

    public static DocumentManager getInstance()
    {
        // To ensure only one instance is created
        if (instance == null) {
            instance = new DocumentManager();
        }
        return instance;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }
}
