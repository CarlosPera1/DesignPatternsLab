import javax.lang.model.element.Element;
import java.util.ArrayList;
import java.util.List;

public class An implements Sistem{
    public String numeAn;
    public List<Grupa> grupe;

    public An(String numeAn) {
        this.numeAn = numeAn;
        this.grupe = new ArrayList<Grupa>();
    }

    @Override
    public void add(Semigrupa semigrupa) {

    }

    @Override
    public void add(Grupa grupa) {
        grupe.add(grupa);
    }

    @Override
    public void add(Student student) {

    }

    @Override
    public void print() {
        System.out.println("Nume an: " + numeAn);
        for(Grupa e : grupe) {
            e.print();
        }
    }
}
