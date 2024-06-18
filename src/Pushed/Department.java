package Organization;
import Employee.Employee;
import java.util.ArrayList;
public class Department {
    ArrayList<Employee> employees;
    Employee manager;

    public Department(ArrayList<Employee> employees, Employee manager) {
        this.employees = employees;
        this.manager = manager;
    }

    public ArrayList<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(ArrayList<Employee> employees) {
        this.employees = employees;
    }

    public Employee getManager() {
        return manager;
    }

    public void setManager(Employee manager) {
        this.manager = manager;
    }
    public void deleteEmployee(Employee employee){
        for (Employee e: employees
             ) {
            if (e.equals(employee)){
                employees.remove(employee);
                if (manager.equals(employee)){
                    manager = employees.get(employees.size() - 1);
                }
            }
        }
    }
}
