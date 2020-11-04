package zada4iskyrsov;
import java.util.Scanner;


class Bank {

    public Account createNewAccount(Double startAmount, BankCondition condition) {
        Integer durationYears = condition.durationYears;
        Double percent = condition.percent;

        return new Account(startAmount, condition);
    }
}

class Account {
    Double amount;
    BankCondition condition;

    Account(Double startAmount, BankCondition condition) {
        this.amount = startAmount;
        this.condition = condition;
    }

    public Double calculateProfit() {
        amount = amount + Math.pow((1 + condition.percent / 100), condition.durationYears);
        // Scanner str = new Scanner(System.in);

        // Double  p;
        // Integer dy;
        // Double amount, startAmount;

        // System.out.println("VVedite na4al'nii deposit:  ");
        // startAmount = str.nextDouble();
        // System.out.println( "VVedite procent:  ");
        // p = str.nextDouble();
        // System.out.println("VVedite srok vklada:  ");
        // dy = str.nextInt();


        // amount = startAmount * Math.pow((1 + p/100),dy);


        // // sum = sum*(1+ percent/ 100)
        // // amount = amount + (startAmount*p/(365*dy))/100;
        // //formula
        // /// System.out.println(amount);
        return amount;
    }
}

class BankCondition {
    final Double percent;
    final Integer durationYears;

    BankCondition(Double p, Integer dy) {
        this.percent = p;
        this.durationYears = dy;
    }
}

public class Vkladbank {
    public static void main(String[] args) {
        Bank bank = new Bank();
        BankCondition bankCondition = new BankCondition(7.0, 11);

        Account user = bank.createNewAccount(1000.0, bankCondition);

        Double profit = user.calculateProfit();
        System.out.println(profit);

    }
}
