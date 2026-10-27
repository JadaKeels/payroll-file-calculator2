com .pluralsight

public class Employee {
    private int emplyeeId;
    private String name;
    private double hoursWorked;
    private double payRate;

    public Employee(int employeeId, String name, double hoursWorked, double payRate) {
        this.emplyeeId = employeeId;
        this.name = name;
        this.hoursWorked = hoursWorked;
        this.payRate = payRate;
    }
    public int getEmplyeeId() {
        return emplyeeId;
    }
    public String getName() {
        return name;
    }
    public double getGrossPay() {
        return hoursWorked * payRate}
}

