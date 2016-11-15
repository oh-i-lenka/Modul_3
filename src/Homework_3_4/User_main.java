package Homework_3_4;

public class User_main {

    public static void main(String[] args) {
        User Olena = new User("Olena", "IvanovaGMBH", "Euro", 100, 8, 2800);
        Olena.paySalary();
        Olena.withdraw(200);
        Olena.companyNameLenght();
        Olena.monthIncreaser(12);
    }
}
