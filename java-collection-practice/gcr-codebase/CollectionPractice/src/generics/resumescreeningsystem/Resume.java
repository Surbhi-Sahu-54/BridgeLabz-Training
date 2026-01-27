package generics.resumescreeningsystem;

import java.util.*;

public class Resume<T extends JobRole> {
    private T role;
    private ArrayList<CandidateResume> candidates = new ArrayList<>();

    public Resume(T role) {
        this.role = role;
    }

    public void addCandidate(CandidateResume c) {
        candidates.add(c);
        System.out.println("Candidate resume added for " + role.getRoleName());
    }

    public void processResumes() {
        if (candidates.size() == 0) {
            System.out.println("No resumes to process.");
            return;
        }

        System.out.println("Processing resumes for role: " + role.getRoleName());

        for (CandidateResume c : candidates) {
            double score = calculateScore(c, role);
            c.setScore(score);
        }

        System.out.println("Screening complete.");
    }

    private double calculateScore(CandidateResume c, T role) {
        double score = 0;

        if (c.getExperience() >= role.getMinExperience()) score += 50;
        if (c.getSkill().equalsIgnoreCase(role.getRequiredSkill())) score += 50;

        return score;
    }

    public void displayCandidates() {
        if (candidates.size() == 0) {
            System.out.println("No candidates available.");
            return;
        }

        System.out.println("Candidates List for " + role.getRoleName() + ":");
        for (CandidateResume c : candidates) {
            c.displayResume();
        }
    }

    public ArrayList<CandidateResume> getCandidates() {
        return candidates;
    }

    public T getRole() {
        return role;
    }
}
