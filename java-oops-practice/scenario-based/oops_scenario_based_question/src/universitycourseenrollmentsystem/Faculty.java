package universitycourseenrollmentsystem;

class Faculty {
    private String facultyName;

    Faculty(String facultyName) {
        this.facultyName = facultyName;
    }

    public void gradeStudent(Graded student, double marks) {
        student.assignGrade(marks);
    }
}
