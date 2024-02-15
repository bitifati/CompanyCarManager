import java.util.Date;

public class ContractEmployment {
    private int contractID;
    private boolean renewContract;
    private Date startWorkingDate;
    private Date endWorkingDate;
    private Contractor contractor;

    public ContractEmployment(int contractID, boolean renewContract, Date startWorkingDate, Date endWorkingDate, Contractor contractor) {
        this.contractID = contractID;
        this.renewContract = renewContract;
        this.startWorkingDate = startWorkingDate;
        this.endWorkingDate = endWorkingDate;
        this.contractor = contractor;

    }

    public int getContractID() {
        return contractID;
    }

    public void setContractID(int contractID) {
        this.contractID = contractID;
    }

    public boolean isRenewContract() {
        return renewContract;
    }

    public void setRenewContract(boolean renewContract) {
        this.renewContract = renewContract;
    }

    public Date getStartWorkingDate() {
        return startWorkingDate;
    }

    public void setStartWorkingDate(Date startWorkingDate) {
        this.startWorkingDate = startWorkingDate;
    }

    public Date getEndWorkingDate() {
        return endWorkingDate;
    }

    public void setEndWorkingDate(Date endWorkingDate) {
        this.endWorkingDate = endWorkingDate;
    }

    public Contractor getContractor() {
        return contractor;
    }

    public void setContractor(Contractor contractor) {
        this.contractor = contractor;
    }
}
