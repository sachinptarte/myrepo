public class Employee {

    int empid;

    String empName;
    String empSalary;


    public int empid() {
        return empid;
    }

    public Employee setEmpid(int empid) {
        this.empid = empid;
        return this;
    }

    public String empName() {
        return empName;
    }

    public Employee setEmpName(String empName) {
        this.empName = empName;
        return this;
    }

    public String empSalary() {
        return empSalary;
    }

    public Employee setEmpSalary(String empSalary) {
        this.empSalary = empSalary;
        return this;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Employee{");
        sb.append("empid=").append(empid);
        sb.append(", empName='").append(empName).append('\'');
        sb.append(", empSalary='").append(empSalary).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
