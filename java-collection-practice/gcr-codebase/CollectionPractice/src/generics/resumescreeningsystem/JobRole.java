package generics.resumescreeningsystem;

public abstract class JobRole {
    private String roleName;
    private int minExperience;
    private String requiredSkill;

    public JobRole(String roleName, int minExperience, String requiredSkill) {
        this.roleName = roleName;
        this.minExperience = minExperience;
        this.requiredSkill = requiredSkill;
    }

    public String getRoleName() {
        return roleName;
    }

    public int getMinExperience() {
        return minExperience;
    }

    public String getRequiredSkill() {
        return requiredSkill;
    }

    public void setMinExperience(int minExperience) {
        this.minExperience = minExperience;
    }

    public void setRequiredSkill(String requiredSkill) {
        this.requiredSkill = requiredSkill;
    }

    public void displayRoleInfo() {
        System.out.println("Role: " + roleName + ", Min Experience: " + minExperience + " years, Skill: " + requiredSkill);
    }
}
