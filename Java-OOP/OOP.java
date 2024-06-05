import java.util.Scanner;

abstract class Employee {

    private String name;
    private int Employee_ID;

    public Employee(String name, int Employee_ID) {
        this.name = name;
        this.Employee_ID = Employee_ID;
    }

    public abstract float calculate_Salary();

    public String getName() {
        return name;
    }

    public int getID() {
        return Employee_ID;
    }
}

class HourlyEmployee extends Employee {
    private float hourly_rate;
    private float hours_worked;

    public HourlyEmployee(String name, int ID, float rate, float hour2) {
        super(name, ID);
        this.hourly_rate = rate;
        this.hours_worked = hour2;
    }

    @Override
    public float calculate_Salary() {
        return hourly_rate * hours_worked;
    }

    public float getrate() {
        return hourly_rate;
    }

    public float gethour() {
        return hours_worked;
    }
}

class SalariedEmployee extends Employee {
    float monthly_salary;

    SalariedEmployee(String name, int ID, float Salary) {
        super(name, ID);
        monthly_salary = Salary;
    }

    public float getSal() {
        return monthly_salary;
    }

    public float calculate_Salary() {
        return monthly_salary;
    }

}

class CommissionedEmployee extends Employee {
    private float base_salary;
    private float commission_rate;
    private float sales_amount;

    public CommissionedEmployee(String name, int Employee_ID, float base_salary, float commission_rate,
            float sales_amount) {
        super(name, Employee_ID);
        this.base_salary = base_salary;
        this.commission_rate = commission_rate;
        this.sales_amount = sales_amount;

    }

    @Override
    public float calculate_Salary() {
        return base_salary + ((commission_rate * sales_amount) / 100);
    }
}

class Payroll_System {
    public void display_employee_information(Employee array1) {
        System.out.println("Employee details: ");
        System.out.println("Name: " + array1.getName());
        System.out.println("ID: " + array1.getID());
        System.out.println("Monthly Salary: " + array1.calculate_Salary());
    }

    

    public static void main(String[] args) {
        CommissionedEmployee employee = new CommissionedEmployee("Haider", 4532, 32000, 10, 10000);
        Payroll_System payroll = new Payroll_System();
        payroll.display_employee_information(employee);
    }
}