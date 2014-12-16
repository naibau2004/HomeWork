package h20141216_sung;

import java.util.ArrayList;
import java.util.List;

public class Employee {
    private String id;
    private String name;
    private Employee supervisor;
    
    private List<Employee> employees = new ArrayList<Employee>();   
    
    /**
     * @param id
     * @param name
     */
    public Employee(String id, String name) {
        super();
        this.id = id;
        this.name = name;
    }

    public void addEmployee(Employee emp) {
        employees.add(emp);
    }


    /**
     * @return the supervisor
     */
    public Employee getSupervisor() {
        return supervisor;
    }



    /**
     * @param supervisor the supervisor to set
     */
    public void setSupervisor(Employee supervisor) {
        this.supervisor = supervisor;
    }

    public String getName() {
        return name;      
    }
    
    public void printAllEmployees() {
        System.out.println("Employee name is " + name);
        
        for (Employee emp : employees) {
            emp.printAllEmployees();
        }
    }


    public static void main(String[] args) {
        Employee boss = new Employee("0", "Boss"); // 老闆
        
        
        Employee kevin = new Employee("1", "Kevin"); // 主管
        kevin.setSupervisor(boss);
        
        Employee mary = new Employee("2", "Mary"); // 部屬1
        mary.setSupervisor(kevin);
        Employee john = new Employee("3", "John"); // 部屬2
        john.setSupervisor(kevin);

        boss.addEmployee(kevin);
        kevin.addEmployee(mary);
        kevin.addEmployee(john);
        
        boss.printAllEmployees();
    }
    
}

