import java.util.ArrayList;

public class Company {
    private int companyID;
    private String name;
    private String adress;
    private final ArrayList<Car> carArrayList = new ArrayList<Car>();
    private final ArrayList<Employee> employeeArrayList = new ArrayList<Employee>();

    public Company(int companyID, String name, String adress) {
        this.companyID = companyID;
        this.name = name;
        this.adress = adress;
    }

    public int getCompanyID() {
        return companyID;
    }

    public void setCompanyID(int companyID) {
        this.companyID = companyID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public ArrayList<Car> getCarArrayList() {
        return carArrayList;
    }

    public ArrayList<Employee> getEmployeeArrayList() {
        return employeeArrayList;
    }
}
