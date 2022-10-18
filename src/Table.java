public class Table {
    public String title;

    public Table(String title) {
        super();
        this.title = title;
    }

    public void print() {
        System.out.println("Title: " + this.title);
    }
}