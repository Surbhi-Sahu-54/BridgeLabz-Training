package universitycourseenrollmentsystem;

class Postgraduate extends Student implements Graded {

    Postgraduate(int id, String name) {
        super(id, name);
    }

    @Override
    public void assignGrade(double marks) {
        if (marks >= 50)
            updateGPA(4.0);   // Pass
        else
            updateGPA(0.0);   // Fail
    }
}
