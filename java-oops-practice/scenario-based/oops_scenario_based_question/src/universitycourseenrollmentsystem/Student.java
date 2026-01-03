package universitycourseenrollmentsystem;

class Student {
    private int studentId;
    private String name;
    private double gpa;

    Student(int studentId, String name) {
        this.studentId = studentId;
        this.name = name;
        this.gpa = 0.0;
    }

    protected void updateGPA(double newGPA) {
        this.gpa = newGPA;
    }

    public void viewTranscript() {
        System.out.println("Student ID: " + studentId);
        System.out.println("Name: " + name);
        System.out.println("GPA: " + gpa);
    }
}
