public class PrintVisitor implements Visitor {

    @Override
    public void visitAn(An an) {
        an.print();


    }

    @Override
    public void visitGrupa(Grupa grupa) {
        grupa.print();

    }

    @Override
    public void visitSemigrupa(Semigrupa semigrupa) {
        semigrupa.print();
    }

    @Override
    public void visitStudent(Student student) {
        student.print();

    }
}
