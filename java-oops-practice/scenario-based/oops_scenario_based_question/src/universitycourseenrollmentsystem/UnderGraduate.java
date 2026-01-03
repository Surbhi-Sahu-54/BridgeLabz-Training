package universitycourseenrollmentsystem;

class Undergraduate extends Student implements Graded {

    Undergraduate(int id, String name) {
        super(id, name);
    }

    // Helper Method
    private double calculateGPA(double marks) {
        if (marks >= 90) return 4.0;
        else if (marks >= 75) return 3.5;
        else if (marks >= 60) return 3.0;
        else return 2.0;
    }

    @Override
    public void assignGrade(double marks) {
        double gpa = calculateGPA(marks);
        updateGPA(gpa);
    }
}
