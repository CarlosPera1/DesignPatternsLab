import java.util.ArrayList;
import java.util.List;

public class Semigrupa implements Sistem {
    public String numeSemigrupa;
    public List<Student> studenti;

    public Semigrupa(String numeSemigrupa) {
        this.numeSemigrupa = numeSemigrupa;
        this.studenti = new ArrayList<Student>();
    }

    @Override
    public void add(Semigrupa semigrupa) {

    }

    @Override
    public void add(Grupa grupa) {

    }

    @Override
    public void add(Student student) {
        studenti.add(student);
    }

    @Override
    public void print() {
        System.out.println("      Nume semigrupa: " + numeSemigrupa);
        for(Student e : studenti) {
            //System.out.println("            " + e.numeStudent + ", " + e.emailStudent);
            e.print();
        }
    }
}
