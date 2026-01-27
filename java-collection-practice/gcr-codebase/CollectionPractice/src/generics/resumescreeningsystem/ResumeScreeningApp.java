package generics.resumescreeningsystem;
import java.util.*;

public class ResumeScreeningApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        SoftwareEngineer seRole = new SoftwareEngineer();
        DataScientist dsRole = new DataScientist();
        ProductManager pmRole = new ProductManager();

        Resume<SoftwareEngineer> seResume = new Resume<>(seRole);
        Resume<DataScientist> dsResume = new Resume<>(dsRole);
        Resume<ProductManager> pmResume = new Resume<>(pmRole);

        ArrayList<JobRole> pipeline = new ArrayList<>();
        pipeline.add(seRole);
        pipeline.add(dsRole);
        pipeline.add(pmRole);

        while (true) {
            System.out.println("\nAI-Driven Resume Screening System");
            System.out.println("1. Add Resume for Software Engineer");
            System.out.println("2. Add Resume for Data Scientist");
            System.out.println("3. Add Resume for Product Manager");
            System.out.println("4. Process Resumes");
            System.out.println("5. Display Candidates");
            System.out.println("6. Display Pipeline Roles (Wildcard)");
            System.out.println("7. Generate Report");
            System.out.println("8. Exit");
            System.out.print("Enter choice: ");
            int ch = sc.nextInt();
            sc.nextLine();

            if (ch == 1) {
                System.out.print("Enter Candidate Name: ");
                String name = sc.nextLine();

                System.out.print("Enter Experience (years): ");
                int exp = sc.nextInt();
                sc.nextLine();

                System.out.print("Enter Skill: ");
                String skill = sc.nextLine();

                seResume.addCandidate(new CandidateResume(name, exp, skill));

            } else if (ch == 2) {
                System.out.print("Enter Candidate Name: ");
                String name = sc.nextLine();

                System.out.print("Enter Experience (years): ");
                int exp = sc.nextInt();
                sc.nextLine();

                System.out.print("Enter Skill: ");
                String skill = sc.nextLine();

                dsResume.addCandidate(new CandidateResume(name, exp, skill));

            } else if (ch == 3) {
                System.out.print("Enter Candidate Name: ");
                String name = sc.nextLine();

                System.out.print("Enter Experience (years): ");
                int exp = sc.nextInt();
                sc.nextLine();

                System.out.print("Enter Skill: ");
                String skill = sc.nextLine();

                pmResume.addCandidate(new CandidateResume(name, exp, skill));

            } else if (ch == 4) {
                seResume.processResumes();
                dsResume.processResumes();
                pmResume.processResumes();

            } else if (ch == 5) {
                System.out.println("\n1. Software Engineer Candidates");
                System.out.println("2. Data Scientist Candidates");
                System.out.println("3. Product Manager Candidates");
                System.out.print("Enter option: ");
                int opt = sc.nextInt();
                sc.nextLine();

                if (opt == 1) seResume.displayCandidates();
                else if (opt == 2) dsResume.displayCandidates();
                else if (opt == 3) pmResume.displayCandidates();
                else System.out.println("Invalid option");

            } else if (ch == 6) {
                ScreeningUtil.displayRoles(pipeline);

            } else if (ch == 7) {
                ScreeningUtil.generateReport(seResume);
                ScreeningUtil.generateReport(dsResume);
                ScreeningUtil.generateReport(pmResume);

            } else if (ch == 8) {
                System.out.println("Exit");
                break;

            } else {
                System.out.println("Invalid choice");
            }
            sc.close();
        }
    }
}
