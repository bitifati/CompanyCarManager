import java.util.Date;

public class ContractCar {
    private int contractID;
    private Date startDate;
    private String startState;
    private Date endDate;
    private String endState;
    private Employee employee;
    private Car Car;

    public ContractCar(int contractID, Date startDate, String startState, Date endDate, String endState, Employee employee, Car car) {
        this.contractID = contractID;
        this.startDate = startDate;
        this.startState = startState;
        this.endDate = endDate;
        this.endState = endState;
        this.employee = employee;
        this.Car = car;

        if (endDate.after(employee.getEndDate())) {
            throw new IllegalArgumentException("Contract end date cannot exceed employee's end date");
        }

        if (startDate.before(employee.getEndDate())) {
            throw new IllegalArgumentException("Contract end date cannot be set before employee's start date");
        }

    }

    public int getContractID() {
        return contractID;
    }

    public void setContractID(int contractID) {
        this.contractID = contractID;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public String getStartState() {
        return startState;
    }

    public void setStartState(String startState) {
        this.startState = startState;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public String getEndState() {
        return endState;
    }

    public void setEndState(String endState) {
        this.endState = endState;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public Car getCar() {
        return Car;
    }

    public void setCar(Car car) {
        Car = car;
    }
}
