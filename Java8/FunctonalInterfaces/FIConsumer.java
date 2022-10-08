import java.util.function.Consumer;

class Employee{
    private String ename;
    public String getEname(){
        return ename;
    }

    public void setEname(String ename){
        this.ename = ename;
    } 
}
public class FIConsumer {
    public static void main(String[] args) {
        Employee e = new Employee();

        Consumer<Employee> setName = (obj) -> {obj.setEname("Madan");};

        setName.accept(e);

        System.out.println(e.getEname());
    }
}