import javax.lang.model.element.Element;
import java.util.ArrayList;
import java.util.List;

public class Grupa implements Sistem {
    public String numeGrupa;
    public List<Semigrupa> semigrupe;

    public Grupa(String numeGrupa) {
        this.numeGrupa = numeGrupa;
        this.semigrupe = new ArrayList<Semigrupa>();
    }

    @Override
    public void add(Semigrupa semigrupa) {
        semigrupe.add(semigrupa);
    }

    @Override
    public void add(Grupa grupa) {

    }

    @Override
    public void add(Student student) {

    }

    @Override
    public void print() {
        System.out.println("    Nume grupe: " + numeGrupa);
        for(Semigrupa e : semigrupe) {
            e.print();
        }
    }
}
