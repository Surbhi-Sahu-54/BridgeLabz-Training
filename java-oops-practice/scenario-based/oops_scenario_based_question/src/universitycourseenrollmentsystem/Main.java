package universitycourseenrollmentsystem;

public class Main{
    public static void main(String[] args) {

        Student ug = new Undergraduate(101, "Surbhi");
        Student pg = new Postgraduate(201, "Subh");

        Course c1 = new Course("CS101", "Object Oriented Programming");

        Enrollment e1 = new Enrollment(ug, c1);
        Enrollment e2 = new Enrollment(pg, c1);

        Faculty faculty = new Faculty("Dr. Sharma");

        e1.showEnrollment();
        faculty.gradeStudent((Graded) ug, 82);
        ug.viewTranscript();

        System.out.println("----------------");

        e2.showEnrollment();
        faculty.gradeStudent((Graded) pg, 45);
        pg.viewTranscript();
    }
}
