import java.util.ArrayList;

public class NewJoinee {

    public static void main(String[] args) {
       NewJoinee newx = new NewJoinee();
        for (Employee employee : newx.PrintEmployeeList()) {
            System.out.println(employee);
        }

    }

    public  ArrayList<Employee> PrintEmployeeList (){
        ArrayList <Employee> empList = new ArrayList<>();

        Employee emp = null;
        for (int i = 0; i < 5 ; i++) {
            emp = new Employee();
            emp.setEmpid(i);
            emp.setEmpName("EmployeName "+i);
            emp.setEmpSalary("1000");
            empList.add(emp);
        }

        System.out.println(empList);
        return empList;

    }
}
