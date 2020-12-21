import java.util.Scanner;

public class Email {
    private String firstName;
    private String lastName;
    private String password;
    private String department;
    private int mailboxCapacity;
    private String alternateEmail;

    public Email(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
        this.department = setDepartment();

        System.out.println("EMAIL CREATED:" + " " + this.firstName + " " + this.lastName);
    }
    
    //Asks the user for their department and returns which department they select. 
    private String setDepartment(){
        System.out.println("DEPARTMENT CODES\n1 for Sales\n2 for Development\n3 for Accounting\n0 for None\nEnter Department Code: ");
        Scanner in = new Scanner(System.in);
        int departmentChoice = in.nextInt();
        in.close();

        if(departmentChoice == 1){ return "sales";}
        else if(departmentChoice == 2){return "dev";}
        else if(departmentChoice == 3){return "acct";}
        else{return "";}
    }
}