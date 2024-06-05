import java.util.Scanner;
import java.util.ArrayList;
import java.io.*;

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

class Payroll_System {
    public void display_employee_information(ArrayList<Employee> array1) {
        System.out.println("Employee details: ");
        for (Employee emp : array1) {
            System.out.println("Name: " + emp.getName());
            System.out.println("ID: " + emp.getID());
            System.out.println("Monthly Salary: " + emp.calculate_Salary());
        }
    }

    public static void main(String[] args) {
        HourlyEmployee employee1 = new HourlyEmployee("Haider", 5615, 43000, 18);
      SalariedEmployee employee2 = new SalariedEmployee("Unkil", 9842, 100000);
        ArrayList<Employee> employees = new ArrayList<>();
        employees.add(employee1);
        employees.add(employee2);
        Payroll_System payroll = new Payroll_System();
        payroll.display_employee_information(employees);
        
    }
}