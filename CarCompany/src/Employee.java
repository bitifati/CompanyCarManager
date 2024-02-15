import java.util.Date;

public abstract class Employee {
    int employeeID;
    private String name;
    private String surname;
    private String adress;
    private Date birthDate;
    private String postName;
    private Company companyName;

    public Employee(int employeeID, String name, String surname, String adress, Date birthDate, String postName, Company companyName) {
        this.employeeID = employeeID;
        this.name = name;
        this.surname = surname;
        this.adress = adress;
        this.birthDate = birthDate;
        this.postName = postName;
        this.companyName = companyName;
    }

    public int getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(int employeeID) {
        this.employeeID = employeeID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public String getPostName() {
        return postName;
    }

    public void setPostName(String postName) {
        this.postName = postName;
    }

    public Company getCompanyName() {
        return companyName;
    }

    public void setCompanyName(Company companyName) {
        this.companyName = companyName;
    }


    public abstract Date getEndDate();
}
