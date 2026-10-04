import java.io.*;

class Employee {
    String emp_name;
    int emp_id;
    String address;
    String mail_id;
    String mob_number;

    Employee(String emp_name, int emp_id, String address,
             String mail_id, String mob_number) {
        this.emp_name = emp_name;
        this.emp_id = emp_id;
        this.address = address;
        this.mail_id = mail_id;
        this.mob_number = mob_number;
    }

    void display() {
        System.out.println("Employee Name: " + emp_name);
        System.out.println("Employee ID: " + emp_id);
        System.out.println("Address: " + address);
        System.out.println("Mail ID: " + mail_id);
        System.out.println("Mobile Number: " + mob_number);
    }
}

class Programmer extends Employee {
    double basicpay, da, hra, pf, fund, netsalary, grosssalary;

    Programmer(String emp_name, int emp_id, String address,
               String mail_id, String mob_number, double bp) {
        super(emp_name, emp_id, address, mail_id, mob_number);
        basicpay = bp;
    }

    public void getPaySlip() {
        da = basicpay * 97 / 100;
        hra = basicpay * 10 / 100;
        pf = basicpay * 12 / 100;
        fund = basicpay * 0.1 / 100;

        grosssalary = basicpay + da + hra + pf + fund;
        netsalary = grosssalary - pf - fund;
    }

    void disp() {
        System.out.println("\nName of the Employee: " + emp_name
                + " ***** PAYSLIP *****");
        display();
        System.out.println("Gross Salary = " + grosssalary);
        System.out.println("Net Salary = " + netsalary);
    }
}

class AssistantProfessor extends Employee {
    double basicpay, da, hra, pf, fund, netsalary, grosssalary;

    AssistantProfessor(String emp_name, int emp_id, String address,
                       String mail_id, String mob_number, double bp) {
        super(emp_name, emp_id, address, mail_id, mob_number);
        basicpay = bp;
    }

    public void getPaySlip() {
        da = basicpay * 97 / 100;
        hra = basicpay * 10 / 100;
        pf = basicpay * 12 / 100;
        fund = basicpay * 0.1 / 100;

        grosssalary = basicpay + da + hra + pf + fund;
        netsalary = grosssalary - pf - fund;
    }

    void disp() {
        System.out.println("\nName of the Employee: " + emp_name
                + " ***** PAYSLIP *****");
        display();
        System.out.println("Gross Salary = " + grosssalary);
        System.out.println("Net Salary = " + netsalary);
    }
}

class AssociateProfessor extends Employee {
    double basicpay, da, hra, pf, fund, netsalary, grosssalary;

    AssociateProfessor(String emp_name, int emp_id, String address,
                       String mail_id, String mob_number, double bp) {
        super(emp_name, emp_id, address, mail_id, mob_number);
        basicpay = bp;
    }

    public void getPaySlip() {
        da = basicpay * 97 / 100;
        hra = basicpay * 10 / 100;
        pf = basicpay * 12 / 100;
        fund = basicpay * 0.1 / 100;

        grosssalary = basicpay + da + hra + pf + fund;
        netsalary = grosssalary - pf - fund;
    }

    void disp() {
        System.out.println("\nName of the Employee: " + emp_name
                + " ***** PAYSLIP *****");
        display();
        System.out.println("Gross Salary = " + grosssalary);
        System.out.println("Net Salary = " + netsalary);
    }
}

class Professor extends Employee {
    double basicpay, da, hra, pf, fund, netsalary, grosssalary;

    Professor(String emp_name, int emp_id, String address,
              String mail_id, String mob_number, double bp) {
        super(emp_name, emp_id, address, mail_id, mob_number);
        basicpay = bp;
    }

    public void getPaySlip() {
        da = basicpay * 97 / 100;
        hra = basicpay * 10 / 100;
        pf = basicpay * 12 / 100;
        fund = basicpay * 0.1 / 100;

        grosssalary = basicpay + da + hra + pf + fund;
        netsalary = grosssalary - pf - fund;
    }

    void disp() {
        System.out.println("\nName of the Employee: " + emp_name
                + " ***** PAYSLIP *****");
        display();
        System.out.println("Gross Salary = " + grosssalary);
        System.out.println("Net Salary = " + netsalary);
    }
}

public class employeePayslip {
    public static void main(String[] args) throws IOException {

        String name, add, mail, mob;
        int id, desg;
        double bp;

        DataInputStream in = new DataInputStream(System.in);

        System.out.println("Enter Name of Employee:");
        name = in.readLine();

        System.out.println("Enter ID of Employee:");
        id = Integer.parseInt(in.readLine());

        System.out.println("Enter Address of Employee:");
        add = in.readLine();

        System.out.println("Enter Mail ID of Employee:");
        mail = in.readLine();

        System.out.println("Enter Mobile Number of Employee:");
        mob = in.readLine();

        System.out.println("Enter the Basic Pay:");
        bp = Double.parseDouble(in.readLine());

        System.out.println("Enter the Designation:");
        System.out.println("1. Programmer");
        System.out.println("2. Assistant Professor");
        System.out.println("3. Associate Professor");
        System.out.println("4. Professor");
        System.out.println("5. Exit");

        desg = Integer.parseInt(in.readLine());

        switch (desg) {
            case 1:
                Programmer p = new Programmer(
                        name, id, add, mail, mob, bp);
                p.getPaySlip();
                p.disp();
                break;

            case 2:
                AssistantProfessor ap = new AssistantProfessor(
                        name, id, add, mail, mob, bp);
                ap.getPaySlip();
                ap.disp();
                break;

            case 3:
                AssociateProfessor assp = new AssociateProfessor(
                        name, id, add, mail, mob, bp);
                assp.getPaySlip();
                assp.disp();
                break;

            case 4:
                Professor pf = new Professor(
                        name, id, add, mail, mob, bp);
                pf.getPaySlip();
                pf.disp();
                break;

            case 5:
                System.exit(0);
                break;

            default:
                System.out.println("Invalid Designation");
        }
    }
}