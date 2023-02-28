public class MyClass {
    public static void main(String[] args) {
        Employee emp= new Employee("Anika",5242,2000.0);
        emp.setName("anika");
        emp.setId(5242);
        emp.setSalary(20000.0);
        emp.age=20;
        System.out.println("Name: "+emp.getName());
        System.out.println("ID: "+emp.getId());
        System.out.println("Salary: "+emp.getSalary());
        System.out.println("Age: "+emp.age);
    }
}
