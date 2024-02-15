import java.util.Calendar;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        //create company
        Company BEA = new Company(123, "BEA", "Hydra");

        //create cars
        Car car1 = new Car(123456,"QQ", "Cherry", BEA);

        //create Employees

        Permanent emp1 = new Permanent(1, "fatima", "Guebli", "Algiers", new Date(2004, Calendar.MARCH, 16), "software engineer", BEA);
        Permanent emp2 = new Permanent(2, "Meriem", "Gbl", "Tipaza", new Date(2006, Calendar.MARCH, 3), "chemist", BEA);

        Contractor emp3 = new Contractor(3, "Mohamed", "Sid Ali", "Tizi", new Date(2012, Calendar.AUGUST, 1), "Doctor", BEA, new LinkedList<ContractEmployment>());
        Contractor emp4 = new Contractor(4, "Hadjer", "Ha", "Boumerdes", new Date(2015, Calendar.JUNE, 1), "teacher", BEA, new LinkedList<ContractEmployment>());


        //create employment contract

        ContractEmployment cont1 = new ContractEmployment(001, true, new Date(2021,Calendar.JULY,5), new Date(2022, Calendar.JULY,5), emp3);
        emp3.addContract(cont1);
        ContractEmployment cont2 = new ContractEmployment(002, false, new Date(2023,Calendar.JULY,5), new Date(2025, Calendar.JULY,5), emp3);
        emp3.addContract(cont2);

        LinkedList<ContractEmployment> contractsLinkedList = emp3.getContractsLinkedList();
        Iterator<ContractEmployment> iterator = contractsLinkedList.iterator();

        System.out.println("employee "+emp3.getEmployeeID() + " is " + emp3.getName() + " " + emp3.getSurname() + "\n\n");
        System.out.println("his/her contracts : \n");

        while (iterator.hasNext()){
            ContractEmployment contract = iterator.next();
            System.out.println("contract number "+ contract.getContractID() + "\n"+ " startdate : "+contract.getStartWorkingDate() + "\n"+ " endDate : "+ contract.getEndWorkingDate()+ "\n");
        }

        System.out.println("-------------------------------------------------------------------------------");
        System.out.println("now we will create car contracts \n\n");

        ContractCar carContract1 = new ContractCar(15,new Date(2024, Calendar.SEPTEMBER,1), "bon", new Date(2025, Calendar.MARCH, 5), "", emp3, car1);

        System.out.println("car contract ID :  " + carContract1.getContractID());
        System.out.println("car contracted ID : " + carContract1.getCar().getCarID());
        System.out.println("car contracted model : " + carContract1.getCar().getModelName());
        System.out.println("car contracted manufacturer : " + carContract1.getCar().getAutomobileManufacturer());
        System.out.println("car contract start date : " + carContract1.getStartDate());
        System.out.println("car contract start state : " + carContract1.getStartState());
        System.out.println("car contract end date : " + carContract1.getEndDate());
        System.out.println("car contract end state : " + carContract1.getEndState());

    }
}