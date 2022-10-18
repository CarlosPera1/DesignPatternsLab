import java.util.ArrayList;
import java.util.List;

public class SubChapter {
    public String name;

    public List<Paragraph> paragraphs = new ArrayList<Paragraph>();
    public List<Image> images = new ArrayList<Image>();
    public List<Table> tables = new ArrayList<Table>();


    public SubChapter(String name) {
        super();
        this.name = name;
    }

    public void createNewParagraph(String string) {
        paragraphs.add(new Paragraph(string));
    }

    public void createNewImage(String string) {
        images.add(new Image(string));
    }

    public void createNewTable(String string) {
        tables.add(new Table(string));
    }

    public void print() {
        System.out.println("Sub capitol: " + this.name);
        for(Paragraph e : paragraphs) {
            e.print();
        }
        for(Image e : images) {
            e.print();
        }
        for(Table e : tables) {
            e.print();
        }
    }
}