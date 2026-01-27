package collections.map_interface;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
class Employee{
    private String employeeName ;
    private String employeeDepartment ;

    public Employee(String employeeName, String employeeDepartment) {
        this.employeeName = employeeName;
        this.employeeDepartment = employeeDepartment;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public String getEmployeeDepartment() {
        return employeeDepartment;
    }

    @Override
    public String toString() {
        return employeeName;
    }
}
class AddEmployee {
    ArrayList<Employee> employees ;

    public AddEmployee() {
        employees = new ArrayList<>();
    }

    //Adding employees to Arraylist
    public void addEmployee(Employee employee){
        employees.add(employee);
    }

    //Method to group employees by department
    public Map<String, List<Employee>> groupByDepartment() {
        Map<String, List<Employee>> departmentMap = new HashMap<>();
        for (Employee emp : employees) {
            if (!departmentMap.containsKey(emp.getEmployeeDepartment())){
                departmentMap.put(emp.getEmployeeDepartment(), new ArrayList<>());
            }
            departmentMap.get(emp.getEmployeeDepartment()).add(emp);
        }
        return departmentMap;
    }

    // Method to display grouped employees
    public void displayGroupedEmployees() {
        Map<String, List<Employee>> groupedEmployees = groupByDepartment();
        for (Map.Entry<String, List<Employee>> entry : groupedEmployees.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
public class GroupObjects {
    public static void main(String[] args) {

        AddEmployee employee1 = new AddEmployee();

        //Adding employees
        employee1.addEmployee(new Employee("Surbhi", "IT"));
        employee1.addEmployee(new Employee("Deep", "HR"));
        employee1.addEmployee(new Employee("Shweta", "IT"));
        employee1.addEmployee(new Employee("Yuvraj", "HR"));
        employee1.addEmployee(new Employee("Saurabh", "IT"));

        //Displaying employee details
        employee1.displayGroupedEmployees();

    }
}

