public class Employee {
    int empId;
    String empName;
    Employee(int empId, String empName){
        this.empId = empId;
        this.empName = empName;
    }
    public static void main(String[] args) {
        Employee e1 = new Employee(101, "Employee1");
        Employee e2 = new Employee(102, "Employee 2");

        Employee e4 = new Employee(101, "Employee1");

        System.out.println(e1 == e2);
        System.out.println(e1 == e4);
        
        Employee e3 = e2;

        System.out.println(e1.equals(e2));
        System.out.println(e1.equals(e3));

        System.out.println(e2);
        System.out.println(e3);

        System.out.println(e2.equals(e3));

        System.out.println(e2 == e3);

        System.out.println(e2 == e1);
    }
}
