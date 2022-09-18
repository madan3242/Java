public class Employee{
    private int emp_Id;
    private String emp_Name;

    public void setEmpid(int emp_Id){
        this.emp_Id = emp_Id;
    }
    public int getEmpid(){
        return this.emp_Id;
    }
    public void setEmpName(String emp_Name){
        this.emp_Name = emp_Name;
    }
    public String getEmpName(){
        return this.emp_Name;
    }
}

class Employee1{
    public static void main(String[] args) {
        Employee e1 = new Employee();
        e1.setEmpid(101);
        e1.setEmpName("Employee 1");

        System.out.println(e1.getEmpid());
        System.out.println(e1.getEmpName());
    }
}
class Employee2{
    public static void main(String[] args) {
        Employee e1 = new Employee();
        e1.setEmpid(102);
        e1.setEmpName("Employee 2");

        System.out.println(e1.getEmpid());
        System.out.println(e1.getEmpName());
    }
}