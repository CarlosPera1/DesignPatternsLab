import javax.naming.Context;

public class Paragraph implements Element
{
    private String text;
    public AlignStrategy alignStrategy = null;
    public Paragraph(String text) {
        this.text = text;
    }

    public void print() {
        if(alignStrategy == null) {
            System.out.println("Paragraph: " + this.text);
        }
        else {
            this.alignStrategy.render(this);
        }
    }

    @Override
    public void add(Element addElement) {

    }

    @Override
    public void remove(Element removeElement) {

    }

    @Override
    public int get(Element getElement) {
        return 0;
    }

    public String getText() {
        return text;
    }

    public void setAlignStrategy(AlignStrategy align) {
        this.alignStrategy = align;
    }
}