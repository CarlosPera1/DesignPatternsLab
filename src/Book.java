import java.util.ArrayList;
import java.util.List;

public class Book {
    public String title;
    public List<Author> authors = new ArrayList<Author>();
    public List<Chapter> chapters = new ArrayList<Chapter>();

    public Book(String title) {
        super();
        this.title = title;
    }

    public void print() {
        System.out.println("Carte: " + this.title);
    }

    public void addAuthor(Author rpGheo) {
        authors.add(rpGheo);
    }

    public int createChapter(String string) {
        chapters.add(new Chapter(string));
        return chapters.size() - 1;
    }

    public Chapter getChapter(int indexChapterOne) {
        int counter = 0;
        for(Chapter e : chapters) {
            if(counter == indexChapterOne) {
                return e;
            }
            counter++;
        }
        return null;
    }
}