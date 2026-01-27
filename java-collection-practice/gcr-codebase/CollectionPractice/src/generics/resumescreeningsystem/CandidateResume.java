package generics.resumescreeningsystem;

public class CandidateResume {
    private String candidateName;
    private int experience;
    private String skill;
    private double score;

    public CandidateResume(String candidateName, int experience, String skill) {
        this.candidateName = candidateName;
        this.experience = experience;
        this.skill = skill;
        this.score = 0;
    }

    public String getCandidateName() {
        return candidateName;
    }

    public int getExperience() {
        return experience;
    }

    public String getSkill() {
        return skill;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    public void displayResume() {
        System.out.println("Candidate: " + candidateName + ", Exp: " + experience + ", Skill: " + skill + ", Score: " + score);
    }
}
