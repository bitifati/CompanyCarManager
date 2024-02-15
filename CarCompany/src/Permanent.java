import java.util.Date;

public class Permanent extends Employee {

    public Permanent(int employeeID, String name, String surname, String adress, Date birthDate, String postName, Company companyName) {
        super(employeeID, name, surname, adress, birthDate, postName, companyName);
    }

    @Override
    public Date getEndDate() {
        throw new UnsupportedOperationException("Permanent employee does not have an end date");
    }

    public Date getStartDate(){
        throw new UnsupportedOperationException("Permanent employee is not concerned by this method");
    }

}
