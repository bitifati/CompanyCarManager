import java.util.Date;
import java.util.Iterator;
import java.util.LinkedList;

public class Contractor extends Employee{
    private LinkedList<ContractEmployment> ContractsLinkedList = new LinkedList<ContractEmployment>();

    public Contractor(int employeeID, String name, String surname, String adress, Date birthDate, String postName, Company companyName, LinkedList<ContractEmployment> contractsLinkedList) {
        super(employeeID, name, surname, adress, birthDate, postName, companyName);
        ContractsLinkedList = contractsLinkedList;


    }

    public LinkedList<ContractEmployment> getContractsLinkedList() {
        return ContractsLinkedList;
    }

    public void setContractsLinkedList(LinkedList<ContractEmployment> contractsLinkedList) {
        ContractsLinkedList = contractsLinkedList;
    }

    @Override
    public Date getEndDate() {
        return this.getContractsLinkedList().getLast().getEndWorkingDate();

    }

    public void addContract(ContractEmployment contract){
        this.getContractsLinkedList().addLast(contract);
    }
}
