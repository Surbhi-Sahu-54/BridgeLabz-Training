package generics.coursemanagementsystem;

public class ResearchCourse extends CourseType {
    private String researchTopic;

    public ResearchCourse(String courseCode, String courseName, int credits, String researchTopic) {
        super(courseCode, courseName, credits);
        this.researchTopic = researchTopic;
    }

    public String getResearchTopic() {
        return researchTopic;
    }

    public void setResearchTopic(String researchTopic) {
        this.researchTopic = researchTopic;
    }

    @Override
    public String evaluationType() {
        return "Research-Based";
    }

    @Override
    public void displayCourse() {
        super.displayCourse();
        System.out.println("Research Topic: " + researchTopic);
        System.out.println("----------------------");
    }
}
