package Homework_3_4;

public class User {
    private String name, companyName, currency;
    private int monthsOfEmployment, salary, balance;

    public User(String name, String companyName, String currency, int balance, int monthsOfEmployment, int salary) {
        this.name = name;
        this.companyName = companyName;
        this.currency = currency;
        this.balance = balance;
        this.monthsOfEmployment = monthsOfEmployment;
        this.salary = salary;
    }

    void paySalary(){
        int totalBal = getBalance()+ getSalary();
        System.out.println("Your current balance is " + totalBal + " " + getCurrency());
    }

    void withdraw(int summ){
        double newBal;
        if (summ < 1000){
           newBal = getBalance()- (summ * 1.05);
        } else {
            newBal = getBalance()- (summ * 1.1);
        }
        if (newBal >= 0) {
            System.out.println("The operation successfully completed. The new balance is " + newBal);
        } else {
            System.out.println("Not enough money to complete the operation");
        }
    }

    void companyNameLenght(){
        System.out.println("The company's name has length " + getCompanyName().length());
    }

    void monthIncreaser(int addMonth){
        int totalMonth = getMonthsOfEmployment() + addMonth;
        setMonthsOfEmployment(totalMonth);
        System.out.println("You have been work here for " + totalMonth + "  month");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public int getMonthsOfEmployment() {
        return monthsOfEmployment;
    }

    public void setMonthsOfEmployment(int monthsOfEmployment) {
        this.monthsOfEmployment = monthsOfEmployment;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
}
