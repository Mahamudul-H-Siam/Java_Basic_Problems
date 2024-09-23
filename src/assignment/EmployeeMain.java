package assignment;

class Employe {
    private int id;
    private String name;
    private String position;
    private double baseSalary;
    private String department;

    public Employe(int id, String name, String position, double baseSalary, String department) {
        this.id = id;
        this.name = name;
        this.position = position;
        this.baseSalary = baseSalary;
        this.department = department;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getPosition() {
        return position;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public String getDepartment() {
        return department;
    }

    public double getSalary() {
        return baseSalary;
    }

    public void printDetails() {
        System.out.println("Department: " + department);
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Position: " + position);
        System.out.println("Base Salary: " + baseSalary);
    }
}

// Full-Time Employee Class
class FullTime extends Employe {
    private double bonus;
    private String healthInsurance;
    private int leaveDays;

    public FullTime(int id, String name, String position, double baseSalary, double bonus, String healthInsurance, int leaveDays, String department) {
        super(id, name, position, baseSalary, department);
        this.bonus = bonus;
        this.healthInsurance = healthInsurance;
        this.leaveDays = leaveDays;
    }

    @Override
    public double getSalary() {
        return getBaseSalary() + bonus;
    }

    @Override
    public void printDetails() {
        super.printDetails();
        System.out.println("Bonus: " + bonus);
        System.out.println("Total Salary: " + getSalary());
        System.out.println("Health Insurance: " + healthInsurance);
        System.out.println("Leave Days: " + leaveDays);
    }
}

// Part-Time Employee Class
class PartTime extends Employe {
    private int hoursWorked;
    private double hourlyRate;
    private String contractDuration;
    private int overtimeHours;

    public PartTime(int id, String name, String position, double baseSalary, int hoursWorked, double hourlyRate, String contractDuration, int overtimeHours, String department) {
        super(id, name, position, baseSalary, department);
        this.hoursWorked = hoursWorked;
        this.hourlyRate = hourlyRate;
        this.contractDuration = contractDuration;
        this.overtimeHours = overtimeHours;
    }

    @Override
    public double getSalary() {
        return (hoursWorked + overtimeHours) * hourlyRate;
    }

    @Override
    public void printDetails() {
        super.printDetails();
        System.out.println("Hours Worked: " + hoursWorked);
        System.out.println("Hourly Rate: " + hourlyRate);
        System.out.println("Total Salary: " + getSalary());
        System.out.println("Contract Duration: " + contractDuration);
        System.out.println("Overtime Hours: " + overtimeHours);
    }
}

// Contract Employee Class
class ContractEmployee extends Employe {
    private String projectName;
    private String contractEndDate;
    private double contractAmount;

    public ContractEmployee(int id, String name, String position, double baseSalary, String projectName, String contractEndDate, double contractAmount, String department) {
        super(id, name, position, baseSalary, department);
        this.projectName = projectName;
        this.contractEndDate = contractEndDate;
        this.contractAmount = contractAmount;
    }

    @Override
    public double getSalary() {
        return contractAmount;
    }

    @Override
    public void printDetails() {
        super.printDetails();
        System.out.println("Project Name: " + projectName);
        System.out.println("Contract End Date: " + contractEndDate);
        System.out.println("Contract Amount: " + contractAmount);
    }
}

// Main class to test the functionality
public class EmployeeMain {
    public static void main(String[] args) {
        // Full-Time Employee Instances
        FullTime fullTimeEmp1 = new FullTime(101, "John Doe", "Manager", 50000, 10000, "Premium Health", 20, "Technology");
        FullTime fullTimeEmp2 = new FullTime(103, "Alice Johnson", "Senior Developer", 60000, 15000, "Standard Health", 15, "Technology");

        // Part-Time Employee Instances
        PartTime partTimeEmp1 = new PartTime(102, "Jane Smith", "Consultant", 0, 20, 50, "6 months", 5, "Human Resources");
        PartTime partTimeEmp2 = new PartTime(104, "Bob Brown", "Junior Consultant", 0, 25, 45, "3 months", 2, "Human Resources");

        // Contract Employee Instance
        ContractEmployee contractEmp1 = new ContractEmployee(105, "Tom Hardy", "Project Lead", 40000, "Project X", "2024-12-31", 60000, "Consulting");

        // Print Full-Time Employees' Details
        System.out.println("Full-Time Employee Details:");
        fullTimeEmp1.printDetails();
        System.out.println();
        fullTimeEmp2.printDetails();
        System.out.println();
        System.out.println("Total Payroll for Full-Time Employees: " + (fullTimeEmp1.getSalary() + fullTimeEmp2.getSalary()));

        // Print Part-Time Employees' Details
        System.out.println("\nPart-Time Employee Details:");
        partTimeEmp1.printDetails();
        System.out.println();
        partTimeEmp2.printDetails();
        System.out.println();
        System.out.println("Total Payroll for Part-Time Employees: " + (partTimeEmp1.getSalary() + partTimeEmp2.getSalary()));

        // Print Contract Employee Details
        System.out.println("\nContract Employee Details:");
        contractEmp1.printDetails();
        System.out.println();
        System.out.println("Total Payroll for Contract Employees: " + contractEmp1.getSalary());
    }
}
