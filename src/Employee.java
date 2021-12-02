import java.util.ArrayList;
import java.util.function.Predicate;

public class Employee {
    String name;
    String department;
    int salary;

    Employee(String name, String department, int salary) {
        this.name = name;
        this.department = department;
        this.salary = salary;
    }
}
class TestEmployee {
    static void printEmployee(Employee e) {
        System.out.println("Name: " + e.name + " Department: " + e.department + " Salary: " + e.salary);
    }
    static void filtraciyaRabotnikov(Predicate <Employee> t, ArrayList<Employee> a){
        for (Employee employee : a) {
            if (t.test(employee)) {
                printEmployee(employee);
            }
        }
    }


    public static void main(String[] args) {
        ArrayList<Employee> employeeArrayList = new ArrayList<>();
        Employee e1 = new Employee("Ivan", "Ivan", 460);
        Employee e2 = new Employee("Kola", "IT", 300);
        Employee e3 = new Employee("EMarya", "Qwer", 4500);
        employeeArrayList.add(e1);
        employeeArrayList.add(e2);
        employeeArrayList.add(e3);
        filtraciyaRabotnikov(e -> e.department == "IT" && e.salary > 200,employeeArrayList );
        filtraciyaRabotnikov(e -> e.name.startsWith("E"), employeeArrayList);
        filtraciyaRabotnikov(employee -> employee.name.equals(employee.department) && employee.salary != 450, employeeArrayList);
    }
}
