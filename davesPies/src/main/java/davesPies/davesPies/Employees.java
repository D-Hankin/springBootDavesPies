package davesPies.davesPies;

public class Employees {
    
    private String employeeName;
    private String employeeEmail;

    public Employees(String employeeName, String employeeEmail) {

        this.employeeName = employeeName;
        this.employeeEmail = employeeEmail; 
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public String getEmployeeEmail() {
        return employeeEmail;
    }

    public void setEmployeeEmail(String employeeEmail) {
        this.employeeEmail = employeeEmail;
    }

    
}
