package universitycourseenrollmentsystem;

class Enrollment {
    private Student student;
    private Course course;

    Enrollment(Student student, Course course) {
        this.student = student;
        this.course = course;
    }

    public void showEnrollment() {
        System.out.println("Enrollment Successful");
        course.displayCourse();
    }
}
