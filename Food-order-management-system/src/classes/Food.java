package classes;
import java.lang.*;
import interfaces.FoodCustomerOperations;
import interfaces.FoodEmployeeOperations;

public class Food implements FoodCustomerOperations, FoodEmployeeOperations
{
    private Customer customers[] = new Customer [500];
    private Employee employees[] = new Employee [100];

    public boolean insertCustomer(Customer c)
    {
        boolean flag = false;
        for(int i=0; i<customers.length; i++)
        {
            if(customers[i] == null)
            {
                customers[i] = c;
                flag = true;
                break;
            }
        }
        return flag;
    }

    public boolean removeCustomer(Customer c)
    {
        boolean flag = false;
        for(int i=0; i<customers.length; i++)
        {
            if(customers[i] == c)
            {
                customers[i] = null;
                flag = true;
                break;
            }
        }
        return flag;
    }

    public Customer searchCustomer(int mblNo)
    {
        Customer c = null;

        for(int i=0; i<customers.length; i++)
        {
            if(customers[i] != null)
            {
                if(customers[i].getMblno() == mblNo)
                {
                    c = customers[i];
                    break;
                }
            }
        }
        return c;
    }
    public void showAllCustomers()
    {
        for(int i=0; i<customers.length; i++)
        {
            if(customers[i] != null)
            {
                System.out.println("************************");
                customers[i].showDetails();
                customers[i].showAllAccounts();
                System.out.println();
            }
        }
    }

    public boolean insertEmployee(Employee e)
    {
        boolean flag = false;
        for(int i=0; i<employees.length; i++)
        {
            if(employees[i] == null)
            {
                employees[i] = e;
                flag = true;
                break;
            }
        }
        return flag;
    }

    public boolean removeEmployee(Employee e)
    {
        boolean flag = false;
        for(int i=0; i<employees.length; i++)
        {
            if(employees[i] == e)
            {
                employees[i] = null;
                flag = true;
                break;
            }
        }
        return flag;
    }

    public Employee searchEmployee(String empId)
    {
        Employee e = null;

        for(int i=0; i<employees.length; i++)
        {
            if(employees[i] != null)
            {
                if(employees[i].getEmpId().equals(empId))
                {
                    e = employees[i];
                    break;
                }
            }
        }
        return e;
    }

    public void showAllEmployees()
    {
        System.out.println("---------------------");

        for(int i=0; i<employees.length; i++)
        {
            if(employees[i] != null)
            {
                System.out.println("Employee Id: " + employees[i].getEmpId());
                System.out.println("Employee Name: " + employees[i].getName());
                System.out.println("Employee Salary: " + employees[i].getSalary());
                System.out.println();
            }
        }
    }
}

