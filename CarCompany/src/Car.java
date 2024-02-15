public class Car {
    private int carID;
    private String modelName;
    private String automobileManufacturer;
    private Company companyOwner;

    public Car(int carID, String modelName, String automobileManufacturer, Company companyOwner) {
        this.carID = carID;
        this.modelName = modelName;
        this.automobileManufacturer = automobileManufacturer;
        this.companyOwner = companyOwner;
    }

    public int getCarID() {
        return carID;
    }

    public void setCarID(int carID) {
        this.carID = carID;
    }

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public String getAutomobileManufacturer() {
        return automobileManufacturer;
    }

    public void setAutomobileManufacturer(String automobileManufacturer) {
        this.automobileManufacturer = automobileManufacturer;
    }

    public Company getCompanyOwner() {
        return companyOwner;
    }

    public void setCompanyOwner(Company companyOwner) {
        this.companyOwner = companyOwner;
    }
}
