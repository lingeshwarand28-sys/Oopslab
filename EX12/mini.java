import java.util.Scanner;

// Parent Class
class Customer {
    private String name;
    private int age;
    private double salary;

    // Encapsulation - Setters
    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    // Encapsulation - Getters
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getSalary() {
        return salary;
    }

    public void displayCustomerDetails() {
        System.out.println("\n----- Customer Details -----");
        System.out.println("Name   : " + name);
        System.out.println("Age    : " + age);
        System.out.println("Salary : Rs." + salary);
    }
}

// Child Class - Personal Loan
class PersonalLoan extends Customer {

    // Method Overriding
    public double calculateInterest(double amount) {
        return amount * 0.10;
    }

    public double calculateEMI(double amount, int years) {
        double rate = 0.10 / 12;
        int months = years * 12;

        double emi = (amount * rate * Math.pow(1 + rate, months))
                   / (Math.pow(1 + rate, months) - 1);

        return emi;
    }

    public double eligibleAmount() {
        return getSalary() * 10;
    }
}

// Child Class - Home Loan
class HomeLoan extends Customer {

    // Method Overriding
    public double calculateInterest(double amount) {
        return amount * 0.08;
    }

    public double calculateEMI(double amount, int years) {
        double rate = 0.08 / 12;
        int months = years * 12;

        double emi = (amount * rate * Math.pow(1 + rate, months))
                   / (Math.pow(1 + rate, months) - 1);

        return emi;
    }

    public double eligibleAmount() {
        return getSalary() * 20;
    }
}

// Main Class
public class LoanManagementSystem {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("================================");
        System.out.println("      LOAN MANAGEMENT SYSTEM");
        System.out.println("================================");

        // Customer object
        Customer customer = new Customer();

        System.out.print("Enter Customer Name: ");
        customer.setName(sc.nextLine());

        System.out.print("Enter Age: ");
        customer.setAge(sc.nextInt());

        System.out.print("Enter Monthly Salary: Rs.");
        customer.setSalary(sc.nextDouble());

        customer.displayCustomerDetails();

        // Age eligibility
        if (customer.getAge() < 21) {
            System.out.println("\nSorry! Customer is not eligible.");
            System.out.println("Minimum age required is 21.");
            return;
        }

        System.out.println("\nSelect Loan Type");
        System.out.println("1. Personal Loan");
        System.out.println("2. Home Loan");

        System.out.print("Enter your choice: ");
        int choice = sc.nextInt();

        System.out.print("Enter Loan Amount: Rs.");
        double loanAmount = sc.nextDouble();

        System.out.print("Enter Loan Period (Years): ");
        int years = sc.nextInt();

        if (choice == 1) {

            PersonalLoan loan = new PersonalLoan();

            double eligible = loan.eligibleAmount();

            System.out.println("\n----- Personal Loan -----");

            if (loanAmount <= eligible) {

                double interest = loan.calculateInterest(loanAmount);
                double emi = loan.calculateEMI(loanAmount, years);
                double totalPayment = emi * years * 12;

                System.out.println("Eligible Loan Amount : Rs." + eligible);
                System.out.println("Approved Loan Amount : Rs." + loanAmount);
                System.out.println("Interest Rate        : 10%");
                System.out.println("Total Interest       : Rs." + interest);
                System.out.println("Monthly EMI          : Rs." + emi);
                System.out.println("Total Repayment      : Rs." + totalPayment);

                System.out.println("\nLoan Status: APPROVED");

            } else {
                System.out.println("Eligible Loan Amount : Rs." + eligible);
                System.out.println("Loan Status: NOT ELIGIBLE");
            }

        } else if (choice == 2) {

            HomeLoan loan = new HomeLoan();

            double eligible = loan.eligibleAmount();

            System.out.println("\n----- Home Loan -----");

            if (loanAmount <= eligible) {

                double interest = loan.calculateInterest(loanAmount);
                double emi = loan.calculateEMI(loanAmount, years);
                double totalPayment = emi * years * 12;

                System.out.println("Eligible Loan Amount : Rs." + eligible);
                System.out.println("Approved Loan Amount : Rs." + loanAmount);
                System.out.println("Interest Rate        : 8%");
                System.out.println("Total Interest       : Rs." + interest);
                System.out.println("Monthly EMI          : Rs." + emi);
                System.out.println("Total Repayment      : Rs." + totalPayment);

                System.out.println("\nLoan Status: APPROVED");

            } else {
                System.out.println("Eligible Loan Amount : Rs." + eligible);
                System.out.println("Loan Status: NOT ELIGIBLE");
            }

        } else {
            System.out.println("Invalid choice!");
        }

        sc.close();
    }
}