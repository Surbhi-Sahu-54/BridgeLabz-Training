package generics.resumescreeningsystem;

import java.util.*;

public class ScreeningUtil {

    public static void displayRoles(List<? extends JobRole> roles) {
        if (roles.size() == 0) {
            System.out.println("No job roles available.");
            return;
        }

        System.out.println("Job Roles in Screening Pipeline:");
        for (JobRole r : roles) {
            r.displayRoleInfo();
        }
    }

    public static <T extends JobRole> void generateReport(Resume<T> resume) {
        System.out.println("\nReport for: " + resume.getRole().getRoleName());
        resume.displayCandidates();
    }
}
