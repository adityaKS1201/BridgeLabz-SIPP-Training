import java.util.*;

abstract class JobRole {
    private String name;
    public JobRole(String name) { this.name = name; }
    public String getName() { return name; }
}

class SoftwareEngineer extends JobRole {
    public SoftwareEngineer() { super("Software Engineer"); }
}

class DataScientist extends JobRole {
    public DataScientist() { super("Data Scientist"); }
}

class ProductManager extends JobRole {
    public ProductManager() { super("Product Manager"); }
}

class Resume<T extends JobRole> {
    private T role;
    public Resume(T role) { this.role = role; }
    public T getRole() { return role; }
}

public class ResumeScreening {
    public static void screenResumes(List<? extends JobRole> roles) {
        for (JobRole role : roles) {
            System.out.println("Screening resume for: " + role.getName());
        }
    }

    public static void main(String[] args) {
        List<JobRole> roles = new ArrayList<>();
        roles.add(new SoftwareEngineer());
        roles.add(new DataScientist());
        roles.add(new ProductManager());

        screenResumes(roles);
    }
}
