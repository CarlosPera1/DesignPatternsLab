import javax.lang.model.element.Element;

public class Main {
    public static void main(String[] args) {
        An info3 = new An("Da");
        info3.add(new Grupa("Grupa 1"));

        info3.grupe.get(0).semigrupe.add(new Semigrupa("Semigrupa 1"));
        info3.grupe.get(0).semigrupe.get(0).studenti.add(new Student("Popescu I","popescu@acme.edu.ro"));
        info3.grupe.get(0).semigrupe.get(0).studenti.add(new Student("Ionescu I","popescu@acme.edu.ro"));

        info3.grupe.get(0).semigrupe.add(new Semigrupa("Semigrupa 1.2"));
        info3.grupe.get(0).semigrupe.get(1).studenti.add(new Student("Vasilescu I","vasilescu@acme.edu.ro"));
        info3.grupe.get(0).semigrupe.get(1).studenti.add(new Student("Georgescu I","georgescu@acme.edu.ro"));

        info3.print();
    }
}