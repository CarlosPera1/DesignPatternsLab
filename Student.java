public class Student implements Sistem{
    public String numeStudent;
    public String emailStudent;

    public Student(String numeStudent, String emailStudent) {
        this.numeStudent = numeStudent;
        this.emailStudent = emailStudent;
    }

    @Override
    public void add(Semigrupa semigrupa) {

    }

    @Override
    public void add(Grupa grupa) {

    }

    @Override
    public void add(Student student) {

    }

    @Override
    public void print() {
        System.out.println("            " + numeStudent + ", " + emailStudent);
    }
}
